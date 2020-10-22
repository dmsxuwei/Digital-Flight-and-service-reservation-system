package com.uow.po;

import java.util.ArrayList;
import java.util.List;

public class BalanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BalanceExample() {
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

        public Criteria andBalanceidIsNull() {
            addCriterion("balanceid is null");
            return (Criteria) this;
        }

        public Criteria andBalanceidIsNotNull() {
            addCriterion("balanceid is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceidEqualTo(String value) {
            addCriterion("balanceid =", value, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidNotEqualTo(String value) {
            addCriterion("balanceid <>", value, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidGreaterThan(String value) {
            addCriterion("balanceid >", value, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidGreaterThanOrEqualTo(String value) {
            addCriterion("balanceid >=", value, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidLessThan(String value) {
            addCriterion("balanceid <", value, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidLessThanOrEqualTo(String value) {
            addCriterion("balanceid <=", value, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidLike(String value) {
            addCriterion("balanceid like", value, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidNotLike(String value) {
            addCriterion("balanceid not like", value, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidIn(List<String> values) {
            addCriterion("balanceid in", values, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidNotIn(List<String> values) {
            addCriterion("balanceid not in", values, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidBetween(String value1, String value2) {
            addCriterion("balanceid between", value1, value2, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidNotBetween(String value1, String value2) {
            addCriterion("balanceid not between", value1, value2, "balanceid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerid is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerid is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(String value) {
            addCriterion("customerid =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(String value) {
            addCriterion("customerid <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(String value) {
            addCriterion("customerid >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(String value) {
            addCriterion("customerid >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(String value) {
            addCriterion("customerid <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(String value) {
            addCriterion("customerid <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLike(String value) {
            addCriterion("customerid like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotLike(String value) {
            addCriterion("customerid not like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<String> values) {
            addCriterion("customerid in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<String> values) {
            addCriterion("customerid not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(String value1, String value2) {
            addCriterion("customerid between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(String value1, String value2) {
            addCriterion("customerid not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andBalanceValueIsNull() {
            addCriterion("balance_value is null");
            return (Criteria) this;
        }

        public Criteria andBalanceValueIsNotNull() {
            addCriterion("balance_value is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceValueEqualTo(Integer value) {
            addCriterion("balance_value =", value, "balanceValue");
            return (Criteria) this;
        }

        public Criteria andBalanceValueNotEqualTo(Integer value) {
            addCriterion("balance_value <>", value, "balanceValue");
            return (Criteria) this;
        }

        public Criteria andBalanceValueGreaterThan(Integer value) {
            addCriterion("balance_value >", value, "balanceValue");
            return (Criteria) this;
        }

        public Criteria andBalanceValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("balance_value >=", value, "balanceValue");
            return (Criteria) this;
        }

        public Criteria andBalanceValueLessThan(Integer value) {
            addCriterion("balance_value <", value, "balanceValue");
            return (Criteria) this;
        }

        public Criteria andBalanceValueLessThanOrEqualTo(Integer value) {
            addCriterion("balance_value <=", value, "balanceValue");
            return (Criteria) this;
        }

        public Criteria andBalanceValueIn(List<Integer> values) {
            addCriterion("balance_value in", values, "balanceValue");
            return (Criteria) this;
        }

        public Criteria andBalanceValueNotIn(List<Integer> values) {
            addCriterion("balance_value not in", values, "balanceValue");
            return (Criteria) this;
        }

        public Criteria andBalanceValueBetween(Integer value1, Integer value2) {
            addCriterion("balance_value between", value1, value2, "balanceValue");
            return (Criteria) this;
        }

        public Criteria andBalanceValueNotBetween(Integer value1, Integer value2) {
            addCriterion("balance_value not between", value1, value2, "balanceValue");
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