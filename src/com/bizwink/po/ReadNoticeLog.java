package com.bizwink.po;

import java.util.Date;

public class ReadNoticeLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_read_notice_log.uuid
     *
     * @mbggenerated
     */
    private String uuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_read_notice_log.noticeid
     *
     * @mbggenerated
     */
    private String noticeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_read_notice_log.userid
     *
     * @mbggenerated
     */
    private String userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_read_notice_log.noticetitle
     *
     * @mbggenerated
     */
    private String noticetitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_read_notice_log.creationdate
     *
     * @mbggenerated
     */
    private Date creationdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_read_notice_log.uuid
     *
     * @return the value of tbl_read_notice_log.uuid
     *
     * @mbggenerated
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_read_notice_log.uuid
     *
     * @param uuid the value for tbl_read_notice_log.uuid
     *
     * @mbggenerated
     */
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_read_notice_log.noticeid
     *
     * @return the value of tbl_read_notice_log.noticeid
     *
     * @mbggenerated
     */
    public String getNoticeid() {
        return noticeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_read_notice_log.noticeid
     *
     * @param noticeid the value for tbl_read_notice_log.noticeid
     *
     * @mbggenerated
     */
    public void setNoticeid(String noticeid) {
        this.noticeid = noticeid == null ? null : noticeid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_read_notice_log.userid
     *
     * @return the value of tbl_read_notice_log.userid
     *
     * @mbggenerated
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_read_notice_log.userid
     *
     * @param userid the value for tbl_read_notice_log.userid
     *
     * @mbggenerated
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_read_notice_log.noticetitle
     *
     * @return the value of tbl_read_notice_log.noticetitle
     *
     * @mbggenerated
     */
    public String getNoticetitle() {
        return noticetitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_read_notice_log.noticetitle
     *
     * @param noticetitle the value for tbl_read_notice_log.noticetitle
     *
     * @mbggenerated
     */
    public void setNoticetitle(String noticetitle) {
        this.noticetitle = noticetitle == null ? null : noticetitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_read_notice_log.creationdate
     *
     * @return the value of tbl_read_notice_log.creationdate
     *
     * @mbggenerated
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_read_notice_log.creationdate
     *
     * @param creationdate the value for tbl_read_notice_log.creationdate
     *
     * @mbggenerated
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }
}