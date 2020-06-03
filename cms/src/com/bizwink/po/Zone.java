package com.bizwink.po;

import java.io.Serializable;
import java.math.BigDecimal;

public class Zone implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EN_ZONE.ID
     *
     * @mbggenerated
     */
    private BigDecimal ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EN_ZONE.CITYID
     *
     * @mbggenerated
     */
    private BigDecimal CITYID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EN_ZONE.ZONENAME
     *
     * @mbggenerated
     */
    private String ZONENAME;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EN_ZONE.ORDERID
     *
     * @mbggenerated
     */
    private BigDecimal ORDERID;

    private BigDecimal VALID;

    private String CODE;

    private String SELFCODE;

    private String PSELFCODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EN_ZONE.ID
     *
     * @return the value of EN_ZONE.ID
     *
     * @mbggenerated
     */
    public BigDecimal getID() {
        return ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EN_ZONE.ID
     *
     * @param ID the value for EN_ZONE.ID
     *
     * @mbggenerated
     */
    public void setID(BigDecimal ID) {
        this.ID = ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EN_ZONE.CITYID
     *
     * @return the value of EN_ZONE.CITYID
     *
     * @mbggenerated
     */
    public BigDecimal getCITYID() {
        return CITYID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EN_ZONE.CITYID
     *
     * @param CITYID the value for EN_ZONE.CITYID
     *
     * @mbggenerated
     */
    public void setCITYID(BigDecimal CITYID) {
        this.CITYID = CITYID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EN_ZONE.ZONENAME
     *
     * @return the value of EN_ZONE.ZONENAME
     *
     * @mbggenerated
     */
    public String getZONENAME() {
        return ZONENAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EN_ZONE.ZONENAME
     *
     * @param ZONENAME the value for EN_ZONE.ZONENAME
     *
     * @mbggenerated
     */
    public void setZONENAME(String ZONENAME) {
        this.ZONENAME = ZONENAME == null ? null : ZONENAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EN_ZONE.ORDERID
     *
     * @return the value of EN_ZONE.ORDERID
     *
     * @mbggenerated
     */
    public BigDecimal getORDERID() {
        return ORDERID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EN_ZONE.ORDERID
     *
     * @param ORDERID the value for EN_ZONE.ORDERID
     *
     * @mbggenerated
     */
    public void setORDERID(BigDecimal ORDERID) {
        this.ORDERID = ORDERID;
    }

    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE;
    }

    public BigDecimal getVALID() {
        return VALID;
    }

    public void setVALID(BigDecimal VALID) {
        this.VALID = VALID;
    }

    public String getSELFCODE() {
        return SELFCODE;
    }

    public void setSELFCODE(String SELFCODE) {
        this.SELFCODE = SELFCODE;
    }

    public String getPSELFCODE() {
        return PSELFCODE;
    }

    public void setPSELFCODE(String PSELFCODE) {
        this.PSELFCODE = PSELFCODE;
    }
}