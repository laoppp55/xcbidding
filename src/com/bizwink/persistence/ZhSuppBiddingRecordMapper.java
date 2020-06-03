package com.bizwink.persistence;

import com.bizwink.po.ZhSuppBiddingRecord;
import com.bizwink.po.ZhSuppBiddingRecordExample;

public interface ZhSuppBiddingRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supp_bidding_record
     *
     * @mbggenerated
     */
    int countByExample(ZhSuppBiddingRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supp_bidding_record
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supp_bidding_record
     *
     * @mbggenerated
     */
    int insert(ZhSuppBiddingRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supp_bidding_record
     *
     * @mbggenerated
     */
    int insertSelective(ZhSuppBiddingRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supp_bidding_record
     *
     * @mbggenerated
     */
    ZhSuppBiddingRecord selectByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supp_bidding_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ZhSuppBiddingRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supp_bidding_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ZhSuppBiddingRecord record);
}