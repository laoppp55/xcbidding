package com.bizwink.persistence;

import com.bizwink.po.TrainingProject;
import com.bizwink.po.TrainingProjectExample;
import java.math.BigDecimal;

public interface TrainingProjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGPROJECT
     *
     * @mbggenerated
     */
    int countByExample(TrainingProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGPROJECT
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BigDecimal ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGPROJECT
     *
     * @mbggenerated
     */
    int insert(TrainingProject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGPROJECT
     *
     * @mbggenerated
     */
    int insertSelective(TrainingProject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGPROJECT
     *
     * @mbggenerated
     */

    TrainingProject selectByPrimaryKey(BigDecimal ID);

    TrainingProject selectByProjCode(String  projcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGPROJECT
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TrainingProject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGPROJECT
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TrainingProject record);
}