package com.bizwink.persistence;

import com.bizwink.po.Siteinfo;
import java.math.BigDecimal;
import java.util.List;

public interface SiteinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SITEINFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BigDecimal SITEID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SITEINFO
     *
     * @mbggenerated
     */
    int insert(Siteinfo record);

    BigDecimal getSiteinfoMainKey();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SITEINFO
     *
     * @mbggenerated
     */
    int insertSelective(Siteinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SITEINFO
     *
     * @mbggenerated
     */
    Siteinfo selectByPrimaryKey(BigDecimal SITEID);

    Siteinfo selectBySitename(String sitename);

    List<Siteinfo> getSiteinfos();

    List<Siteinfo> getSiteinfosBySamSiteid(BigDecimal samsiteid);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SITEINFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Siteinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SITEINFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Siteinfo record);
}