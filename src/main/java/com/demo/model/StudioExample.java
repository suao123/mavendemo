package com.demo.model;

import java.util.ArrayList;
import java.util.List;

public class StudioExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudioExample() {
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

        public Criteria andSPhoneIsNull() {
            addCriterion("s_phone is null");
            return (Criteria) this;
        }

        public Criteria andSPhoneIsNotNull() {
            addCriterion("s_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSPhoneEqualTo(String value) {
            addCriterion("s_phone =", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotEqualTo(String value) {
            addCriterion("s_phone <>", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneGreaterThan(String value) {
            addCriterion("s_phone >", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("s_phone >=", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLessThan(String value) {
            addCriterion("s_phone <", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLessThanOrEqualTo(String value) {
            addCriterion("s_phone <=", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLike(String value) {
            addCriterion("s_phone like", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotLike(String value) {
            addCriterion("s_phone not like", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneIn(List<String> values) {
            addCriterion("s_phone in", values, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotIn(List<String> values) {
            addCriterion("s_phone not in", values, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneBetween(String value1, String value2) {
            addCriterion("s_phone between", value1, value2, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotBetween(String value1, String value2) {
            addCriterion("s_phone not between", value1, value2, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSSnameIsNull() {
            addCriterion("s_sname is null");
            return (Criteria) this;
        }

        public Criteria andSSnameIsNotNull() {
            addCriterion("s_sname is not null");
            return (Criteria) this;
        }

        public Criteria andSSnameEqualTo(String value) {
            addCriterion("s_sname =", value, "sSname");
            return (Criteria) this;
        }

        public Criteria andSSnameNotEqualTo(String value) {
            addCriterion("s_sname <>", value, "sSname");
            return (Criteria) this;
        }

        public Criteria andSSnameGreaterThan(String value) {
            addCriterion("s_sname >", value, "sSname");
            return (Criteria) this;
        }

        public Criteria andSSnameGreaterThanOrEqualTo(String value) {
            addCriterion("s_sname >=", value, "sSname");
            return (Criteria) this;
        }

        public Criteria andSSnameLessThan(String value) {
            addCriterion("s_sname <", value, "sSname");
            return (Criteria) this;
        }

        public Criteria andSSnameLessThanOrEqualTo(String value) {
            addCriterion("s_sname <=", value, "sSname");
            return (Criteria) this;
        }

        public Criteria andSSnameLike(String value) {
            addCriterion("s_sname like", value, "sSname");
            return (Criteria) this;
        }

        public Criteria andSSnameNotLike(String value) {
            addCriterion("s_sname not like", value, "sSname");
            return (Criteria) this;
        }

        public Criteria andSSnameIn(List<String> values) {
            addCriterion("s_sname in", values, "sSname");
            return (Criteria) this;
        }

        public Criteria andSSnameNotIn(List<String> values) {
            addCriterion("s_sname not in", values, "sSname");
            return (Criteria) this;
        }

        public Criteria andSSnameBetween(String value1, String value2) {
            addCriterion("s_sname between", value1, value2, "sSname");
            return (Criteria) this;
        }

        public Criteria andSSnameNotBetween(String value1, String value2) {
            addCriterion("s_sname not between", value1, value2, "sSname");
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

        public Criteria andSEmailIsNull() {
            addCriterion("s_email is null");
            return (Criteria) this;
        }

        public Criteria andSEmailIsNotNull() {
            addCriterion("s_email is not null");
            return (Criteria) this;
        }

        public Criteria andSEmailEqualTo(String value) {
            addCriterion("s_email =", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotEqualTo(String value) {
            addCriterion("s_email <>", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailGreaterThan(String value) {
            addCriterion("s_email >", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailGreaterThanOrEqualTo(String value) {
            addCriterion("s_email >=", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailLessThan(String value) {
            addCriterion("s_email <", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailLessThanOrEqualTo(String value) {
            addCriterion("s_email <=", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailLike(String value) {
            addCriterion("s_email like", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotLike(String value) {
            addCriterion("s_email not like", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailIn(List<String> values) {
            addCriterion("s_email in", values, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotIn(List<String> values) {
            addCriterion("s_email not in", values, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailBetween(String value1, String value2) {
            addCriterion("s_email between", value1, value2, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotBetween(String value1, String value2) {
            addCriterion("s_email not between", value1, value2, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSInfoIsNull() {
            addCriterion("s_info is null");
            return (Criteria) this;
        }

        public Criteria andSInfoIsNotNull() {
            addCriterion("s_info is not null");
            return (Criteria) this;
        }

        public Criteria andSInfoEqualTo(String value) {
            addCriterion("s_info =", value, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoNotEqualTo(String value) {
            addCriterion("s_info <>", value, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoGreaterThan(String value) {
            addCriterion("s_info >", value, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoGreaterThanOrEqualTo(String value) {
            addCriterion("s_info >=", value, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoLessThan(String value) {
            addCriterion("s_info <", value, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoLessThanOrEqualTo(String value) {
            addCriterion("s_info <=", value, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoLike(String value) {
            addCriterion("s_info like", value, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoNotLike(String value) {
            addCriterion("s_info not like", value, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoIn(List<String> values) {
            addCriterion("s_info in", values, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoNotIn(List<String> values) {
            addCriterion("s_info not in", values, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoBetween(String value1, String value2) {
            addCriterion("s_info between", value1, value2, "sInfo");
            return (Criteria) this;
        }

        public Criteria andSInfoNotBetween(String value1, String value2) {
            addCriterion("s_info not between", value1, value2, "sInfo");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andSStateIsNull() {
            addCriterion("s_state is null");
            return (Criteria) this;
        }

        public Criteria andSStateIsNotNull() {
            addCriterion("s_state is not null");
            return (Criteria) this;
        }

        public Criteria andSStateEqualTo(Integer value) {
            addCriterion("s_state =", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateNotEqualTo(Integer value) {
            addCriterion("s_state <>", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateGreaterThan(Integer value) {
            addCriterion("s_state >", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_state >=", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateLessThan(Integer value) {
            addCriterion("s_state <", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateLessThanOrEqualTo(Integer value) {
            addCriterion("s_state <=", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateIn(List<Integer> values) {
            addCriterion("s_state in", values, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateNotIn(List<Integer> values) {
            addCriterion("s_state not in", values, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateBetween(Integer value1, Integer value2) {
            addCriterion("s_state between", value1, value2, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateNotBetween(Integer value1, Integer value2) {
            addCriterion("s_state not between", value1, value2, "sState");
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