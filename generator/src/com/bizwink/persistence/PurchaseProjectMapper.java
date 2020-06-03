package com.bizwink.persistence;

import com.bizwink.po.PurchaseProject;
import com.bizwink.po.PurchaseProjectExample;
import com.bizwink.po.PurchaseProjectWithBLOBs;

public interface PurchaseProjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_project
     *
     * @mbggenerated
     */
    int countByExample(PurchaseProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_project
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_project
     *
     * @mbggenerated
     */
    int insert(PurchaseProjectWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_project
     *
     * @mbggenerated
     */
    int insertSelective(PurchaseProjectWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_project
     *
     * @mbggenerated
     */
    PurchaseProjectWithBLOBs selectByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_project
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PurchaseProjectWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_project
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(PurchaseProjectWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_project
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PurchaseProject record);
}