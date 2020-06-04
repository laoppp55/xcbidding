package com.bizwink.persistence;

import com.bizwink.po.Town;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface TownMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EN_TOWN
     *
     * @mbggenerated
     */
    int insert(Town record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EN_TOWN
     *
     * @mbggenerated
     */
    int insertSelective(Town record);

    List<Town> selectTownsByStrCode(String PrefixCode);

    List<Town> selectTownsByCode(BigDecimal zoneid);

    String getTownCodeByName(Map params);

    String getTownName(String townCode);
}