package com.bizwink.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvalBidingScoreItemsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_evalbidingscoreitems
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_evalbidingscoreitems
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_evalbidingscoreitems
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_evalbidingscoreitems
     *
     * @mbggenerated
     */
    public EvalBidingScoreItemsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_evalbidingscoreitems
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_evalbidingscoreitems
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_evalbidingscoreitems
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_evalbidingscoreitems
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_evalbidingscoreitems
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_evalbidingscoreitems
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_evalbidingscoreitems
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_evalbidingscoreitems
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_evalbidingscoreitems
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_evalbidingscoreitems
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_evalbidingscoreitems
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andItemidIsNull() {
            addCriterion("Itemid is null");
            return (Criteria) this;
        }

        public Criteria andItemidIsNotNull() {
            addCriterion("Itemid is not null");
            return (Criteria) this;
        }

        public Criteria andItemidEqualTo(Long value) {
            addCriterion("Itemid =", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotEqualTo(Long value) {
            addCriterion("Itemid <>", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThan(Long value) {
            addCriterion("Itemid >", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThanOrEqualTo(Long value) {
            addCriterion("Itemid >=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThan(Long value) {
            addCriterion("Itemid <", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThanOrEqualTo(Long value) {
            addCriterion("Itemid <=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidIn(List<Long> values) {
            addCriterion("Itemid in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotIn(List<Long> values) {
            addCriterion("Itemid not in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidBetween(Long value1, Long value2) {
            addCriterion("Itemid between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotBetween(Long value1, Long value2) {
            addCriterion("Itemid not between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andUpitemidIsNull() {
            addCriterion("Upitemid is null");
            return (Criteria) this;
        }

        public Criteria andUpitemidIsNotNull() {
            addCriterion("Upitemid is not null");
            return (Criteria) this;
        }

        public Criteria andUpitemidEqualTo(Long value) {
            addCriterion("Upitemid =", value, "upitemid");
            return (Criteria) this;
        }

        public Criteria andUpitemidNotEqualTo(Long value) {
            addCriterion("Upitemid <>", value, "upitemid");
            return (Criteria) this;
        }

        public Criteria andUpitemidGreaterThan(Long value) {
            addCriterion("Upitemid >", value, "upitemid");
            return (Criteria) this;
        }

        public Criteria andUpitemidGreaterThanOrEqualTo(Long value) {
            addCriterion("Upitemid >=", value, "upitemid");
            return (Criteria) this;
        }

        public Criteria andUpitemidLessThan(Long value) {
            addCriterion("Upitemid <", value, "upitemid");
            return (Criteria) this;
        }

        public Criteria andUpitemidLessThanOrEqualTo(Long value) {
            addCriterion("Upitemid <=", value, "upitemid");
            return (Criteria) this;
        }

        public Criteria andUpitemidIn(List<Long> values) {
            addCriterion("Upitemid in", values, "upitemid");
            return (Criteria) this;
        }

        public Criteria andUpitemidNotIn(List<Long> values) {
            addCriterion("Upitemid not in", values, "upitemid");
            return (Criteria) this;
        }

        public Criteria andUpitemidBetween(Long value1, Long value2) {
            addCriterion("Upitemid between", value1, value2, "upitemid");
            return (Criteria) this;
        }

        public Criteria andUpitemidNotBetween(Long value1, Long value2) {
            addCriterion("Upitemid not between", value1, value2, "upitemid");
            return (Criteria) this;
        }

        public Criteria andPurchaseprojcodeIsNull() {
            addCriterion("purchaseprojcode is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseprojcodeIsNotNull() {
            addCriterion("purchaseprojcode is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseprojcodeEqualTo(String value) {
            addCriterion("purchaseprojcode =", value, "purchaseprojcode");
            return (Criteria) this;
        }

        public Criteria andPurchaseprojcodeNotEqualTo(String value) {
            addCriterion("purchaseprojcode <>", value, "purchaseprojcode");
            return (Criteria) this;
        }

        public Criteria andPurchaseprojcodeGreaterThan(String value) {
            addCriterion("purchaseprojcode >", value, "purchaseprojcode");
            return (Criteria) this;
        }

        public Criteria andPurchaseprojcodeGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseprojcode >=", value, "purchaseprojcode");
            return (Criteria) this;
        }

        public Criteria andPurchaseprojcodeLessThan(String value) {
            addCriterion("purchaseprojcode <", value, "purchaseprojcode");
            return (Criteria) this;
        }

        public Criteria andPurchaseprojcodeLessThanOrEqualTo(String value) {
            addCriterion("purchaseprojcode <=", value, "purchaseprojcode");
            return (Criteria) this;
        }

        public Criteria andPurchaseprojcodeLike(String value) {
            addCriterion("purchaseprojcode like", value, "purchaseprojcode");
            return (Criteria) this;
        }

        public Criteria andPurchaseprojcodeNotLike(String value) {
            addCriterion("purchaseprojcode not like", value, "purchaseprojcode");
            return (Criteria) this;
        }

        public Criteria andPurchaseprojcodeIn(List<String> values) {
            addCriterion("purchaseprojcode in", values, "purchaseprojcode");
            return (Criteria) this;
        }

        public Criteria andPurchaseprojcodeNotIn(List<String> values) {
            addCriterion("purchaseprojcode not in", values, "purchaseprojcode");
            return (Criteria) this;
        }

        public Criteria andPurchaseprojcodeBetween(String value1, String value2) {
            addCriterion("purchaseprojcode between", value1, value2, "purchaseprojcode");
            return (Criteria) this;
        }

        public Criteria andPurchaseprojcodeNotBetween(String value1, String value2) {
            addCriterion("purchaseprojcode not between", value1, value2, "purchaseprojcode");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidIsNull() {
            addCriterion("evalmethodid is null");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidIsNotNull() {
            addCriterion("evalmethodid is not null");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidEqualTo(String value) {
            addCriterion("evalmethodid =", value, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidNotEqualTo(String value) {
            addCriterion("evalmethodid <>", value, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidGreaterThan(String value) {
            addCriterion("evalmethodid >", value, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidGreaterThanOrEqualTo(String value) {
            addCriterion("evalmethodid >=", value, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidLessThan(String value) {
            addCriterion("evalmethodid <", value, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidLessThanOrEqualTo(String value) {
            addCriterion("evalmethodid <=", value, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidLike(String value) {
            addCriterion("evalmethodid like", value, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidNotLike(String value) {
            addCriterion("evalmethodid not like", value, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidIn(List<String> values) {
            addCriterion("evalmethodid in", values, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidNotIn(List<String> values) {
            addCriterion("evalmethodid not in", values, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidBetween(String value1, String value2) {
            addCriterion("evalmethodid between", value1, value2, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidNotBetween(String value1, String value2) {
            addCriterion("evalmethodid not between", value1, value2, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNull() {
            addCriterion("Itemname is null");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNotNull() {
            addCriterion("Itemname is not null");
            return (Criteria) this;
        }

        public Criteria andItemnameEqualTo(String value) {
            addCriterion("Itemname =", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotEqualTo(String value) {
            addCriterion("Itemname <>", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThan(String value) {
            addCriterion("Itemname >", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThanOrEqualTo(String value) {
            addCriterion("Itemname >=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThan(String value) {
            addCriterion("Itemname <", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThanOrEqualTo(String value) {
            addCriterion("Itemname <=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLike(String value) {
            addCriterion("Itemname like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotLike(String value) {
            addCriterion("Itemname not like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameIn(List<String> values) {
            addCriterion("Itemname in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotIn(List<String> values) {
            addCriterion("Itemname not in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameBetween(String value1, String value2) {
            addCriterion("Itemname between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotBetween(String value1, String value2) {
            addCriterion("Itemname not between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("Introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("Introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("Introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("Introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("Introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("Introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("Introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("Introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("Introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("Introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("Introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("Introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("Introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("Introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andScoretypeIsNull() {
            addCriterion("Scoretype is null");
            return (Criteria) this;
        }

        public Criteria andScoretypeIsNotNull() {
            addCriterion("Scoretype is not null");
            return (Criteria) this;
        }

        public Criteria andScoretypeEqualTo(Byte value) {
            addCriterion("Scoretype =", value, "scoretype");
            return (Criteria) this;
        }

        public Criteria andScoretypeNotEqualTo(Byte value) {
            addCriterion("Scoretype <>", value, "scoretype");
            return (Criteria) this;
        }

        public Criteria andScoretypeGreaterThan(Byte value) {
            addCriterion("Scoretype >", value, "scoretype");
            return (Criteria) this;
        }

        public Criteria andScoretypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("Scoretype >=", value, "scoretype");
            return (Criteria) this;
        }

        public Criteria andScoretypeLessThan(Byte value) {
            addCriterion("Scoretype <", value, "scoretype");
            return (Criteria) this;
        }

        public Criteria andScoretypeLessThanOrEqualTo(Byte value) {
            addCriterion("Scoretype <=", value, "scoretype");
            return (Criteria) this;
        }

        public Criteria andScoretypeIn(List<Byte> values) {
            addCriterion("Scoretype in", values, "scoretype");
            return (Criteria) this;
        }

        public Criteria andScoretypeNotIn(List<Byte> values) {
            addCriterion("Scoretype not in", values, "scoretype");
            return (Criteria) this;
        }

        public Criteria andScoretypeBetween(Byte value1, Byte value2) {
            addCriterion("Scoretype between", value1, value2, "scoretype");
            return (Criteria) this;
        }

        public Criteria andScoretypeNotBetween(Byte value1, Byte value2) {
            addCriterion("Scoretype not between", value1, value2, "scoretype");
            return (Criteria) this;
        }

        public Criteria andMaxscoreIsNull() {
            addCriterion("Maxscore is null");
            return (Criteria) this;
        }

        public Criteria andMaxscoreIsNotNull() {
            addCriterion("Maxscore is not null");
            return (Criteria) this;
        }

        public Criteria andMaxscoreEqualTo(Integer value) {
            addCriterion("Maxscore =", value, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMaxscoreNotEqualTo(Integer value) {
            addCriterion("Maxscore <>", value, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMaxscoreGreaterThan(Integer value) {
            addCriterion("Maxscore >", value, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMaxscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("Maxscore >=", value, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMaxscoreLessThan(Integer value) {
            addCriterion("Maxscore <", value, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMaxscoreLessThanOrEqualTo(Integer value) {
            addCriterion("Maxscore <=", value, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMaxscoreIn(List<Integer> values) {
            addCriterion("Maxscore in", values, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMaxscoreNotIn(List<Integer> values) {
            addCriterion("Maxscore not in", values, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMaxscoreBetween(Integer value1, Integer value2) {
            addCriterion("Maxscore between", value1, value2, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMaxscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("Maxscore not between", value1, value2, "maxscore");
            return (Criteria) this;
        }

        public Criteria andMinscoreIsNull() {
            addCriterion("Minscore is null");
            return (Criteria) this;
        }

        public Criteria andMinscoreIsNotNull() {
            addCriterion("Minscore is not null");
            return (Criteria) this;
        }

        public Criteria andMinscoreEqualTo(Integer value) {
            addCriterion("Minscore =", value, "minscore");
            return (Criteria) this;
        }

        public Criteria andMinscoreNotEqualTo(Integer value) {
            addCriterion("Minscore <>", value, "minscore");
            return (Criteria) this;
        }

        public Criteria andMinscoreGreaterThan(Integer value) {
            addCriterion("Minscore >", value, "minscore");
            return (Criteria) this;
        }

        public Criteria andMinscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("Minscore >=", value, "minscore");
            return (Criteria) this;
        }

        public Criteria andMinscoreLessThan(Integer value) {
            addCriterion("Minscore <", value, "minscore");
            return (Criteria) this;
        }

        public Criteria andMinscoreLessThanOrEqualTo(Integer value) {
            addCriterion("Minscore <=", value, "minscore");
            return (Criteria) this;
        }

        public Criteria andMinscoreIn(List<Integer> values) {
            addCriterion("Minscore in", values, "minscore");
            return (Criteria) this;
        }

        public Criteria andMinscoreNotIn(List<Integer> values) {
            addCriterion("Minscore not in", values, "minscore");
            return (Criteria) this;
        }

        public Criteria andMinscoreBetween(Integer value1, Integer value2) {
            addCriterion("Minscore between", value1, value2, "minscore");
            return (Criteria) this;
        }

        public Criteria andMinscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("Minscore not between", value1, value2, "minscore");
            return (Criteria) this;
        }

        public Criteria andLeafIsNull() {
            addCriterion("Leaf is null");
            return (Criteria) this;
        }

        public Criteria andLeafIsNotNull() {
            addCriterion("Leaf is not null");
            return (Criteria) this;
        }

        public Criteria andLeafEqualTo(Byte value) {
            addCriterion("Leaf =", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotEqualTo(Byte value) {
            addCriterion("Leaf <>", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafGreaterThan(Byte value) {
            addCriterion("Leaf >", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafGreaterThanOrEqualTo(Byte value) {
            addCriterion("Leaf >=", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafLessThan(Byte value) {
            addCriterion("Leaf <", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafLessThanOrEqualTo(Byte value) {
            addCriterion("Leaf <=", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafIn(List<Byte> values) {
            addCriterion("Leaf in", values, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotIn(List<Byte> values) {
            addCriterion("Leaf not in", values, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafBetween(Byte value1, Byte value2) {
            addCriterion("Leaf between", value1, value2, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotBetween(Byte value1, Byte value2) {
            addCriterion("Leaf not between", value1, value2, "leaf");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("Level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("Level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("Level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("Level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("Level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("Level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("Level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("Level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("Level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("Level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("Level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("Level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("Creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("Creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("Creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("Creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("Creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("Creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("Creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("Creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("Creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("Creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("Creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("Creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("Creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("Creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("Createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("Createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("Createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("Createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("Createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("Createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("Createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("Createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("Createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_evalbidingscoreitems
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_evalbidingscoreitems
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}