package com.bizwink.basic.code.persistence;

import com.bizwink.basic.code.po.HierarchyCode;
import com.bizwink.basic.code.po.HierarchyCodeExample;
import com.bizwink.basic.code.po.HierarchyCodeKey;

public interface HierarchyCodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_hierarchycode
     *
     * @mbggenerated
     */
    int countByExample(HierarchyCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_hierarchycode
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(HierarchyCodeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_hierarchycode
     *
     * @mbggenerated
     */
    int insert(HierarchyCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_hierarchycode
     *
     * @mbggenerated
     */
    int insertSelective(HierarchyCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_hierarchycode
     *
     * @mbggenerated
     */
    HierarchyCode selectByPrimaryKey(HierarchyCodeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_hierarchycode
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(HierarchyCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_hierarchycode
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(HierarchyCode record);
}