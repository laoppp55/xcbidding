package com.bizwink.po;

import java.util.Date;

public class EvalBidingMethodBrief {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_evalbidingmethodbrief.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_evalbidingmethodbrief.Purchaseprojcode
     *
     * @mbggenerated
     */
    private String purchaseprojcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_evalbidingmethodbrief.Brief
     *
     * @mbggenerated
     */
    private String brief;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_evalbidingmethodbrief.Creator
     *
     * @mbggenerated
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_evalbidingmethodbrief.Createtime
     *
     * @mbggenerated
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_evalbidingmethodbrief.id
     *
     * @return the value of tbl_evalbidingmethodbrief.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_evalbidingmethodbrief.id
     *
     * @param id the value for tbl_evalbidingmethodbrief.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_evalbidingmethodbrief.Purchaseprojcode
     *
     * @return the value of tbl_evalbidingmethodbrief.Purchaseprojcode
     *
     * @mbggenerated
     */
    public String getPurchaseprojcode() {
        return purchaseprojcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_evalbidingmethodbrief.Purchaseprojcode
     *
     * @param purchaseprojcode the value for tbl_evalbidingmethodbrief.Purchaseprojcode
     *
     * @mbggenerated
     */
    public void setPurchaseprojcode(String purchaseprojcode) {
        this.purchaseprojcode = purchaseprojcode == null ? null : purchaseprojcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_evalbidingmethodbrief.Brief
     *
     * @return the value of tbl_evalbidingmethodbrief.Brief
     *
     * @mbggenerated
     */
    public String getBrief() {
        return brief;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_evalbidingmethodbrief.Brief
     *
     * @param brief the value for tbl_evalbidingmethodbrief.Brief
     *
     * @mbggenerated
     */
    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_evalbidingmethodbrief.Creator
     *
     * @return the value of tbl_evalbidingmethodbrief.Creator
     *
     * @mbggenerated
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_evalbidingmethodbrief.Creator
     *
     * @param creator the value for tbl_evalbidingmethodbrief.Creator
     *
     * @mbggenerated
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_evalbidingmethodbrief.Createtime
     *
     * @return the value of tbl_evalbidingmethodbrief.Createtime
     *
     * @mbggenerated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_evalbidingmethodbrief.Createtime
     *
     * @param createtime the value for tbl_evalbidingmethodbrief.Createtime
     *
     * @mbggenerated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}