package com.demo.model;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(Integer value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(Integer value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(Integer value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(Integer value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(Integer value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<Integer> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<Integer> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(Integer value1, Integer value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(Integer value1, Integer value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andTNameIsNull() {
            addCriterion("t_name is null");
            return (Criteria) this;
        }

        public Criteria andTNameIsNotNull() {
            addCriterion("t_name is not null");
            return (Criteria) this;
        }

        public Criteria andTNameEqualTo(String value) {
            addCriterion("t_name =", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotEqualTo(String value) {
            addCriterion("t_name <>", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThan(String value) {
            addCriterion("t_name >", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_name >=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThan(String value) {
            addCriterion("t_name <", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThanOrEqualTo(String value) {
            addCriterion("t_name <=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLike(String value) {
            addCriterion("t_name like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotLike(String value) {
            addCriterion("t_name not like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameIn(List<String> values) {
            addCriterion("t_name in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotIn(List<String> values) {
            addCriterion("t_name not in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameBetween(String value1, String value2) {
            addCriterion("t_name between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotBetween(String value1, String value2) {
            addCriterion("t_name not between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andO1dateIsNull() {
            addCriterion("o_1date is null");
            return (Criteria) this;
        }

        public Criteria andO1dateIsNotNull() {
            addCriterion("o_1date is not null");
            return (Criteria) this;
        }

        public Criteria andO1dateEqualTo(String value) {
            addCriterion("o_1date =", value, "o1date");
            return (Criteria) this;
        }

        public Criteria andO1dateNotEqualTo(String value) {
            addCriterion("o_1date <>", value, "o1date");
            return (Criteria) this;
        }

        public Criteria andO1dateGreaterThan(String value) {
            addCriterion("o_1date >", value, "o1date");
            return (Criteria) this;
        }

        public Criteria andO1dateGreaterThanOrEqualTo(String value) {
            addCriterion("o_1date >=", value, "o1date");
            return (Criteria) this;
        }

        public Criteria andO1dateLessThan(String value) {
            addCriterion("o_1date <", value, "o1date");
            return (Criteria) this;
        }

        public Criteria andO1dateLessThanOrEqualTo(String value) {
            addCriterion("o_1date <=", value, "o1date");
            return (Criteria) this;
        }

        public Criteria andO1dateLike(String value) {
            addCriterion("o_1date like", value, "o1date");
            return (Criteria) this;
        }

        public Criteria andO1dateNotLike(String value) {
            addCriterion("o_1date not like", value, "o1date");
            return (Criteria) this;
        }

        public Criteria andO1dateIn(List<String> values) {
            addCriterion("o_1date in", values, "o1date");
            return (Criteria) this;
        }

        public Criteria andO1dateNotIn(List<String> values) {
            addCriterion("o_1date not in", values, "o1date");
            return (Criteria) this;
        }

        public Criteria andO1dateBetween(String value1, String value2) {
            addCriterion("o_1date between", value1, value2, "o1date");
            return (Criteria) this;
        }

        public Criteria andO1dateNotBetween(String value1, String value2) {
            addCriterion("o_1date not between", value1, value2, "o1date");
            return (Criteria) this;
        }

        public Criteria andO2dateIsNull() {
            addCriterion("o_2date is null");
            return (Criteria) this;
        }

        public Criteria andO2dateIsNotNull() {
            addCriterion("o_2date is not null");
            return (Criteria) this;
        }

        public Criteria andO2dateEqualTo(String value) {
            addCriterion("o_2date =", value, "o2date");
            return (Criteria) this;
        }

        public Criteria andO2dateNotEqualTo(String value) {
            addCriterion("o_2date <>", value, "o2date");
            return (Criteria) this;
        }

        public Criteria andO2dateGreaterThan(String value) {
            addCriterion("o_2date >", value, "o2date");
            return (Criteria) this;
        }

        public Criteria andO2dateGreaterThanOrEqualTo(String value) {
            addCriterion("o_2date >=", value, "o2date");
            return (Criteria) this;
        }

        public Criteria andO2dateLessThan(String value) {
            addCriterion("o_2date <", value, "o2date");
            return (Criteria) this;
        }

        public Criteria andO2dateLessThanOrEqualTo(String value) {
            addCriterion("o_2date <=", value, "o2date");
            return (Criteria) this;
        }

        public Criteria andO2dateLike(String value) {
            addCriterion("o_2date like", value, "o2date");
            return (Criteria) this;
        }

        public Criteria andO2dateNotLike(String value) {
            addCriterion("o_2date not like", value, "o2date");
            return (Criteria) this;
        }

        public Criteria andO2dateIn(List<String> values) {
            addCriterion("o_2date in", values, "o2date");
            return (Criteria) this;
        }

        public Criteria andO2dateNotIn(List<String> values) {
            addCriterion("o_2date not in", values, "o2date");
            return (Criteria) this;
        }

        public Criteria andO2dateBetween(String value1, String value2) {
            addCriterion("o_2date between", value1, value2, "o2date");
            return (Criteria) this;
        }

        public Criteria andO2dateNotBetween(String value1, String value2) {
            addCriterion("o_2date not between", value1, value2, "o2date");
            return (Criteria) this;
        }

        public Criteria andO3dateIsNull() {
            addCriterion("o_3date is null");
            return (Criteria) this;
        }

        public Criteria andO3dateIsNotNull() {
            addCriterion("o_3date is not null");
            return (Criteria) this;
        }

        public Criteria andO3dateEqualTo(String value) {
            addCriterion("o_3date =", value, "o3date");
            return (Criteria) this;
        }

        public Criteria andO3dateNotEqualTo(String value) {
            addCriterion("o_3date <>", value, "o3date");
            return (Criteria) this;
        }

        public Criteria andO3dateGreaterThan(String value) {
            addCriterion("o_3date >", value, "o3date");
            return (Criteria) this;
        }

        public Criteria andO3dateGreaterThanOrEqualTo(String value) {
            addCriterion("o_3date >=", value, "o3date");
            return (Criteria) this;
        }

        public Criteria andO3dateLessThan(String value) {
            addCriterion("o_3date <", value, "o3date");
            return (Criteria) this;
        }

        public Criteria andO3dateLessThanOrEqualTo(String value) {
            addCriterion("o_3date <=", value, "o3date");
            return (Criteria) this;
        }

        public Criteria andO3dateLike(String value) {
            addCriterion("o_3date like", value, "o3date");
            return (Criteria) this;
        }

        public Criteria andO3dateNotLike(String value) {
            addCriterion("o_3date not like", value, "o3date");
            return (Criteria) this;
        }

        public Criteria andO3dateIn(List<String> values) {
            addCriterion("o_3date in", values, "o3date");
            return (Criteria) this;
        }

        public Criteria andO3dateNotIn(List<String> values) {
            addCriterion("o_3date not in", values, "o3date");
            return (Criteria) this;
        }

        public Criteria andO3dateBetween(String value1, String value2) {
            addCriterion("o_3date between", value1, value2, "o3date");
            return (Criteria) this;
        }

        public Criteria andO3dateNotBetween(String value1, String value2) {
            addCriterion("o_3date not between", value1, value2, "o3date");
            return (Criteria) this;
        }

        public Criteria andO4dateIsNull() {
            addCriterion("o_4date is null");
            return (Criteria) this;
        }

        public Criteria andO4dateIsNotNull() {
            addCriterion("o_4date is not null");
            return (Criteria) this;
        }

        public Criteria andO4dateEqualTo(String value) {
            addCriterion("o_4date =", value, "o4date");
            return (Criteria) this;
        }

        public Criteria andO4dateNotEqualTo(String value) {
            addCriterion("o_4date <>", value, "o4date");
            return (Criteria) this;
        }

        public Criteria andO4dateGreaterThan(String value) {
            addCriterion("o_4date >", value, "o4date");
            return (Criteria) this;
        }

        public Criteria andO4dateGreaterThanOrEqualTo(String value) {
            addCriterion("o_4date >=", value, "o4date");
            return (Criteria) this;
        }

        public Criteria andO4dateLessThan(String value) {
            addCriterion("o_4date <", value, "o4date");
            return (Criteria) this;
        }

        public Criteria andO4dateLessThanOrEqualTo(String value) {
            addCriterion("o_4date <=", value, "o4date");
            return (Criteria) this;
        }

        public Criteria andO4dateLike(String value) {
            addCriterion("o_4date like", value, "o4date");
            return (Criteria) this;
        }

        public Criteria andO4dateNotLike(String value) {
            addCriterion("o_4date not like", value, "o4date");
            return (Criteria) this;
        }

        public Criteria andO4dateIn(List<String> values) {
            addCriterion("o_4date in", values, "o4date");
            return (Criteria) this;
        }

        public Criteria andO4dateNotIn(List<String> values) {
            addCriterion("o_4date not in", values, "o4date");
            return (Criteria) this;
        }

        public Criteria andO4dateBetween(String value1, String value2) {
            addCriterion("o_4date between", value1, value2, "o4date");
            return (Criteria) this;
        }

        public Criteria andO4dateNotBetween(String value1, String value2) {
            addCriterion("o_4date not between", value1, value2, "o4date");
            return (Criteria) this;
        }

        public Criteria andO1payIsNull() {
            addCriterion("o_1pay is null");
            return (Criteria) this;
        }

        public Criteria andO1payIsNotNull() {
            addCriterion("o_1pay is not null");
            return (Criteria) this;
        }

        public Criteria andO1payEqualTo(Boolean value) {
            addCriterion("o_1pay =", value, "o1pay");
            return (Criteria) this;
        }

        public Criteria andO1payNotEqualTo(Boolean value) {
            addCriterion("o_1pay <>", value, "o1pay");
            return (Criteria) this;
        }

        public Criteria andO1payGreaterThan(Boolean value) {
            addCriterion("o_1pay >", value, "o1pay");
            return (Criteria) this;
        }

        public Criteria andO1payGreaterThanOrEqualTo(Boolean value) {
            addCriterion("o_1pay >=", value, "o1pay");
            return (Criteria) this;
        }

        public Criteria andO1payLessThan(Boolean value) {
            addCriterion("o_1pay <", value, "o1pay");
            return (Criteria) this;
        }

        public Criteria andO1payLessThanOrEqualTo(Boolean value) {
            addCriterion("o_1pay <=", value, "o1pay");
            return (Criteria) this;
        }

        public Criteria andO1payIn(List<Boolean> values) {
            addCriterion("o_1pay in", values, "o1pay");
            return (Criteria) this;
        }

        public Criteria andO1payNotIn(List<Boolean> values) {
            addCriterion("o_1pay not in", values, "o1pay");
            return (Criteria) this;
        }

        public Criteria andO1payBetween(Boolean value1, Boolean value2) {
            addCriterion("o_1pay between", value1, value2, "o1pay");
            return (Criteria) this;
        }

        public Criteria andO1payNotBetween(Boolean value1, Boolean value2) {
            addCriterion("o_1pay not between", value1, value2, "o1pay");
            return (Criteria) this;
        }

        public Criteria andO2payIsNull() {
            addCriterion("o_2pay is null");
            return (Criteria) this;
        }

        public Criteria andO2payIsNotNull() {
            addCriterion("o_2pay is not null");
            return (Criteria) this;
        }

        public Criteria andO2payEqualTo(Boolean value) {
            addCriterion("o_2pay =", value, "o2pay");
            return (Criteria) this;
        }

        public Criteria andO2payNotEqualTo(Boolean value) {
            addCriterion("o_2pay <>", value, "o2pay");
            return (Criteria) this;
        }

        public Criteria andO2payGreaterThan(Boolean value) {
            addCriterion("o_2pay >", value, "o2pay");
            return (Criteria) this;
        }

        public Criteria andO2payGreaterThanOrEqualTo(Boolean value) {
            addCriterion("o_2pay >=", value, "o2pay");
            return (Criteria) this;
        }

        public Criteria andO2payLessThan(Boolean value) {
            addCriterion("o_2pay <", value, "o2pay");
            return (Criteria) this;
        }

        public Criteria andO2payLessThanOrEqualTo(Boolean value) {
            addCriterion("o_2pay <=", value, "o2pay");
            return (Criteria) this;
        }

        public Criteria andO2payIn(List<Boolean> values) {
            addCriterion("o_2pay in", values, "o2pay");
            return (Criteria) this;
        }

        public Criteria andO2payNotIn(List<Boolean> values) {
            addCriterion("o_2pay not in", values, "o2pay");
            return (Criteria) this;
        }

        public Criteria andO2payBetween(Boolean value1, Boolean value2) {
            addCriterion("o_2pay between", value1, value2, "o2pay");
            return (Criteria) this;
        }

        public Criteria andO2payNotBetween(Boolean value1, Boolean value2) {
            addCriterion("o_2pay not between", value1, value2, "o2pay");
            return (Criteria) this;
        }

        public Criteria andO3payIsNull() {
            addCriterion("o_3pay is null");
            return (Criteria) this;
        }

        public Criteria andO3payIsNotNull() {
            addCriterion("o_3pay is not null");
            return (Criteria) this;
        }

        public Criteria andO3payEqualTo(Boolean value) {
            addCriterion("o_3pay =", value, "o3pay");
            return (Criteria) this;
        }

        public Criteria andO3payNotEqualTo(Boolean value) {
            addCriterion("o_3pay <>", value, "o3pay");
            return (Criteria) this;
        }

        public Criteria andO3payGreaterThan(Boolean value) {
            addCriterion("o_3pay >", value, "o3pay");
            return (Criteria) this;
        }

        public Criteria andO3payGreaterThanOrEqualTo(Boolean value) {
            addCriterion("o_3pay >=", value, "o3pay");
            return (Criteria) this;
        }

        public Criteria andO3payLessThan(Boolean value) {
            addCriterion("o_3pay <", value, "o3pay");
            return (Criteria) this;
        }

        public Criteria andO3payLessThanOrEqualTo(Boolean value) {
            addCriterion("o_3pay <=", value, "o3pay");
            return (Criteria) this;
        }

        public Criteria andO3payIn(List<Boolean> values) {
            addCriterion("o_3pay in", values, "o3pay");
            return (Criteria) this;
        }

        public Criteria andO3payNotIn(List<Boolean> values) {
            addCriterion("o_3pay not in", values, "o3pay");
            return (Criteria) this;
        }

        public Criteria andO3payBetween(Boolean value1, Boolean value2) {
            addCriterion("o_3pay between", value1, value2, "o3pay");
            return (Criteria) this;
        }

        public Criteria andO3payNotBetween(Boolean value1, Boolean value2) {
            addCriterion("o_3pay not between", value1, value2, "o3pay");
            return (Criteria) this;
        }

        public Criteria andO4payIsNull() {
            addCriterion("o_4pay is null");
            return (Criteria) this;
        }

        public Criteria andO4payIsNotNull() {
            addCriterion("o_4pay is not null");
            return (Criteria) this;
        }

        public Criteria andO4payEqualTo(Boolean value) {
            addCriterion("o_4pay =", value, "o4pay");
            return (Criteria) this;
        }

        public Criteria andO4payNotEqualTo(Boolean value) {
            addCriterion("o_4pay <>", value, "o4pay");
            return (Criteria) this;
        }

        public Criteria andO4payGreaterThan(Boolean value) {
            addCriterion("o_4pay >", value, "o4pay");
            return (Criteria) this;
        }

        public Criteria andO4payGreaterThanOrEqualTo(Boolean value) {
            addCriterion("o_4pay >=", value, "o4pay");
            return (Criteria) this;
        }

        public Criteria andO4payLessThan(Boolean value) {
            addCriterion("o_4pay <", value, "o4pay");
            return (Criteria) this;
        }

        public Criteria andO4payLessThanOrEqualTo(Boolean value) {
            addCriterion("o_4pay <=", value, "o4pay");
            return (Criteria) this;
        }

        public Criteria andO4payIn(List<Boolean> values) {
            addCriterion("o_4pay in", values, "o4pay");
            return (Criteria) this;
        }

        public Criteria andO4payNotIn(List<Boolean> values) {
            addCriterion("o_4pay not in", values, "o4pay");
            return (Criteria) this;
        }

        public Criteria andO4payBetween(Boolean value1, Boolean value2) {
            addCriterion("o_4pay between", value1, value2, "o4pay");
            return (Criteria) this;
        }

        public Criteria andO4payNotBetween(Boolean value1, Boolean value2) {
            addCriterion("o_4pay not between", value1, value2, "o4pay");
            return (Criteria) this;
        }

        public Criteria andEnEvaluationIsNull() {
            addCriterion("en_evaluation is null");
            return (Criteria) this;
        }

        public Criteria andEnEvaluationIsNotNull() {
            addCriterion("en_evaluation is not null");
            return (Criteria) this;
        }

        public Criteria andEnEvaluationEqualTo(Integer value) {
            addCriterion("en_evaluation =", value, "enEvaluation");
            return (Criteria) this;
        }

        public Criteria andEnEvaluationNotEqualTo(Integer value) {
            addCriterion("en_evaluation <>", value, "enEvaluation");
            return (Criteria) this;
        }

        public Criteria andEnEvaluationGreaterThan(Integer value) {
            addCriterion("en_evaluation >", value, "enEvaluation");
            return (Criteria) this;
        }

        public Criteria andEnEvaluationGreaterThanOrEqualTo(Integer value) {
            addCriterion("en_evaluation >=", value, "enEvaluation");
            return (Criteria) this;
        }

        public Criteria andEnEvaluationLessThan(Integer value) {
            addCriterion("en_evaluation <", value, "enEvaluation");
            return (Criteria) this;
        }

        public Criteria andEnEvaluationLessThanOrEqualTo(Integer value) {
            addCriterion("en_evaluation <=", value, "enEvaluation");
            return (Criteria) this;
        }

        public Criteria andEnEvaluationIn(List<Integer> values) {
            addCriterion("en_evaluation in", values, "enEvaluation");
            return (Criteria) this;
        }

        public Criteria andEnEvaluationNotIn(List<Integer> values) {
            addCriterion("en_evaluation not in", values, "enEvaluation");
            return (Criteria) this;
        }

        public Criteria andEnEvaluationBetween(Integer value1, Integer value2) {
            addCriterion("en_evaluation between", value1, value2, "enEvaluation");
            return (Criteria) this;
        }

        public Criteria andEnEvaluationNotBetween(Integer value1, Integer value2) {
            addCriterion("en_evaluation not between", value1, value2, "enEvaluation");
            return (Criteria) this;
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