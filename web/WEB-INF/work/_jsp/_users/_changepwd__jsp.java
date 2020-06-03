/*
 * JSP generated by Resin-4.0.64 (built Tue, 11 Feb 2020 02:03:15 PST)
 */

package _jsp._users;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import org.springframework.context.ApplicationContext;
import java.math.BigDecimal;
import com.bizwink.util.*;
import com.bizwink.po.Users;
import com.bizwink.security.Auth;
import com.bizwink.service.IUserService;

public class _changepwd__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  private boolean _caucho_isNotModified;
  private com.caucho.jsp.PageManager _jsp_pageManager;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    com.caucho.jsp.PageContextImpl pageContext = _jsp_pageManager.allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);

    TagState _jsp_state = null;

    try {
      _jspService(request, response, pageContext, _jsp_application, session, _jsp_state);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      _jsp_pageManager.freePageContext(pageContext);
    }
  }
  
  private void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response,
              com.caucho.jsp.PageContextImpl pageContext,
              javax.servlet.ServletContext application,
              javax.servlet.http.HttpSession session,
              TagState _jsp_state)
    throws Throwable
  {
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    javax.servlet.jsp.tagext.JspTag _jsp_parent_tag = null;
    com.caucho.jsp.PageContextImpl _jsp_parentContext = pageContext;
    response.setContentType("text/html;charset=UTF-8");

    out.write(_jsp_string0, 0, _jsp_string0.length);
    
  Auth authToken = SessionUtil.getUserAuthorization(request, response, session);
  if (authToken==null) response.sendRedirect("/users/login.jsp");
  String userid = authToken.getUserid();
  BigDecimal siteid = BigDecimal.valueOf(1);
  Users user = null;
  int errcode = 0;
  ApplicationContext appContext = SpringInit.getApplicationContext();
  if (appContext!=null) {
    IUserService usersService = (IUserService)appContext.getBean("usersService");
    user = usersService.getUserinfoByUserid(userid);
    if (user==null) {
      response.sendRedirect("/users/error.jsp");
      return;
    } else {
      String yzcode = filter.excludeHTMLCode(ParamUtil.getParameter(request, "yzcode"));
      String yzcodeForSession = (String)session.getAttribute("randnum");
      boolean doUpdate = ParamUtil.getBooleanParameter(request,"doUpdate");
      if (doUpdate) {
        String oldpass = filter.excludeHTMLCode(ParamUtil.getParameter(request, "oldpwd"));
        String pass = filter.excludeHTMLCode(ParamUtil.getParameter(request, "pwd"));
        String confpass = filter.excludeHTMLCode(ParamUtil.getParameter(request, "repwd"));
        String password = null;
        try {
          password = Encrypt.md5(oldpass.getBytes());
          if (yzcode.equalsIgnoreCase(yzcodeForSession)) {           //\u9a8c\u8bc1\u7801\u8f93\u5165\u6b63\u786e\u624d\u53ef\u4ee5\u8fdb\u884c\u5bc6\u7801\u4fee\u6539
            if (password.equalsIgnoreCase(user.getUSERPWD())) {          //\u7528\u6237\u8f93\u5165\u7684\u8001\u5bc6\u7801\u6b63\u786e\u624d\u53ef\u4ee5\u6267\u884c\u5bc6\u7801\u4fee\u6539
              if(pass.equals(confpass)) {                                //\u7528\u6237\u4e24\u6b21\u8f93\u5165\u65b0\u5bc6\u7801\u76f8\u540c\u4fee\u6539\u5bc6\u7801
                errcode = usersService.changePassword(userid,Encrypt.md5(pass.getBytes()));
              } else {
                errcode = -4;
              }
            } else {
              errcode = -3;
            }
          } else {
            errcode = -1;
          }
        } catch (Exception e) {
          errcode = -2;
        }
      }
    }
  } else {
    response.sendRedirect("/users/error.jsp");
    return;
  }

    out.write(_jsp_string1, 0, _jsp_string1.length);
    out.print((errcode));
    out.write(_jsp_string2, 0, _jsp_string2.length);
    out.print((user.getNICKNAME()));
    out.write(_jsp_string3, 0, _jsp_string3.length);
  }

  private com.caucho.make.DependencyContainer _caucho_depends
    = new com.caucho.make.DependencyContainer();

  public java.util.ArrayList<com.caucho.vfs.Dependency> _caucho_getDependList()
  {
    return _caucho_depends.getDependencies();
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    _caucho_depends.add(depend);
  }

  protected void _caucho_setNeverModified(boolean isNotModified)
  {
    _caucho_isNotModified = true;
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;

    if (_caucho_isNotModified)
      return false;

    if (com.caucho.server.util.CauchoSystem.getVersionId() != 8379650030320138497L)
      return true;

    return _caucho_depends.isModified();
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
    TagState tagState;
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("users/changePwd.jsp"), 2699239648455125244L, false);
    _caucho_depends.add(depend);
    loader.addDependency(depend);
  }

  final static class TagState {

    void release()
    {
    }
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void caucho_init(ServletConfig config)
  {
    try {
      com.caucho.server.webapp.WebApp webApp
        = (com.caucho.server.webapp.WebApp) config.getServletContext();
      init(config);
      if (com.caucho.jsp.JspManager.getCheckInterval() >= 0)
        _caucho_depends.setCheckInterval(com.caucho.jsp.JspManager.getCheckInterval());
      _jsp_pageManager = webApp.getJspApplicationContext().getPageManager();
      com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
      com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.InitPageContextImpl(webApp, this);
    } catch (Exception e) {
      throw com.caucho.config.ConfigException.create(e);
    }
  }

  private final static char []_jsp_string1;
  private final static char []_jsp_string0;
  private final static char []_jsp_string2;
  private final static char []_jsp_string3;
  static {
    _jsp_string1 = "\r\n\r\n<!doctype html>\r\n<html>\r\n<head>\r\n  <meta charset=\"utf-8\">\r\n  <title>\u5317\u4eac\u5e02\u897f\u57ce\u533a\u516c\u5171\u8d44\u6e90\u4ea4\u6613\u7cfb\u7edf--\u7528\u6237\u4e2a\u4eba\u4e2d\u5fc3--\u516c\u53f8\u4fe1\u606f\u7ba1\u7406</title>\r\n  <link href=\"/ggzyjy/css/base.css\" rel=\"stylesheet\" type=\"text/css\">\r\n  <link href=\"/ggzyjy/css/program_style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n  <link href=\"/ggzyjy/css/index.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n  <link href=\"/ggzyjy/css/jquery-ui.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n  <link href=\"/ggzyjy/css/jquery.msgbox.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n\r\n  <script src=\"/ggzyjy/js/jquery-1.11.1.min.js\" type=\"text/javascript\"></script>\r\n  <script src=\"/ggzyjy/js/jquery-ui.js\" language=\"javascript\" type=\"text/javascript\"></script>\r\n  <script src=\"/ggzyjy/js/md5-min.js\" type=\"text/javascript\"></script>\r\n  <script src=\"/ggzyjy/js/jquery.dragndrop.min.js\" type=\"text/javascript\"></script>\r\n  <script src=\"/ggzyjy/js/jquery.msgbox.min.js\" type=\"text/javascript\"></script>\r\n  <script src=\"/ggzyjy/js/users.js\" type=\"text/javascript\"></script>\r\n  <script language=\"javascript\">\r\n      var errcode = ".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string2 = ";\r\n      $(document).ready(function(){\r\n          if (errcode == -2) {\r\n              $(\"#usermsg\").html(\"\u7528\u6237\u65e7\u5bc6\u7801\u8f6c\u6362MD5\u62a5\u9519\");\r\n              $(\"#usermsg\").css({color:\"red\"});\r\n          } else if (errcode == -3) {\r\n              $(\"#usermsg\").html(\"\u7528\u6237\u8f93\u5165\u65e7\u5bc6\u7801\u9519\");\r\n              $(\"#usermsg\").css({color:\"red\"});\r\n          } else if (errcode == -1) {\r\n              $(\"#usermsg\").html(\"\u7528\u6237\u8f93\u5165\u9a8c\u8bc1\u7801\u9519\");\r\n              $(\"#usermsg\").css({color:\"red\"});\r\n          } else if (errcode == -4) {\r\n              $(\"#usermsg\").html(\"\u65b0\u5bc6\u7801\u4e24\u6b21\u8f93\u5165\u4e0d\u4e00\u81f4\");\r\n              $(\"#usermsg\").css({color:\"red\"});\r\n          } else if (errcode > 0) {\r\n              alert(\"\u7528\u6237\u5bc6\u7801\u4fee\u6539\u6210\u529f\");\r\n              window.location.href=\"/users/changePwd.jsp\";\r\n          }\r\n      })\r\n\r\n      function tijiao(form) {\r\n          var oldpass = form.oldpwd.value;\r\n          var pass = form.pwd.value;\r\n          var confpass = form.repwd.value;\r\n          var yzcode = form.yzcode.value;\r\n\r\n          if (oldpass == \"\") {\r\n              alert(\"\u65e7\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a\");\r\n              return false;\r\n          }\r\n\r\n          if (pass.length < 8) {\r\n              alert(\"\u5bc6\u7801\u4e0d\u80fd\u5c0f\u4e8e8\u4f4d\");\r\n              return false;\r\n          }\r\n\r\n          if (pass != confpass) {\r\n              alert(\"\u65b0\u5bc6\u7801\u4e24\u6b21\u586b\u5199\u4e0d\u4e00\u81f4\");\r\n              return false;\r\n          }\r\n\r\n          //if (yzcode == \"\" || yzcode.length != 4) {\r\n          //    alert(\"\u9a8c\u8bc1\u7801\u4e0d\u6b63\u786e\");\r\n          //    return false;\r\n          //}\r\n\r\n          return true;\r\n      }\r\n\r\n      function sendyzcode() {\r\n          alert(\"send code to mphone\");\r\n      }\r\n\r\n      function logoff(prefix) {\r\n          $.post(\"/users/logoff.jsp\",{},\r\n              function(data) {\r\n                  if (data.indexOf(\"nologin\") > -1) {\r\n                      window.location.href=\"/index.shtml\";\r\n                  }\r\n              }\r\n          )\r\n      }\r\n\r\n  </script>\r\n</head>\r\n\r\n<body style=\"background-image: url('');height: 600px;\">\r\n<div class=\"top_box\">\r\n  <div class=\"logo_box\">\r\n    <a href=\"/ggzyjy/\" style=\"color: white\">\u5317\u4eac\u5e02\u897f\u57ce\u533a\u516c\u5171\u8d44\u6e90\u4ea4\u6613\u4e2d\u5fc3</a>\r\n    <div class=\"reg_in\" id=\"userInfos\"><a href=\"/users/login.jsp\">\u767b\u5f55</a>|<a href=\"/users/userreg1.jsp\">\u6ce8\u518c</a></div>\r\n  </div>\r\n</div>\r\n\r\n<!--\u4ee5\u4e0a\u9875\u9762\u5934-->\r\n<div class=\"main clearfix div_top div_bottom\">\r\n  <div class=\"companyinfo_left\">\r\n    <div class=\"title\">\u4e2a\u4eba\u4e2d\u5fc3</div>\r\n    <ul>\r\n      <li>\u6295\u6807\u9879\u76ee\u7ba1\u7406</li>\r\n      <!--li><a href=\"/users/personinfo.jsp?action=2\">\u6388\u4fe1\u7533\u8bf7\u7ba1\u7406</a></li>\r\n      <li><a href=\"/users/personinfo.jsp?action=3\">\u4fdd\u8bc1\u91d1\u7ba1\u7406</a></li-->\r\n      <li><a href=\"/users/companyinfo.jsp\">\u516c\u53f8\u4fe1\u606f\u7ba1\u7406</a></li>\r\n      <li><a href=\"/users/updatereg.jsp\">\u4fee\u6539\u4e2a\u4eba\u6ce8\u518c\u4fe1\u606f</a></li>\r\n      <li><a href=\"/users/changePwd.jsp\">\u4fee\u6539\u5bc6\u7801</a></li>\r\n    </ul>\r\n  </div>\r\n  <div class=\"personal_right_box\">\r\n    <div class=\"personal_right\">\r\n      <div class=\"p_r_title\">\u4fee\u6539\u5bc6\u7801</div>\r\n    </div>\r\n    <form name=\"regform\" method=\"post\" action=\"changePwd.jsp\" onsubmit=\"return tijiao(regform)\">\r\n      <input type=\"hidden\" name=\"doUpdate\" value=\"true\">\r\n      <table width=\"875\" border=\"0\" cellspacing=\"3\" cellpadding=\"0\" class=\"regtable\">\r\n        <tbody><tr>\r\n          <td width=\"215\" align=\"right\" valign=\"middle\"></td>\r\n          <td width=\"660\" height=\"40\" align=\"left\" valign=\"bottom\"> </td>\r\n        </tr>\r\n        <tr>\r\n          <td align=\"right\" valign=\"middle\"><span class=\"hint_red\">*</span> \u7528\u6237\u540d\uff1a</td>\r\n          <td align=\"left\" valign=\"middle\">".toCharArray();
    _jsp_string3 = "</td>\r\n        </tr>\r\n        <tr>\r\n          <td align=\"right\" valign=\"middle\"></td>\r\n          <td align=\"left\" valign=\"bottom\" height=\"20\"> </td>\r\n        </tr>\r\n        <tr>\r\n          <td align=\"right\" valign=\"middle\"><span class=\"hint_red\">*</span> \u65e7\u5bc6\u7801\uff1a</td>\r\n          <td align=\"left\" valign=\"middle\"><input type=\"password\" name=\"oldpwd\" class=\"input_txt\" autocomplete=\"new-password\" size=\"25\">\r\n            \u5927\u5199\u5c0f\u5199\u53ca\u6570\u5b57\u7ec4\u6210\uff01</td>\r\n        </tr>\r\n        <tr>\r\n          <td align=\"right\" valign=\"middle\"></td>\r\n          <td height=\"20\" align=\"left\" valign=\"bottom\" class=\"w_red\"></td>\r\n        </tr>\r\n        <tr>\r\n          <td align=\"right\" valign=\"middle\"><span class=\"hint_red\">*</span> \u65b0\u5bc6\u7801\uff1a</td>\r\n          <td align=\"left\" valign=\"middle\"><input type=\"password\" name=\"pwd\" class=\"input_txt\" autocomplete=\"new-password\" size=\"25\">\r\n            \u5927\u5199\u5c0f\u5199\u53ca\u6570\u5b57\u7ec4\u6210\uff01</td>\r\n        </tr>\r\n        <tr>\r\n          <td align=\"right\" valign=\"middle\"></td>\r\n          <td height=\"20\" align=\"left\" valign=\"bottom\" class=\"w_red\"></td>\r\n        </tr>\r\n        <tr>\r\n          <td align=\"right\" valign=\"middle\"><span class=\"hint_red\">*</span> \u786e\u8ba4\u5bc6\u7801</td>\r\n          <td align=\"left\" valign=\"middle\"><input type=\"password\" name=\"repwd\" class=\"input_txt\" autocomplete=\"new-password\" size=\"25\"></td>\r\n        </tr>\r\n        <tr>\r\n          <td align=\"right\" valign=\"middle\"></td>\r\n          <td height=\"20\" align=\"left\" valign=\"bottom\" class=\"w_red\"></td>\r\n        </tr>\r\n        <tr>\r\n          <td align=\"right\" valign=\"middle\">\u9a8c\u8bc1\u7801\uff1a</td>\r\n          <td align=\"left\" valign=\"middle\"><span style=\"float:left; display:block\"><input type=\"text\" name=\"yzcode\" autocomplete=\"off\" class=\"input_txt\" size=\"15\" autocomplete=\"off\"></span>\r\n            <span style=\"float:left; display:block; margin-left:10px;\"><img src=\"/users/image.jsp\" height=\"40px\" id=\"yzImageID\" name=\"yzcodeimage\" align=\"absmiddle\"/></span><span><a href=\"javascript:change_yzcodeimage();\">\u770b\u4e0d\u6e05\uff0c\u6362\u4e00\u5f20</a></span></td>\r\n        </tr>\r\n        <!--tr>\r\n          <td align=\"right\" valign=\"middle\">\u624b\u673a\u9a8c\u8bc1\u7801\uff1a</td>\r\n          <td><span style=\"float:left; display:block\"><input type=\"text\" name=\"yzcode\" class=\"input_txt\" size=\"15\"></span>\r\n            <span style=\"float:left; display:block; margin-left:10px;\"><a href=\"javascript:sendyzcode();\">\u5411\u6ce8\u518c\u624b\u673a\u53d1\u9001\u9a8c\u8bc1\u5417</a></span></td>\r\n        </tr-->\r\n        <tr>\r\n          <td align=\"right\" valign=\"middle\"></td>\r\n          <td align=\"left\" valign=\"bottom\" height=\"20\"> </td>\r\n        </tr>\r\n        <tr>\r\n          <td align=\"right\" valign=\"middle\"></td>\r\n          <td><input name=\"ok\" type=\"submit\" class=\"regist_btn\" value=\"\u786e\u8ba4\"></td>\r\n        </tr>\r\n        <tr>\r\n          <td align=\"right\" valign=\"middle\" height=\"80\"></td>\r\n          <td></td>\r\n        </tr>\r\n        </tbody>\r\n      </table>\r\n    </form>\r\n  </div>\r\n</div>\r\n<!--\u4ee5\u4e0b\u9875\u9762\u5c3e-->\r\n</body>\r\n</html>\r\n".toCharArray();
  }
}
