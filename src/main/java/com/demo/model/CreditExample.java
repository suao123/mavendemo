package com.demo.model;

import java.util.ArrayList;
import java.util.List;

public class CreditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CreditExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andEnEnnameIsNull() {
            addCriterion("en_enname is null");
            return (Criteria) this;
        }

        public Criteria andEnEnnameIsNotNull() {
            addCriterion("en_enname is not null");
            return (Criteria) this;
        }

        public Criteria andEnEnnameEqualTo(String value) {
            addCriterion("en_enname =", value, "enEnname");
            return (Criteria) this;
        }

        public Criteria andEnEnnameNotEqualTo(String value) {
            addCriterion("en_enname <>", value, "enEnname");
            return (Criteria) this;
        }

        public Criteria andEnEnnameGreaterThan(String value) {
            addCriterion("en_enname >", value, "enEnname");
            return (Criteria) this;
        }

        public Criteria andEnEnnameGreaterThanOrEqualTo(String value) {
            addCriterion("en_enname >=", value, "enEnname");
            return (Criteria) this;
        }

        public Criteria andEnEnnameLessThan(String value) {
            addCriterion("en_enname <", value, "enEnname");
            return (Criteria) this;
        }

        public Criteria andEnEnnameLessThanOrEqualTo(String value) {
            addCriterion("en_enname <=", value, "enEnname");
            return (Criteria) this;
        }

        public Criteria andEnEnnameLike(String value) {
            addCriterion("en_enname like", value, "enEnname");
            return (Criteria) this;
        }

        public Criteria andEnEnnameNotLike(String value) {
            addCriterion("en_enname not like", value, "enEnname");
            return (Criteria) this;
        }

        public Criteria andEnEnnameIn(List<String> values) {
            addCriterion("en_enname in", values, "enEnname");
            return (Criteria) this;
        }

        public Criteria andEnEnnameNotIn(List<String> values) {
            addCriterion("en_enname not in", values, "enEnname");
            return (Criteria) this;
        }

        public Criteria andEnEnnameBetween(String value1, String value2) {
            addCriterion("en_enname between", value1, value2, "enEnname");
            return (Criteria) this;
        }

        public Criteria andEnEnnameNotBetween(String value1, String value2) {
            addCriterion("en_enname not between", value1, value2, "enEnname");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andOStateIsNull() {
            addCriterion("o_state is null");
            return (Criteria) this;
        }

        public Criteria andOStateIsNotNull() {
            addCriterion("o_state is not null");
            return (Criteria) this;
        }

        public Criteria andOStateEqualTo(Integer value) {
            addCriterion("o_state =", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotEqualTo(Integer value) {
            addCriterion("o_state <>", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateGreaterThan(Integer value) {
            addCriterion("o_state >", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_state >=", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateLessThan(Integer value) {
            addCriterion("o_state <", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateLessThanOrEqualTo(Integer value) {
            addCriterion("o_state <=", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateIn(List<Integer> values) {
            addCriterion("o_state in", values, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotIn(List<Integer> values) {
            addCriterion("o_state not in", values, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateBetween(Integer value1, Integer value2) {
            addCriterion("o_state between", value1, value2, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotBetween(Integer value1, Integer value2) {
            addCriterion("o_state not between", value1, value2, "oState");
            return (Criteria) this;
        }

        public Criteria andCCreditIsNull() {
            addCriterion("c_credit is null");
            return (Criteria) this;
        }

        public Criteria andCCreditIsNotNull() {
            addCriterion("c_credit is not null");
            return (Criteria) this;
        }

        public Criteria andCCreditEqualTo(Integer value) {
            addCriterion("c_credit =", value, "cCredit");
            return (Criteria) this;
        }

        public Criteria andCCreditNotEqualTo(Integer value) {
            addCriterion("c_credit <>", value, "cCredit");
            return (Criteria) this;
        }

        public Criteria andCCreditGreaterThan(Integer value) {
            addCriterion("c_credit >", value, "cCredit");
            return (Criteria) this;
        }

        public Criteria andCCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_credit >=", value, "cCredit");
            return (Criteria) this;
        }

        public Criteria andCCreditLessThan(Integer value) {
            addCriterion("c_credit <", value, "cCredit");
            return (Criteria) this;
        }

        public Criteria andCCreditLessThanOrEqualTo(Integer value) {
            addCriterion("c_credit <=", value, "cCredit");
            return (Criteria) this;
        }

        public Criteria andCCreditIn(List<Integer> values) {
            addCriterion("c_credit in", values, "cCredit");
            return (Criteria) this;
        }

        public Criteria andCCreditNotIn(List<Integer> values) {
            addCriterion("c_credit not in", values, "cCredit");
            return (Criteria) this;
        }

        public Criteria andCCreditBetween(Integer value1, Integer value2) {
            addCriterion("c_credit between", value1, value2, "cCredit");
            return (Criteria) this;
        }

        public Criteria andCCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("c_credit not between", value1, value2, "cCredit");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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