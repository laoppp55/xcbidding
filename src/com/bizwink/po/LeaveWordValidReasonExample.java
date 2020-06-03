package com.bizwink.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LeaveWordValidReasonExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_LEAVEWORD_VALID_REASON
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_LEAVEWORD_VALID_REASON
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_LEAVEWORD_VALID_REASON
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_LEAVEWORD_VALID_REASON
     *
     * @mbggenerated
     */
    public LeaveWordValidReasonExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_LEAVEWORD_VALID_REASON
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_LEAVEWORD_VALID_REASON
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_LEAVEWORD_VALID_REASON
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_LEAVEWORD_VALID_REASON
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_LEAVEWORD_VALID_REASON
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_LEAVEWORD_VALID_REASON
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_LEAVEWORD_VALID_REASON
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
     * This method corresponds to the database table TBL_LEAVEWORD_VALID_REASON
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
     * This method corresponds to the database table TBL_LEAVEWORD_VALID_REASON
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_LEAVEWORD_VALID_REASON
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
     * This class corresponds to the database table TBL_LEAVEWORD_VALID_REASON
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

        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(BigDecimal value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andSITEIDIsNull() {
            addCriterion("SITEID is null");
            return (Criteria) this;
        }

        public Criteria andSITEIDIsNotNull() {
            addCriterion("SITEID is not null");
            return (Criteria) this;
        }

        public Criteria andSITEIDEqualTo(BigDecimal value) {
            addCriterion("SITEID =", value, "SITEID");
            return (Criteria) this;
        }

        public Criteria andSITEIDNotEqualTo(BigDecimal value) {
            addCriterion("SITEID <>", value, "SITEID");
            return (Criteria) this;
        }

        public Criteria andSITEIDGreaterThan(BigDecimal value) {
            addCriterion("SITEID >", value, "SITEID");
            return (Criteria) this;
        }

        public Criteria andSITEIDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SITEID >=", value, "SITEID");
            return (Criteria) this;
        }

        public Criteria andSITEIDLessThan(BigDecimal value) {
            addCriterion("SITEID <", value, "SITEID");
            return (Criteria) this;
        }

        public Criteria andSITEIDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SITEID <=", value, "SITEID");
            return (Criteria) this;
        }

        public Criteria andSITEIDIn(List<BigDecimal> values) {
            addCriterion("SITEID in", values, "SITEID");
            return (Criteria) this;
        }

        public Criteria andSITEIDNotIn(List<BigDecimal> values) {
            addCriterion("SITEID not in", values, "SITEID");
            return (Criteria) this;
        }

        public Criteria andSITEIDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SITEID between", value1, value2, "SITEID");
            return (Criteria) this;
        }

        public Criteria andSITEIDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SITEID not between", value1, value2, "SITEID");
            return (Criteria) this;
        }

        public Criteria andCONTENTIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCONTENTIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCONTENTEqualTo(String value) {
            addCriterion("CONTENT =", value, "CONTENT");
            return (Criteria) this;
        }

        public Criteria andCONTENTNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "CONTENT");
            return (Criteria) this;
        }

        public Criteria andCONTENTGreaterThan(String value) {
            addCriterion("CONTENT >", value, "CONTENT");
            return (Criteria) this;
        }

        public Criteria andCONTENTGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "CONTENT");
            return (Criteria) this;
        }

        public Criteria andCONTENTLessThan(String value) {
            addCriterion("CONTENT <", value, "CONTENT");
            return (Criteria) this;
        }

        public Criteria andCONTENTLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "CONTENT");
            return (Criteria) this;
        }

        public Criteria andCONTENTLike(String value) {
            addCriterion("CONTENT like", value, "CONTENT");
            return (Criteria) this;
        }

        public Criteria andCONTENTNotLike(String value) {
            addCriterion("CONTENT not like", value, "CONTENT");
            return (Criteria) this;
        }

        public Criteria andCONTENTIn(List<String> values) {
            addCriterion("CONTENT in", values, "CONTENT");
            return (Criteria) this;
        }

        public Criteria andCONTENTNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "CONTENT");
            return (Criteria) this;
        }

        public Criteria andCONTENTBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "CONTENT");
            return (Criteria) this;
        }

        public Criteria andCONTENTNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "CONTENT");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBL_LEAVEWORD_VALID_REASON
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
     * This class corresponds to the database table TBL_LEAVEWORD_VALID_REASON
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