package com.bizwink.persistence;

import com.bizwink.po.Invoiceinfo;

public interface InvoiceinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoiceinfo
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoiceinfo
     *
     * @mbggenerated
     */
    int insert(Invoiceinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoiceinfo
     *
     * @mbggenerated
     */
    int insertSelective(Invoiceinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoiceinfo
     *
     * @mbggenerated
     */
    Invoiceinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoiceinfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Invoiceinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoiceinfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Invoiceinfo record);
}