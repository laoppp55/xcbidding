package com.bizwink.po;

public class AuditItemsforSessions {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_audititemsforsessions.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_audititemsforsessions.Itemid
     *
     * @mbggenerated
     */
    private Long itemid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_audititemsforsessions.purchasesectioncode
     *
     * @mbggenerated
     */
    private String purchasesectioncode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_audititemsforsessions.id
     *
     * @return the value of tbl_audititemsforsessions.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_audititemsforsessions.id
     *
     * @param id the value for tbl_audititemsforsessions.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_audititemsforsessions.Itemid
     *
     * @return the value of tbl_audititemsforsessions.Itemid
     *
     * @mbggenerated
     */
    public Long getItemid() {
        return itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_audititemsforsessions.Itemid
     *
     * @param itemid the value for tbl_audititemsforsessions.Itemid
     *
     * @mbggenerated
     */
    public void setItemid(Long itemid) {
        this.itemid = itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_audititemsforsessions.purchasesectioncode
     *
     * @return the value of tbl_audititemsforsessions.purchasesectioncode
     *
     * @mbggenerated
     */
    public String getPurchasesectioncode() {
        return purchasesectioncode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_audititemsforsessions.purchasesectioncode
     *
     * @param purchasesectioncode the value for tbl_audititemsforsessions.purchasesectioncode
     *
     * @mbggenerated
     */
    public void setPurchasesectioncode(String purchasesectioncode) {
        this.purchasesectioncode = purchasesectioncode == null ? null : purchasesectioncode.trim();
    }
}