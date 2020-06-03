package com.bizwink.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class LeaveWord implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.ID
     *
     * @mbggenerated
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.SITEID
     *
     * @mbggenerated
     */
    private BigDecimal siteid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.USERID
     *
     * @mbggenerated
     */
    private String userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.FLAG
     *
     * @mbggenerated
     */
    private BigDecimal flag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.TITLE
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.CONTENT
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.WRITEDATE
     *
     * @mbggenerated
     */
    private Timestamp writedate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.COMPANY
     *
     * @mbggenerated
     */
    private String company;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.LINKMAN
     *
     * @mbggenerated
     */
    private String linkman;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.LINKS
     *
     * @mbggenerated
     */
    private String links;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.ZIP
     *
     * @mbggenerated
     */
    private String zip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.EMAIL
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.PHONE
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.FORMID
     *
     * @mbggenerated
     */
    private BigDecimal formid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.DEPARTMENTID
     *
     * @mbggenerated
     */
    private BigDecimal departmentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.RETCONTENT
     *
     * @mbggenerated
     */
    private String retcontent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.AUDITOR
     *
     * @mbggenerated
     */
    private String auditor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.AUDITFLAG
     *
     * @mbggenerated
     */
    private BigDecimal auditflag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.PROCESSOR
     *
     * @mbggenerated
     */
    private String processor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.MPHONE
     *
     * @mbggenerated
     */
    private String mphone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.COLUMNID
     *
     * @mbggenerated
     */
    private BigDecimal columnid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.CODE
     *
     * @mbggenerated
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.SEX
     *
     * @mbggenerated
     */
    private BigDecimal sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.VALID
     *
     * @mbggenerated
     */
    private BigDecimal valid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.VALIDREASON
     *
     * @mbggenerated
     */
    private String validreason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.DATEFROMDEPT
     *
     * @mbggenerated
     */
    private Date datefromdept;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.FINALFLAG
     *
     * @mbggenerated
     */
    private BigDecimal finalflag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_LEAVEWORD.ENDTOUSER
     *
     * @mbggenerated
     */
    private Date endtouser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.ID
     *
     * @return the value of TBL_LEAVEWORD.ID
     *
     * @mbggenerated
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.ID
     *
     * @param id the value for TBL_LEAVEWORD.ID
     *
     * @mbggenerated
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.SITEID
     *
     * @return the value of TBL_LEAVEWORD.SITEID
     *
     * @mbggenerated
     */
    public BigDecimal getSiteid() {
        return siteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.SITEID
     *
     * @param siteid the value for TBL_LEAVEWORD.SITEID
     *
     * @mbggenerated
     */
    public void setSiteid(BigDecimal siteid) {
        this.siteid = siteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.USERID
     *
     * @return the value of TBL_LEAVEWORD.USERID
     *
     * @mbggenerated
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.USERID
     *
     * @param userid the value for TBL_LEAVEWORD.USERID
     *
     * @mbggenerated
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.FLAG
     *
     * @return the value of TBL_LEAVEWORD.FLAG
     *
     * @mbggenerated
     */
    public BigDecimal getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.FLAG
     *
     * @param flag the value for TBL_LEAVEWORD.FLAG
     *
     * @mbggenerated
     */
    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.TITLE
     *
     * @return the value of TBL_LEAVEWORD.TITLE
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.TITLE
     *
     * @param title the value for TBL_LEAVEWORD.TITLE
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.CONTENT
     *
     * @return the value of TBL_LEAVEWORD.CONTENT
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.CONTENT
     *
     * @param content the value for TBL_LEAVEWORD.CONTENT
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.WRITEDATE
     *
     * @return the value of TBL_LEAVEWORD.WRITEDATE
     *
     * @mbggenerated
     */
    public Timestamp  getWritedate() {
        return writedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.WRITEDATE
     *
     * @param writedate the value for TBL_LEAVEWORD.WRITEDATE
     *
     * @mbggenerated
     */
    public void setWritedate(Timestamp  writedate) {
        this.writedate = writedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.COMPANY
     *
     * @return the value of TBL_LEAVEWORD.COMPANY
     *
     * @mbggenerated
     */
    public String getCompany() {
        return company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.COMPANY
     *
     * @param company the value for TBL_LEAVEWORD.COMPANY
     *
     * @mbggenerated
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.LINKMAN
     *
     * @return the value of TBL_LEAVEWORD.LINKMAN
     *
     * @mbggenerated
     */
    public String getLinkman() {
        return linkman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.LINKMAN
     *
     * @param linkman the value for TBL_LEAVEWORD.LINKMAN
     *
     * @mbggenerated
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.LINKS
     *
     * @return the value of TBL_LEAVEWORD.LINKS
     *
     * @mbggenerated
     */
    public String getLinks() {
        return links;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.LINKS
     *
     * @param links the value for TBL_LEAVEWORD.LINKS
     *
     * @mbggenerated
     */
    public void setLinks(String links) {
        this.links = links == null ? null : links.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.ZIP
     *
     * @return the value of TBL_LEAVEWORD.ZIP
     *
     * @mbggenerated
     */
    public String getZip() {
        return zip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.ZIP
     *
     * @param zip the value for TBL_LEAVEWORD.ZIP
     *
     * @mbggenerated
     */
    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.EMAIL
     *
     * @return the value of TBL_LEAVEWORD.EMAIL
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.EMAIL
     *
     * @param email the value for TBL_LEAVEWORD.EMAIL
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.PHONE
     *
     * @return the value of TBL_LEAVEWORD.PHONE
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.PHONE
     *
     * @param phone the value for TBL_LEAVEWORD.PHONE
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.FORMID
     *
     * @return the value of TBL_LEAVEWORD.FORMID
     *
     * @mbggenerated
     */
    public BigDecimal getFormid() {
        return formid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.FORMID
     *
     * @param formid the value for TBL_LEAVEWORD.FORMID
     *
     * @mbggenerated
     */
    public void setFormid(BigDecimal formid) {
        this.formid = formid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.DEPARTMENTID
     *
     * @return the value of TBL_LEAVEWORD.DEPARTMENTID
     *
     * @mbggenerated
     */
    public BigDecimal getDepartmentid() {
        return departmentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.DEPARTMENTID
     *
     * @param departmentid the value for TBL_LEAVEWORD.DEPARTMENTID
     *
     * @mbggenerated
     */
    public void setDepartmentid(BigDecimal departmentid) {
        this.departmentid = departmentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.RETCONTENT
     *
     * @return the value of TBL_LEAVEWORD.RETCONTENT
     *
     * @mbggenerated
     */
    public String getRetcontent() {
        return retcontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.RETCONTENT
     *
     * @param retcontent the value for TBL_LEAVEWORD.RETCONTENT
     *
     * @mbggenerated
     */
    public void setRetcontent(String retcontent) {
        this.retcontent = retcontent == null ? null : retcontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.AUDITOR
     *
     * @return the value of TBL_LEAVEWORD.AUDITOR
     *
     * @mbggenerated
     */
    public String getAuditor() {
        return auditor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.AUDITOR
     *
     * @param auditor the value for TBL_LEAVEWORD.AUDITOR
     *
     * @mbggenerated
     */
    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.AUDITFLAG
     *
     * @return the value of TBL_LEAVEWORD.AUDITFLAG
     *
     * @mbggenerated
     */
    public BigDecimal getAuditflag() {
        return auditflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.AUDITFLAG
     *
     * @param auditflag the value for TBL_LEAVEWORD.AUDITFLAG
     *
     * @mbggenerated
     */
    public void setAuditflag(BigDecimal auditflag) {
        this.auditflag = auditflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.PROCESSOR
     *
     * @return the value of TBL_LEAVEWORD.PROCESSOR
     *
     * @mbggenerated
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.PROCESSOR
     *
     * @param processor the value for TBL_LEAVEWORD.PROCESSOR
     *
     * @mbggenerated
     */
    public void setProcessor(String processor) {
        this.processor = processor == null ? null : processor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.MPHONE
     *
     * @return the value of TBL_LEAVEWORD.MPHONE
     *
     * @mbggenerated
     */
    public String getMphone() {
        return mphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.MPHONE
     *
     * @param mphone the value for TBL_LEAVEWORD.MPHONE
     *
     * @mbggenerated
     */
    public void setMphone(String mphone) {
        this.mphone = mphone == null ? null : mphone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.COLUMNID
     *
     * @return the value of TBL_LEAVEWORD.COLUMNID
     *
     * @mbggenerated
     */
    public BigDecimal getColumnid() {
        return columnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.COLUMNID
     *
     * @param columnid the value for TBL_LEAVEWORD.COLUMNID
     *
     * @mbggenerated
     */
    public void setColumnid(BigDecimal columnid) {
        this.columnid = columnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.CODE
     *
     * @return the value of TBL_LEAVEWORD.CODE
     *
     * @mbggenerated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.CODE
     *
     * @param code the value for TBL_LEAVEWORD.CODE
     *
     * @mbggenerated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.SEX
     *
     * @return the value of TBL_LEAVEWORD.SEX
     *
     * @mbggenerated
     */
    public BigDecimal getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.SEX
     *
     * @param sex the value for TBL_LEAVEWORD.SEX
     *
     * @mbggenerated
     */
    public void setSex(BigDecimal sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.VALID
     *
     * @return the value of TBL_LEAVEWORD.VALID
     *
     * @mbggenerated
     */
    public BigDecimal getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.VALID
     *
     * @param valid the value for TBL_LEAVEWORD.VALID
     *
     * @mbggenerated
     */
    public void setValid(BigDecimal valid) {
        this.valid = valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.VALIDREASON
     *
     * @return the value of TBL_LEAVEWORD.VALIDREASON
     *
     * @mbggenerated
     */
    public String getValidreason() {
        return validreason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.VALIDREASON
     *
     * @param validreason the value for TBL_LEAVEWORD.VALIDREASON
     *
     * @mbggenerated
     */
    public void setValidreason(String validreason) {
        this.validreason = validreason == null ? null : validreason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.DATEFROMDEPT
     *
     * @return the value of TBL_LEAVEWORD.DATEFROMDEPT
     *
     * @mbggenerated
     */
    public Date getDatefromdept() {
        return datefromdept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.DATEFROMDEPT
     *
     * @param datefromdept the value for TBL_LEAVEWORD.DATEFROMDEPT
     *
     * @mbggenerated
     */
    public void setDatefromdept(Date datefromdept) {
        this.datefromdept = datefromdept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.FINALFLAG
     *
     * @return the value of TBL_LEAVEWORD.FINALFLAG
     *
     * @mbggenerated
     */
    public BigDecimal getFinalflag() {
        return finalflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.FINALFLAG
     *
     * @param finalflag the value for TBL_LEAVEWORD.FINALFLAG
     *
     * @mbggenerated
     */
    public void setFinalflag(BigDecimal finalflag) {
        this.finalflag = finalflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_LEAVEWORD.ENDTOUSER
     *
     * @return the value of TBL_LEAVEWORD.ENDTOUSER
     *
     * @mbggenerated
     */
    public Date getEndtouser() {
        return endtouser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_LEAVEWORD.ENDTOUSER
     *
     * @param endtouser the value for TBL_LEAVEWORD.ENDTOUSER
     *
     * @mbggenerated
     */
    public void setEndtouser(Date endtouser) {
        this.endtouser = endtouser;
    }
}