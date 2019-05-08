package com.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TenderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TenderExample() {
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

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(Integer value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(Integer value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(Integer value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(Integer value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<Integer> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<Integer> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(Integer value1, Integer value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTTnameIsNull() {
            addCriterion("t_tname is null");
            return (Criteria) this;
        }

        public Criteria andTTnameIsNotNull() {
            addCriterion("t_tname is not null");
            return (Criteria) this;
        }

        public Criteria andTTnameEqualTo(String value) {
            addCriterion("t_tname =", value, "tTname");
            return (Criteria) this;
        }

        public Criteria andTTnameNotEqualTo(String value) {
            addCriterion("t_tname <>", value, "tTname");
            return (Criteria) this;
        }

        public Criteria andTTnameGreaterThan(String value) {
            addCriterion("t_tname >", value, "tTname");
            return (Criteria) this;
        }

        public Criteria andTTnameGreaterThanOrEqualTo(String value) {
            addCriterion("t_tname >=", value, "tTname");
            return (Criteria) this;
        }

        public Criteria andTTnameLessThan(String value) {
            addCriterion("t_tname <", value, "tTname");
            return (Criteria) this;
        }

        public Criteria andTTnameLessThanOrEqualTo(String value) {
            addCriterion("t_tname <=", value, "tTname");
            return (Criteria) this;
        }

        public Criteria andTTnameLike(String value) {
            addCriterion("t_tname like", value, "tTname");
            return (Criteria) this;
        }

        public Criteria andTTnameNotLike(String value) {
            addCriterion("t_tname not like", value, "tTname");
            return (Criteria) this;
        }

        public Criteria andTTnameIn(List<String> values) {
            addCriterion("t_tname in", values, "tTname");
            return (Criteria) this;
        }

        public Criteria andTTnameNotIn(List<String> values) {
            addCriterion("t_tname not in", values, "tTname");
            return (Criteria) this;
        }

        public Criteria andTTnameBetween(String value1, String value2) {
            addCriterion("t_tname between", value1, value2, "tTname");
            return (Criteria) this;
        }

        public Criteria andTTnameNotBetween(String value1, String value2) {
            addCriterion("t_tname not between", value1, value2, "tTname");
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

        public Criteria andTPhoneIsNull() {
            addCriterion("t_phone is null");
            return (Criteria) this;
        }

        public Criteria andTPhoneIsNotNull() {
            addCriterion("t_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTPhoneEqualTo(String value) {
            addCriterion("t_phone =", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotEqualTo(String value) {
            addCriterion("t_phone <>", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneGreaterThan(String value) {
            addCriterion("t_phone >", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("t_phone >=", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneLessThan(String value) {
            addCriterion("t_phone <", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneLessThanOrEqualTo(String value) {
            addCriterion("t_phone <=", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneLike(String value) {
            addCriterion("t_phone like", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotLike(String value) {
            addCriterion("t_phone not like", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneIn(List<String> values) {
            addCriterion("t_phone in", values, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotIn(List<String> values) {
            addCriterion("t_phone not in", values, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneBetween(String value1, String value2) {
            addCriterion("t_phone between", value1, value2, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotBetween(String value1, String value2) {
            addCriterion("t_phone not between", value1, value2, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTEmailIsNull() {
            addCriterion("t_email is null");
            return (Criteria) this;
        }

        public Criteria andTEmailIsNotNull() {
            addCriterion("t_email is not null");
            return (Criteria) this;
        }

        public Criteria andTEmailEqualTo(String value) {
            addCriterion("t_email =", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailNotEqualTo(String value) {
            addCriterion("t_email <>", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailGreaterThan(String value) {
            addCriterion("t_email >", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailGreaterThanOrEqualTo(String value) {
            addCriterion("t_email >=", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailLessThan(String value) {
            addCriterion("t_email <", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailLessThanOrEqualTo(String value) {
            addCriterion("t_email <=", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailLike(String value) {
            addCriterion("t_email like", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailNotLike(String value) {
            addCriterion("t_email not like", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailIn(List<String> values) {
            addCriterion("t_email in", values, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailNotIn(List<String> values) {
            addCriterion("t_email not in", values, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailBetween(String value1, String value2) {
            addCriterion("t_email between", value1, value2, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailNotBetween(String value1, String value2) {
            addCriterion("t_email not between", value1, value2, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTStartdateIsNull() {
            addCriterion("t_startdate is null");
            return (Criteria) this;
        }

        public Criteria andTStartdateIsNotNull() {
            addCriterion("t_startdate is not null");
            return (Criteria) this;
        }

        public Criteria andTStartdateEqualTo(String value) {
            addCriterion("t_startdate =", value, "tStartdate");
            return (Criteria) this;
        }

        public Criteria andTStartdateNotEqualTo(String value) {
            addCriterion("t_startdate <>", value, "tStartdate");
            return (Criteria) this;
        }

        public Criteria andTStartdateGreaterThan(String value) {
            addCriterion("t_startdate >", value, "tStartdate");
            return (Criteria) this;
        }

        public Criteria andTStartdateGreaterThanOrEqualTo(String value) {
            addCriterion("t_startdate >=", value, "tStartdate");
            return (Criteria) this;
        }

        public Criteria andTStartdateLessThan(String value) {
            addCriterion("t_startdate <", value, "tStartdate");
            return (Criteria) this;
        }

        public Criteria andTStartdateLessThanOrEqualTo(String value) {
            addCriterion("t_startdate <=", value, "tStartdate");
            return (Criteria) this;
        }

        public Criteria andTStartdateLike(String value) {
            addCriterion("t_startdate like", value, "tStartdate");
            return (Criteria) this;
        }

        public Criteria andTStartdateNotLike(String value) {
            addCriterion("t_startdate not like", value, "tStartdate");
            return (Criteria) this;
        }

        public Criteria andTStartdateIn(List<String> values) {
            addCriterion("t_startdate in", values, "tStartdate");
            return (Criteria) this;
        }

        public Criteria andTStartdateNotIn(List<String> values) {
            addCriterion("t_startdate not in", values, "tStartdate");
            return (Criteria) this;
        }

        public Criteria andTStartdateBetween(String value1, String value2) {
            addCriterion("t_startdate between", value1, value2, "tStartdate");
            return (Criteria) this;
        }

        public Criteria andTStartdateNotBetween(String value1, String value2) {
            addCriterion("t_startdate not between", value1, value2, "tStartdate");
            return (Criteria) this;
        }

        public Criteria andTTxtIsNull() {
            addCriterion("t_txt is null");
            return (Criteria) this;
        }

        public Criteria andTTxtIsNotNull() {
            addCriterion("t_txt is not null");
            return (Criteria) this;
        }

        public Criteria andTTxtEqualTo(String value) {
            addCriterion("t_txt =", value, "tTxt");
            return (Criteria) this;
        }

        public Criteria andTTxtNotEqualTo(String value) {
            addCriterion("t_txt <>", value, "tTxt");
            return (Criteria) this;
        }

        public Criteria andTTxtGreaterThan(String value) {
            addCriterion("t_txt >", value, "tTxt");
            return (Criteria) this;
        }

        public Criteria andTTxtGreaterThanOrEqualTo(String value) {
            addCriterion("t_txt >=", value, "tTxt");
            return (Criteria) this;
        }

        public Criteria andTTxtLessThan(String value) {
            addCriterion("t_txt <", value, "tTxt");
            return (Criteria) this;
        }

        public Criteria andTTxtLessThanOrEqualTo(String value) {
            addCriterion("t_txt <=", value, "tTxt");
            return (Criteria) this;
        }

        public Criteria andTTxtLike(String value) {
            addCriterion("t_txt like", value, "tTxt");
            return (Criteria) this;
        }

        public Criteria andTTxtNotLike(String value) {
            addCriterion("t_txt not like", value, "tTxt");
            return (Criteria) this;
        }

        public Criteria andTTxtIn(List<String> values) {
            addCriterion("t_txt in", values, "tTxt");
            return (Criteria) this;
        }

        public Criteria andTTxtNotIn(List<String> values) {
            addCriterion("t_txt not in", values, "tTxt");
            return (Criteria) this;
        }

        public Criteria andTTxtBetween(String value1, String value2) {
            addCriterion("t_txt between", value1, value2, "tTxt");
            return (Criteria) this;
        }

        public Criteria andTTxtNotBetween(String value1, String value2) {
            addCriterion("t_txt not between", value1, value2, "tTxt");
            return (Criteria) this;
        }

        public Criteria andTInfoIsNull() {
            addCriterion("t_info is null");
            return (Criteria) this;
        }

        public Criteria andTInfoIsNotNull() {
            addCriterion("t_info is not null");
            return (Criteria) this;
        }

        public Criteria andTInfoEqualTo(String value) {
            addCriterion("t_info =", value, "tInfo");
            return (Criteria) this;
        }

        public Criteria andTInfoNotEqualTo(String value) {
            addCriterion("t_info <>", value, "tInfo");
            return (Criteria) this;
        }

        public Criteria andTInfoGreaterThan(String value) {
            addCriterion("t_info >", value, "tInfo");
            return (Criteria) this;
        }

        public Criteria andTInfoGreaterThanOrEqualTo(String value) {
            addCriterion("t_info >=", value, "tInfo");
            return (Criteria) this;
        }

        public Criteria andTInfoLessThan(String value) {
            addCriterion("t_info <", value, "tInfo");
            return (Criteria) this;
        }

        public Criteria andTInfoLessThanOrEqualTo(String value) {
            addCriterion("t_info <=", value, "tInfo");
            return (Criteria) this;
        }

        public Criteria andTInfoLike(String value) {
            addCriterion("t_info like", value, "tInfo");
            return (Criteria) this;
        }

        public Criteria andTInfoNotLike(String value) {
            addCriterion("t_info not like", value, "tInfo");
            return (Criteria) this;
        }

        public Criteria andTInfoIn(List<String> values) {
            addCriterion("t_info in", values, "tInfo");
            return (Criteria) this;
        }

        public Criteria andTInfoNotIn(List<String> values) {
            addCriterion("t_info not in", values, "tInfo");
            return (Criteria) this;
        }

        public Criteria andTInfoBetween(String value1, String value2) {
            addCriterion("t_info between", value1, value2, "tInfo");
            return (Criteria) this;
        }

        public Criteria andTInfoNotBetween(String value1, String value2) {
            addCriterion("t_info not between", value1, value2, "tInfo");
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

        public Criteria andTEnddateIsNull() {
            addCriterion("t_enddate is null");
            return (Criteria) this;
        }

        public Criteria andTEnddateIsNotNull() {
            addCriterion("t_enddate is not null");
            return (Criteria) this;
        }

        public Criteria andTEnddateEqualTo(String value) {
            addCriterion("t_enddate =", value, "tEnddate");
            return (Criteria) this;
        }

        public Criteria andTEnddateNotEqualTo(String value) {
            addCriterion("t_enddate <>", value, "tEnddate");
            return (Criteria) this;
        }

        public Criteria andTEnddateGreaterThan(String value) {
            addCriterion("t_enddate >", value, "tEnddate");
            return (Criteria) this;
        }

        public Criteria andTEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("t_enddate >=", value, "tEnddate");
            return (Criteria) this;
        }

        public Criteria andTEnddateLessThan(String value) {
            addCriterion("t_enddate <", value, "tEnddate");
            return (Criteria) this;
        }

        public Criteria andTEnddateLessThanOrEqualTo(String value) {
            addCriterion("t_enddate <=", value, "tEnddate");
            return (Criteria) this;
        }

        public Criteria andTEnddateLike(String value) {
            addCriterion("t_enddate like", value, "tEnddate");
            return (Criteria) this;
        }

        public Criteria andTEnddateNotLike(String value) {
            addCriterion("t_enddate not like", value, "tEnddate");
            return (Criteria) this;
        }

        public Criteria andTEnddateIn(List<String> values) {
            addCriterion("t_enddate in", values, "tEnddate");
            return (Criteria) this;
        }

        public Criteria andTEnddateNotIn(List<String> values) {
            addCriterion("t_enddate not in", values, "tEnddate");
            return (Criteria) this;
        }

        public Criteria andTEnddateBetween(String value1, String value2) {
            addCriterion("t_enddate between", value1, value2, "tEnddate");
            return (Criteria) this;
        }

        public Criteria andTEnddateNotBetween(String value1, String value2) {
            addCriterion("t_enddate not between", value1, value2, "tEnddate");
            return (Criteria) this;
        }

        public Criteria andTAddpersonIsNull() {
            addCriterion("t_addperson is null");
            return (Criteria) this;
        }

        public Criteria andTAddpersonIsNotNull() {
            addCriterion("t_addperson is not null");
            return (Criteria) this;
        }

        public Criteria andTAddpersonEqualTo(Integer value) {
            addCriterion("t_addperson =", value, "tAddperson");
            return (Criteria) this;
        }

        public Criteria andTAddpersonNotEqualTo(Integer value) {
            addCriterion("t_addperson <>", value, "tAddperson");
            return (Criteria) this;
        }

        public Criteria andTAddpersonGreaterThan(Integer value) {
            addCriterion("t_addperson >", value, "tAddperson");
            return (Criteria) this;
        }

        public Criteria andTAddpersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_addperson >=", value, "tAddperson");
            return (Criteria) this;
        }

        public Criteria andTAddpersonLessThan(Integer value) {
            addCriterion("t_addperson <", value, "tAddperson");
            return (Criteria) this;
        }

        public Criteria andTAddpersonLessThanOrEqualTo(Integer value) {
            addCriterion("t_addperson <=", value, "tAddperson");
            return (Criteria) this;
        }

        public Criteria andTAddpersonIn(List<Integer> values) {
            addCriterion("t_addperson in", values, "tAddperson");
            return (Criteria) this;
        }

        public Criteria andTAddpersonNotIn(List<Integer> values) {
            addCriterion("t_addperson not in", values, "tAddperson");
            return (Criteria) this;
        }

        public Criteria andTAddpersonBetween(Integer value1, Integer value2) {
            addCriterion("t_addperson between", value1, value2, "tAddperson");
            return (Criteria) this;
        }

        public Criteria andTAddpersonNotBetween(Integer value1, Integer value2) {
            addCriterion("t_addperson not between", value1, value2, "tAddperson");
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