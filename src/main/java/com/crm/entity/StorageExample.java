package com.crm.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StorageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StorageExample() {
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

        public Criteria andStkIdIsNull() {
            addCriterion("STK_ID is null");
            return (Criteria) this;
        }

        public Criteria andStkIdIsNotNull() {
            addCriterion("STK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStkIdEqualTo(BigDecimal value) {
            addCriterion("STK_ID =", value, "stkId");
            return (Criteria) this;
        }

        public Criteria andStkIdNotEqualTo(BigDecimal value) {
            addCriterion("STK_ID <>", value, "stkId");
            return (Criteria) this;
        }

        public Criteria andStkIdGreaterThan(BigDecimal value) {
            addCriterion("STK_ID >", value, "stkId");
            return (Criteria) this;
        }

        public Criteria andStkIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STK_ID >=", value, "stkId");
            return (Criteria) this;
        }

        public Criteria andStkIdLessThan(BigDecimal value) {
            addCriterion("STK_ID <", value, "stkId");
            return (Criteria) this;
        }

        public Criteria andStkIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STK_ID <=", value, "stkId");
            return (Criteria) this;
        }

        public Criteria andStkIdIn(List<BigDecimal> values) {
            addCriterion("STK_ID in", values, "stkId");
            return (Criteria) this;
        }

        public Criteria andStkIdNotIn(List<BigDecimal> values) {
            addCriterion("STK_ID not in", values, "stkId");
            return (Criteria) this;
        }

        public Criteria andStkIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STK_ID between", value1, value2, "stkId");
            return (Criteria) this;
        }

        public Criteria andStkIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STK_ID not between", value1, value2, "stkId");
            return (Criteria) this;
        }

        public Criteria andStkProdIdIsNull() {
            addCriterion("STK_PROD_ID is null");
            return (Criteria) this;
        }

        public Criteria andStkProdIdIsNotNull() {
            addCriterion("STK_PROD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStkProdIdEqualTo(BigDecimal value) {
            addCriterion("STK_PROD_ID =", value, "stkProdId");
            return (Criteria) this;
        }

        public Criteria andStkProdIdNotEqualTo(BigDecimal value) {
            addCriterion("STK_PROD_ID <>", value, "stkProdId");
            return (Criteria) this;
        }

        public Criteria andStkProdIdGreaterThan(BigDecimal value) {
            addCriterion("STK_PROD_ID >", value, "stkProdId");
            return (Criteria) this;
        }

        public Criteria andStkProdIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STK_PROD_ID >=", value, "stkProdId");
            return (Criteria) this;
        }

        public Criteria andStkProdIdLessThan(BigDecimal value) {
            addCriterion("STK_PROD_ID <", value, "stkProdId");
            return (Criteria) this;
        }

        public Criteria andStkProdIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STK_PROD_ID <=", value, "stkProdId");
            return (Criteria) this;
        }

        public Criteria andStkProdIdIn(List<BigDecimal> values) {
            addCriterion("STK_PROD_ID in", values, "stkProdId");
            return (Criteria) this;
        }

        public Criteria andStkProdIdNotIn(List<BigDecimal> values) {
            addCriterion("STK_PROD_ID not in", values, "stkProdId");
            return (Criteria) this;
        }

        public Criteria andStkProdIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STK_PROD_ID between", value1, value2, "stkProdId");
            return (Criteria) this;
        }

        public Criteria andStkProdIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STK_PROD_ID not between", value1, value2, "stkProdId");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseIsNull() {
            addCriterion("STK_WAREHOUSE is null");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseIsNotNull() {
            addCriterion("STK_WAREHOUSE is not null");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseEqualTo(String value) {
            addCriterion("STK_WAREHOUSE =", value, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseNotEqualTo(String value) {
            addCriterion("STK_WAREHOUSE <>", value, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseGreaterThan(String value) {
            addCriterion("STK_WAREHOUSE >", value, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("STK_WAREHOUSE >=", value, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseLessThan(String value) {
            addCriterion("STK_WAREHOUSE <", value, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseLessThanOrEqualTo(String value) {
            addCriterion("STK_WAREHOUSE <=", value, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseLike(String value) {
            addCriterion("STK_WAREHOUSE like", value, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseNotLike(String value) {
            addCriterion("STK_WAREHOUSE not like", value, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseIn(List<String> values) {
            addCriterion("STK_WAREHOUSE in", values, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseNotIn(List<String> values) {
            addCriterion("STK_WAREHOUSE not in", values, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseBetween(String value1, String value2) {
            addCriterion("STK_WAREHOUSE between", value1, value2, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseNotBetween(String value1, String value2) {
            addCriterion("STK_WAREHOUSE not between", value1, value2, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWareIsNull() {
            addCriterion("STK_WARE is null");
            return (Criteria) this;
        }

        public Criteria andStkWareIsNotNull() {
            addCriterion("STK_WARE is not null");
            return (Criteria) this;
        }

        public Criteria andStkWareEqualTo(String value) {
            addCriterion("STK_WARE =", value, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareNotEqualTo(String value) {
            addCriterion("STK_WARE <>", value, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareGreaterThan(String value) {
            addCriterion("STK_WARE >", value, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareGreaterThanOrEqualTo(String value) {
            addCriterion("STK_WARE >=", value, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareLessThan(String value) {
            addCriterion("STK_WARE <", value, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareLessThanOrEqualTo(String value) {
            addCriterion("STK_WARE <=", value, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareLike(String value) {
            addCriterion("STK_WARE like", value, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareNotLike(String value) {
            addCriterion("STK_WARE not like", value, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareIn(List<String> values) {
            addCriterion("STK_WARE in", values, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareNotIn(List<String> values) {
            addCriterion("STK_WARE not in", values, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareBetween(String value1, String value2) {
            addCriterion("STK_WARE between", value1, value2, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareNotBetween(String value1, String value2) {
            addCriterion("STK_WARE not between", value1, value2, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkCountIsNull() {
            addCriterion("STK_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andStkCountIsNotNull() {
            addCriterion("STK_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andStkCountEqualTo(Long value) {
            addCriterion("STK_COUNT =", value, "stkCount");
            return (Criteria) this;
        }

        public Criteria andStkCountNotEqualTo(Long value) {
            addCriterion("STK_COUNT <>", value, "stkCount");
            return (Criteria) this;
        }

        public Criteria andStkCountGreaterThan(Long value) {
            addCriterion("STK_COUNT >", value, "stkCount");
            return (Criteria) this;
        }

        public Criteria andStkCountGreaterThanOrEqualTo(Long value) {
            addCriterion("STK_COUNT >=", value, "stkCount");
            return (Criteria) this;
        }

        public Criteria andStkCountLessThan(Long value) {
            addCriterion("STK_COUNT <", value, "stkCount");
            return (Criteria) this;
        }

        public Criteria andStkCountLessThanOrEqualTo(Long value) {
            addCriterion("STK_COUNT <=", value, "stkCount");
            return (Criteria) this;
        }

        public Criteria andStkCountIn(List<Long> values) {
            addCriterion("STK_COUNT in", values, "stkCount");
            return (Criteria) this;
        }

        public Criteria andStkCountNotIn(List<Long> values) {
            addCriterion("STK_COUNT not in", values, "stkCount");
            return (Criteria) this;
        }

        public Criteria andStkCountBetween(Long value1, Long value2) {
            addCriterion("STK_COUNT between", value1, value2, "stkCount");
            return (Criteria) this;
        }

        public Criteria andStkCountNotBetween(Long value1, Long value2) {
            addCriterion("STK_COUNT not between", value1, value2, "stkCount");
            return (Criteria) this;
        }

        public Criteria andStkMemoIsNull() {
            addCriterion("STK_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andStkMemoIsNotNull() {
            addCriterion("STK_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andStkMemoEqualTo(String value) {
            addCriterion("STK_MEMO =", value, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoNotEqualTo(String value) {
            addCriterion("STK_MEMO <>", value, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoGreaterThan(String value) {
            addCriterion("STK_MEMO >", value, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoGreaterThanOrEqualTo(String value) {
            addCriterion("STK_MEMO >=", value, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoLessThan(String value) {
            addCriterion("STK_MEMO <", value, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoLessThanOrEqualTo(String value) {
            addCriterion("STK_MEMO <=", value, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoLike(String value) {
            addCriterion("STK_MEMO like", value, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoNotLike(String value) {
            addCriterion("STK_MEMO not like", value, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoIn(List<String> values) {
            addCriterion("STK_MEMO in", values, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoNotIn(List<String> values) {
            addCriterion("STK_MEMO not in", values, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoBetween(String value1, String value2) {
            addCriterion("STK_MEMO between", value1, value2, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoNotBetween(String value1, String value2) {
            addCriterion("STK_MEMO not between", value1, value2, "stkMemo");
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