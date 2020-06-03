<%@ page import="java.util.*,
                 com.bizwink.cms.security.*,
                 com.bizwink.cms.viewFileManager.*,
                 com.bizwink.cms.markManager.*,
                 com.bizwink.cms.util.*,
                 com.bizwink.cms.xml.*,
                 com.bizwink.cms.news.*"
         contentType="text/html;charset=utf-8"
        %>

<%
    request.setCharacterEncoding("utf-8");
    Auth authToken = SessionUtil.getUserAuthorization(request, response, session);
    if (authToken == null) {
        response.sendRedirect(response.encodeRedirectURL("../login.jsp?msg=系统超时，请重新登陆!"));
        return;
    }

    int siteID = authToken.getSiteID();
    int columnID = ParamUtil.getIntParameter(request, "column", 0);
    int markID = ParamUtil.getIntParameter(request, "mark", 0);
    boolean doCreate = ParamUtil.getBooleanParameter(request, "doCreate");
    IViewFileManager viewfileMgr = viewFilePeer.getInstance();
    IMarkManager markMgr = markPeer.getInstance();

    int listType = 0;
    int innerFlag = 0;
    int maintitle_size = 0;
    int vicetitle_size = 0;
    int content_size = 0;
    int source_size = 0;
    int author_size = 0;
    int summary_size = 0;
    int order = 0;
    String notes = "";
    String cname = "热点文章";
    String datestyle = "";
    String timestyle = "";
    List ids = new ArrayList();

    if (doCreate) {
        cname = ParamUtil.getParameter(request, "chineseName");
        notes = ParamUtil.getParameter(request, "notes");
        listType = ParamUtil.getIntParameter(request, "listType", 0);
        String content = ParamUtil.getParameter(request, "contents");
        String relatedCID = "()";

        mark mark = new mark();
        mark.setID(markID);
        mark.setColumnID(columnID);
        mark.setSiteID(siteID);
        mark.setContent(content);
        mark.setMarkType(3);
        mark.setChinesename(cname);
        mark.setNotes(notes);
        mark.setInnerHTMLFlag(0);
        mark.setFormatFileNum(listType);
        mark.setRelatedColumnID(relatedCID);

        int orgmarkid = markID;
        if (markID > 0)
            markMgr.Update(mark);
        else
            markID = markMgr.Create(mark);

        String viewer = request.getHeader("user-agent");
        if (orgmarkid > 0) {
            out.println("<script>top.close();</script>");
        } else {
            String returnvalue = "[TAG][MARKID]" + markID + "_" + columnID + "[/MARKID][/TAG]";
            out.println("<script>var returnvalue = \"<INPUT name='" + returnvalue + "' type=button value='[" + cname + "]' style='BORDER-RIGHT: #808080 1px solid; BORDER-TOP: #808080 1px solid; FONT-SIZE: 12px; BORDER-LEFT: #808080 1px solid; BORDER-BOTTOM: #808080 1px solid; BACKGROUND-COLOR: #D6D3CE'>\";" +
                    "window.parent.parent.opener.InsertHTML(returnvalue);top.close();</script>");
        }

        return;
    }

    if (markID > 0) {
        String str = StringUtil.gb2iso4View(markMgr.getAMarkContent(markID));
        str = StringUtil.replace(str, "[", "<");
        str = StringUtil.replace(str, "]", ">");
        XMLProperties properties = new XMLProperties("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + str);
        listType = Integer.parseInt(properties.getProperty(properties.getName().concat(".LISTTYPE")));
        String articleIDs = properties.getProperty(properties.getName().concat(".ARTICLE.ID"));
        IArticleManager articleMgr = ArticlePeer.getInstance();
        ids = articleMgr.getArticleMainTitle(articleIDs);
        maintitle_size = Integer.parseInt(properties.getProperty(properties.getName().concat(".ARTICLE_MAINTITLE")));
        vicetitle_size = Integer.parseInt(properties.getProperty(properties.getName().concat(".ARTICLE_VICETITLE")));
        content_size = Integer.parseInt(properties.getProperty(properties.getName().concat(".ARTICLE_CONTENT")));
        source_size = Integer.parseInt(properties.getProperty(properties.getName().concat(".ARTICLE_SOURCE")));
        author_size = Integer.parseInt(properties.getProperty(properties.getName().concat(".ARTICLE_AUTHOR")));
        summary_size = Integer.parseInt(properties.getProperty(properties.getName().concat(".ARTICLE_SUMMARY")));
        String style = properties.getProperty(properties.getName().concat(".ARTICLE_TIME"));
        datestyle = style.substring(0, style.indexOf(","));
        timestyle = style.substring(style.indexOf(",") + 1);
        if (properties.getProperty(properties.getName().concat(".ORDER")) != null)
            order = Integer.parseInt(properties.getProperty(properties.getName().concat(".ORDER")));

        innerFlag = Integer.parseInt(properties.getProperty(properties.getName().concat(".INNERHTMLFLAG")));
        cname = properties.getProperty(properties.getName().concat(".CHINESENAME"));
        notes = properties.getProperty(properties.getName().concat(".NOTES"));
        if (notes == null) notes = "";
    }

    List list = viewfileMgr.getViewFileC(authToken.getSiteID(), 4);
%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel=stylesheet type="text/css" href="style.css">
    <script language="JavaScript" src="../js/jquery-1.12.4.js"></script>
    <script language="javascript" src="../js/mark.js"></script>
</head>

<body>
<form action="topStories_23.jsp" method="POST" name=markForm>
<input type=hidden name=doCreate value=true>
<input type=hidden name=column value="<%=columnID%>">
<input type=hidden name=mark value="<%=markID%>">
<input type=hidden name=contents>
<table width="100%" border=0 cellpadding=4 cellspacing=1 bgcolor="#CCCCCC">
    <tr bgcolor="#F5F5F5">
        <td width="50%">选中的文章：<br>
            <table>
                <tr>
                    <td>
                        <select id="selectedArticle" name="selectedArticle" style="width:260" size="4">
                            <%
                                for (int i = 0; i < ids.size(); i++) {
                                    String temp = (String) ids.get(i);
                                    out.println("<option value=\"" + temp.substring(0, temp.indexOf("|")) + "\">" + StringUtil.gb2iso4View(temp.substring(temp.indexOf("|") + 1)) + "</option>");
                                }
                            %>
                        </select></td>
                    <td>
                        <input type="button" name="delete" value="删除" onclick="delArticleItem();"
                               style="height:20px;width:50px;font-size:9pt">
                    </td>
                </tr>
            </table>
        </td>
        <td width="50%">
            <table width="100%" border=0>
                <tr>
                    <td><input type=radio name=order value=0 <%if(order==0){%> checked<%}%>>按当前顺序<input type=radio
                                                                                                        name=order
                                                                                                        value=1 <%if(order==1){%>
                                                                                                        checked<%}%>>按时间逆序
                    </td>
                </tr>
                <tr height=30>
                    <td>列表样式：
                        <select id="listType" name="listType" style="font-size:9pt;width:150">
                            <option value=0>请选择样式文件</option>
                            <%
                                for (int i = 0; i < list.size(); i++) {
                                    ViewFile viewfile = (ViewFile) list.get(i);
                            %>
                            <option value="<%=viewfile.getID()%>" <%if (viewfile.getID() == listType) {%>
                                    selected<%}%>><%=
                                StringUtil.gb2iso4View(viewfile.getChineseName())%>
                            </option>
                            <%}%>
                        </select>
                        <input type="button" style="height:20px;width:50px;font-size:9pt" onclick="createStyle(4,<%=columnID%>)" value="新建">
                        <input type="button" style="height:20px;width:50px;font-size:9pt" onclick="updateStyle(4,listType.options[listType.selectedIndex].value,<%=columnID%>)" value="修改">
                        <input type="button" style="height:20px;width:50px;font-size:9pt" onclick="previewStyle(4,listType.options[listType.selectedIndex].value)" value="预览">
                    </td>
                </tr>
            </table>
        </td>
    </tr>
</table>

<table width="100%" border=0 cellpadding=4 cellspacing=1 bgcolor="#CCCCCC">
    <tr bgcolor="#F5F5F5">
        <td width="25%">文章标题：字数&nbsp;<input name=maintitle size=6 value="<%=maintitle_size%>"></td>
        <td width="25%">副&nbsp;标&nbsp;题：字数&nbsp;<input name=vicetitle size=6 value="<%=vicetitle_size%>"></td>
        <td width="25%">文章内容：字数&nbsp;<input name=content size=6 value="<%=content_size%>"></td>
        <td width="25%">文章摘要：字数&nbsp;<input name=summary size=6 value="<%=summary_size%>"></td>
    </tr>
    <tr bgcolor="#F5F5F5">
        <td width="25%">文章作者：字数&nbsp;<input name=author size=6 value="<%=author_size%>"></td>
        <td width="25%">文章来源：字数&nbsp;<input name=source size=6 value="<%=source_size%>"></td>
        <td width="50%" colspan=2>发布时间：样式
            <select name="datestyle" style="width:116">
                <option value="">日期样式</option>
                <option value="yyyy/MM/dd" <%if (datestyle.equals("yyyy/MM/dd")) {%> selected<%}%>>YYYY/MM/DD</option>
                <option value="MM/dd/yyyy" <%if (datestyle.equals("MM/dd/yyyy")) {%> selected<%}%>>MM/DD/YYYY</option>
                <option value="yyyy-MM-dd" <%if (datestyle.equals("yyyy-MM-dd")) {%> selected<%}%>>YYYY-MM-DD</option>
                <option value="MM-dd-yyyy" <%if (datestyle.equals("MM-dd-yyyy")) {%> selected<%}%>>MM-DD-YYYY</option>
                <option value="yyyy年MM月dd日" <%if (datestyle.equals("yyyy年MM月dd日")) {%> selected<%}%>>YYYY年MM月DD日
                </option>
                <option value="MM月dd日" <%if (datestyle.equals("MM月dd日")) {%> selected<%}%>>MM月DD日</option>
                <option value="dd日" <%if (datestyle.equals("dd日")) {%> selected<%}%>>DD日</option>
            </select>
            <select name="timestyle" style="width:90">
                <option value="">时间样式</option>
                <option value="HH:mm:ss" <%if (timestyle.equals("HH:mm:ss")) {%> selected<%}%>>HH:MM:SS</option>
                <option value="HH:mm" <%if (timestyle.equals("HH:mm")) {%> selected<%}%>>HH:MM</option>
                <option value="mm" <%if (timestyle.equals("mm")) {%> selected<%}%>>HH</option>
            </select>
        </td>
    </tr>
</table>

<table width="100%" border=0 cellpadding=4 cellspacing=1 bgcolor="#CCCCCC">
    <tr bgcolor="#F5F5F5">
        <td width="50%">
            <p>标记中文名称：&nbsp;<input name=chineseName size=20 value="<%=cname%>"></p>
            <p>标记是否要生成包含文件：
                <input type=radio name=innerFlag value=0 <%if(innerFlag==0){%> checked<%}%>>否&nbsp;&nbsp;
                <input type=radio name=innerFlag value=1  <%if(innerFlag==1){%> checked<%}%>>是
            </p>
        </td>
        <td width="50%">
            标记描述：<textarea rows="4" id="notes" cols="37"><%=notes%>
        </textarea>
        </td>
    </tr>
    <tr bgcolor="#F5F5F5" height=40>
        <td align="center" colspan=2>
            <input type="button" value="  确定  " onclick="createTopStories(0);">&nbsp;&nbsp;
            <input type="button" value="  取消  " onclick="top.close();">
        </td>
    </tr>
</table>
</form>
</body>
</html>
