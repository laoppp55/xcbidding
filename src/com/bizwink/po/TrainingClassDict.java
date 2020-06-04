package com.bizwink.po;

import java.math.BigDecimal;

public class TrainingClassDict {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_TRAININGCLASSDICT.ID
     *
     * @mbggenerated
     */
    private BigDecimal ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_TRAININGCLASSDICT.CLASSNAME
     *
     * @mbggenerated
     */
    private String CLASSNAME;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_TRAININGCLASSDICT.CLASSBRIEF
     *
     * @mbggenerated
     */
    private String CLASSBRIEF;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_TRAININGCLASSDICT.PRICE
     *
     * @mbggenerated
     */
    private BigDecimal PRICE;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_TRAININGCLASSDICT.CLASSCODE
     *
     * @mbggenerated
     */
    private String CLASSCODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_TRAININGCLASSDICT.ID
     *
     * @return the value of TBL_TRAININGCLASSDICT.ID
     *
     * @mbggenerated
     */
    public BigDecimal getID() {
        return ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_TRAININGCLASSDICT.ID
     *
     * @param ID the value for TBL_TRAININGCLASSDICT.ID
     *
     * @mbggenerated
     */
    public void setID(BigDecimal ID) {
        this.ID = ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_TRAININGCLASSDICT.CLASSNAME
     *
     * @return the value of TBL_TRAININGCLASSDICT.CLASSNAME
     *
     * @mbggenerated
     */
    public String getCLASSNAME() {
        return CLASSNAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_TRAININGCLASSDICT.CLASSNAME
     *
     * @param CLASSNAME the value for TBL_TRAININGCLASSDICT.CLASSNAME
     *
     * @mbggenerated
     */
    public void setCLASSNAME(String CLASSNAME) {
        this.CLASSNAME = CLASSNAME == null ? null : CLASSNAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_TRAININGCLASSDICT.CLASSBRIEF
     *
     * @return the value of TBL_TRAININGCLASSDICT.CLASSBRIEF
     *
     * @mbggenerated
     */
    public String getCLASSBRIEF() {
        return CLASSBRIEF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_TRAININGCLASSDICT.CLASSBRIEF
     *
     * @param CLASSBRIEF the value for TBL_TRAININGCLASSDICT.CLASSBRIEF
     *
     * @mbggenerated
     */
    public void setCLASSBRIEF(String CLASSBRIEF) {
        this.CLASSBRIEF = CLASSBRIEF == null ? null : CLASSBRIEF.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_TRAININGCLASSDICT.PRICE
     *
     * @return the value of TBL_TRAININGCLASSDICT.PRICE
     *
     * @mbggenerated
     */
    public BigDecimal getPRICE() {
        return PRICE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_TRAININGCLASSDICT.PRICE
     *
     * @param PRICE the value for TBL_TRAININGCLASSDICT.PRICE
     *
     * @mbggenerated
     */
    public void setPRICE(BigDecimal PRICE) {
        this.PRICE = PRICE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_TRAININGCLASSDICT.CLASSCODE
     *
     * @return the value of TBL_TRAININGCLASSDICT.CLASSCODE
     *
     * @mbggenerated
     */
    public String getCLASSCODE() {
        return CLASSCODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_TRAININGCLASSDICT.CLASSCODE
     *
     * @param CLASSCODE the value for TBL_TRAININGCLASSDICT.CLASSCODE
     *
     * @mbggenerated
     */
    public void setCLASSCODE(String CLASSCODE) {
        this.CLASSCODE = CLASSCODE == null ? null : CLASSCODE.trim();
    }
}