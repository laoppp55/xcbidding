package com.bizwink.persistence;

import com.bizwink.po.Invoiceinfofororder;

public interface InvoiceinfofororderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoiceinfofororder
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    int deleteByOrderid(Long orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoiceinfofororder
     *
     * @mbggenerated
     */
    int insert(Invoiceinfofororder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoiceinfofororder
     *
     * @mbggenerated
     */
    int insertSelective(Invoiceinfofororder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoiceinfofororder
     *
     * @mbggenerated
     */
    Invoiceinfofororder selectByPrimaryKey(Integer id);

    Invoiceinfofororder selectByOrderid(Long orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoiceinfofororder
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Invoiceinfofororder record);

    int updateByOrderidSelective(Invoiceinfofororder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoiceinfofororder
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Invoiceinfofororder record);
}