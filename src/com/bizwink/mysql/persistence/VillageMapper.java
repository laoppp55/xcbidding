package com.bizwink.mysql.persistence;

import com.bizwink.mysql.po.Village;
import com.bizwink.mysql.po.VillageExample;

public interface VillageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table en_village
     *
     * @mbggenerated
     */
    int countByExample(VillageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table en_village
     *
     * @mbggenerated
     */
    int insert(Village record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table en_village
     *
     * @mbggenerated
     */
    int insertSelective(Village record);
}