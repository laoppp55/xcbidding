package com.bizwink.persistence;

import com.bizwink.po.PlaceReserveInformation;
import com.bizwink.po.PlaceReserveInformationExample;

public interface PlaceReserveInformationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table place_reserve_information
     *
     * @mbggenerated
     */
    int countByExample(PlaceReserveInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table place_reserve_information
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table place_reserve_information
     *
     * @mbggenerated
     */
    int insert(PlaceReserveInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table place_reserve_information
     *
     * @mbggenerated
     */
    int insertSelective(PlaceReserveInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table place_reserve_information
     *
     * @mbggenerated
     */
    PlaceReserveInformation selectByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table place_reserve_information
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PlaceReserveInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table place_reserve_information
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(PlaceReserveInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table place_reserve_information
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PlaceReserveInformation record);
}