package com.demo.model;

import java.util.ArrayList;
import java.util.List;

public class EnterpriseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseExample() {
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

        public Criteria andEnPhoneIsNull() {
            addCriterion("en_phone is null");
            return (Criteria) this;
        }

        public Criteria andEnPhoneIsNotNull() {
            addCriterion("en_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEnPhoneEqualTo(String value) {
            addCriterion("en_phone =", value, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneNotEqualTo(String value) {
            addCriterion("en_phone <>", value, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneGreaterThan(String value) {
            addCriterion("en_phone >", value, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("en_phone >=", value, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneLessThan(String value) {
            addCriterion("en_phone <", value, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneLessThanOrEqualTo(String value) {
            addCriterion("en_phone <=", value, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneLike(String value) {
            addCriterion("en_phone like", value, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneNotLike(String value) {
            addCriterion("en_phone not like", value, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneIn(List<String> values) {
            addCriterion("en_phone in", values, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneNotIn(List<String> values) {
            addCriterion("en_phone not in", values, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneBetween(String value1, String value2) {
            addCriterion("en_phone between", value1, value2, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneNotBetween(String value1, String value2) {
            addCriterion("en_phone not between", value1, value2, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnEnameIsNull() {
            addCriterion("en_ename is null");
            return (Criteria) this;
        }

        public Criteria andEnEnameIsNotNull() {
            addCriterion("en_ename is not null");
            return (Criteria) this;
        }

        public Criteria andEnEnameEqualTo(String value) {
            addCriterion("en_ename =", value, "enEname");
            return (Criteria) this;
        }

        public Criteria andEnEnameNotEqualTo(String value) {
            addCriterion("en_ename <>", value, "enEname");
            return (Criteria) this;
        }

        public Criteria andEnEnameGreaterThan(String value) {
            addCriterion("en_ename >", value, "enEname");
            return (Criteria) this;
        }

        public Criteria andEnEnameGreaterThanOrEqualTo(String value) {
            addCriterion("en_ename >=", value, "enEname");
            return (Criteria) this;
        }

        public Criteria andEnEnameLessThan(String value) {
            addCriterion("en_ename <", value, "enEname");
            return (Criteria) this;
        }

        public Criteria andEnEnameLessThanOrEqualTo(String value) {
            addCriterion("en_ename <=", value, "enEname");
            return (Criteria) this;
        }

        public Criteria andEnEnameLike(String value) {
            addCriterion("en_ename like", value, "enEname");
            return (Criteria) this;
        }

        public Criteria andEnEnameNotLike(String value) {
            addCriterion("en_ename not like", value, "enEname");
            return (Criteria) this;
        }

        public Criteria andEnEnameIn(List<String> values) {
            addCriterion("en_ename in", values, "enEname");
            return (Criteria) this;
        }

        public Criteria andEnEnameNotIn(List<String> values) {
            addCriterion("en_ename not in", values, "enEname");
            return (Criteria) this;
        }

        public Criteria andEnEnameBetween(String value1, String value2) {
            addCriterion("en_ename between", value1, value2, "enEname");
            return (Criteria) this;
        }

        public Criteria andEnEnameNotBetween(String value1, String value2) {
            addCriterion("en_ename not between", value1, value2, "enEname");
            return (Criteria) this;
        }

        public Criteria andEnBossIsNull() {
            addCriterion("en_boss is null");
            return (Criteria) this;
        }

        public Criteria andEnBossIsNotNull() {
            addCriterion("en_boss is not null");
            return (Criteria) this;
        }

        public Criteria andEnBossEqualTo(String value) {
            addCriterion("en_boss =", value, "enBoss");
            return (Criteria) this;
        }

        public Criteria andEnBossNotEqualTo(String value) {
            addCriterion("en_boss <>", value, "enBoss");
            return (Criteria) this;
        }

        public Criteria andEnBossGreaterThan(String value) {
            addCriterion("en_boss >", value, "enBoss");
            return (Criteria) this;
        }

        public Criteria andEnBossGreaterThanOrEqualTo(String value) {
            addCriterion("en_boss >=", value, "enBoss");
            return (Criteria) this;
        }

        public Criteria andEnBossLessThan(String value) {
            addCriterion("en_boss <", value, "enBoss");
            return (Criteria) this;
        }

        public Criteria andEnBossLessThanOrEqualTo(String value) {
            addCriterion("en_boss <=", value, "enBoss");
            return (Criteria) this;
        }

        public Criteria andEnBossLike(String value) {
            addCriterion("en_boss like", value, "enBoss");
            return (Criteria) this;
        }

        public Criteria andEnBossNotLike(String value) {
            addCriterion("en_boss not like", value, "enBoss");
            return (Criteria) this;
        }

        public Criteria andEnBossIn(List<String> values) {
            addCriterion("en_boss in", values, "enBoss");
            return (Criteria) this;
        }

        public Criteria andEnBossNotIn(List<String> values) {
            addCriterion("en_boss not in", values, "enBoss");
            return (Criteria) this;
        }

        public Criteria andEnBossBetween(String value1, String value2) {
            addCriterion("en_boss between", value1, value2, "enBoss");
            return (Criteria) this;
        }

        public Criteria andEnBossNotBetween(String value1, String value2) {
            addCriterion("en_boss not between", value1, value2, "enBoss");
            return (Criteria) this;
        }

        public Criteria andEnEmailIsNull() {
            addCriterion("en_email is null");
            return (Criteria) this;
        }

        public Criteria andEnEmailIsNotNull() {
            addCriterion("en_email is not null");
            return (Criteria) this;
        }

        public Criteria andEnEmailEqualTo(String value) {
            addCriterion("en_email =", value, "enEmail");
            return (Criteria) this;
        }

        public Criteria andEnEmailNotEqualTo(String value) {
            addCriterion("en_email <>", value, "enEmail");
            return (Criteria) this;
        }

        public Criteria andEnEmailGreaterThan(String value) {
            addCriterion("en_email >", value, "enEmail");
            return (Criteria) this;
        }

        public Criteria andEnEmailGreaterThanOrEqualTo(String value) {
            addCriterion("en_email >=", value, "enEmail");
            return (Criteria) this;
        }

        public Criteria andEnEmailLessThan(String value) {
            addCriterion("en_email <", value, "enEmail");
            return (Criteria) this;
        }

        public Criteria andEnEmailLessThanOrEqualTo(String value) {
            addCriterion("en_email <=", value, "enEmail");
            return (Criteria) this;
        }

        public Criteria andEnEmailLike(String value) {
            addCriterion("en_email like", value, "enEmail");
            return (Criteria) this;
        }

        public Criteria andEnEmailNotLike(String value) {
            addCriterion("en_email not like", value, "enEmail");
            return (Criteria) this;
        }

        public Criteria andEnEmailIn(List<String> values) {
            addCriterion("en_email in", values, "enEmail");
            return (Criteria) this;
        }

        public Criteria andEnEmailNotIn(List<String> values) {
            addCriterion("en_email not in", values, "enEmail");
            return (Criteria) this;
        }

        public Criteria andEnEmailBetween(String value1, String value2) {
            addCriterion("en_email between", value1, value2, "enEmail");
            return (Criteria) this;
        }

        public Criteria andEnEmailNotBetween(String value1, String value2) {
            addCriterion("en_email not between", value1, value2, "enEmail");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNull() {
            addCriterion("en_name is null");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNotNull() {
            addCriterion("en_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnNameEqualTo(String value) {
            addCriterion("en_name =", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotEqualTo(String value) {
            addCriterion("en_name <>", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThan(String value) {
            addCriterion("en_name >", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("en_name >=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThan(String value) {
            addCriterion("en_name <", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThanOrEqualTo(String value) {
            addCriterion("en_name <=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLike(String value) {
            addCriterion("en_name like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotLike(String value) {
            addCriterion("en_name not like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameIn(List<String> values) {
            addCriterion("en_name in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotIn(List<String> values) {
            addCriterion("en_name not in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameBetween(String value1, String value2) {
            addCriterion("en_name between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotBetween(String value1, String value2) {
            addCriterion("en_name not between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andEnInfoIsNull() {
            addCriterion("en_info is null");
            return (Criteria) this;
        }

        public Criteria andEnInfoIsNotNull() {
            addCriterion("en_info is not null");
            return (Criteria) this;
        }

        public Criteria andEnInfoEqualTo(String value) {
            addCriterion("en_info =", value, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoNotEqualTo(String value) {
            addCriterion("en_info <>", value, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoGreaterThan(String value) {
            addCriterion("en_info >", value, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoGreaterThanOrEqualTo(String value) {
            addCriterion("en_info >=", value, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoLessThan(String value) {
            addCriterion("en_info <", value, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoLessThanOrEqualTo(String value) {
            addCriterion("en_info <=", value, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoLike(String value) {
            addCriterion("en_info like", value, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoNotLike(String value) {
            addCriterion("en_info not like", value, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoIn(List<String> values) {
            addCriterion("en_info in", values, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoNotIn(List<String> values) {
            addCriterion("en_info not in", values, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoBetween(String value1, String value2) {
            addCriterion("en_info between", value1, value2, "enInfo");
            return (Criteria) this;
        }

        public Criteria andEnInfoNotBetween(String value1, String value2) {
            addCriterion("en_info not between", value1, value2, "enInfo");
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

        public Criteria andEnStateIsNull() {
            addCriterion("en_state is null");
            return (Criteria) this;
        }

        public Criteria andEnStateIsNotNull() {
            addCriterion("en_state is not null");
            return (Criteria) this;
        }

        public Criteria andEnStateEqualTo(Integer value) {
            addCriterion("en_state =", value, "enState");
            return (Criteria) this;
        }

        public Criteria andEnStateNotEqualTo(Integer value) {
            addCriterion("en_state <>", value, "enState");
            return (Criteria) this;
        }

        public Criteria andEnStateGreaterThan(Integer value) {
            addCriterion("en_state >", value, "enState");
            return (Criteria) this;
        }

        public Criteria andEnStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("en_state >=", value, "enState");
            return (Criteria) this;
        }

        public Criteria andEnStateLessThan(Integer value) {
            addCriterion("en_state <", value, "enState");
            return (Criteria) this;
        }

        public Criteria andEnStateLessThanOrEqualTo(Integer value) {
            addCriterion("en_state <=", value, "enState");
            return (Criteria) this;
        }

        public Criteria andEnStateIn(List<Integer> values) {
            addCriterion("en_state in", values, "enState");
            return (Criteria) this;
        }

        public Criteria andEnStateNotIn(List<Integer> values) {
            addCriterion("en_state not in", values, "enState");
            return (Criteria) this;
        }

        public Criteria andEnStateBetween(Integer value1, Integer value2) {
            addCriterion("en_state between", value1, value2, "enState");
            return (Criteria) this;
        }

        public Criteria andEnStateNotBetween(Integer value1, Integer value2) {
            addCriterion("en_state not between", value1, value2, "enState");
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