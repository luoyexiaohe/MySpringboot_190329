package com.hfy.example.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TasksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TasksExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDistributorNameIsNull() {
            addCriterion("distributor_name is null");
            return (Criteria) this;
        }

        public Criteria andDistributorNameIsNotNull() {
            addCriterion("distributor_name is not null");
            return (Criteria) this;
        }

        public Criteria andDistributorNameEqualTo(String value) {
            addCriterion("distributor_name =", value, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameNotEqualTo(String value) {
            addCriterion("distributor_name <>", value, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameGreaterThan(String value) {
            addCriterion("distributor_name >", value, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameGreaterThanOrEqualTo(String value) {
            addCriterion("distributor_name >=", value, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameLessThan(String value) {
            addCriterion("distributor_name <", value, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameLessThanOrEqualTo(String value) {
            addCriterion("distributor_name <=", value, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameLike(String value) {
            addCriterion("distributor_name like", value, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameNotLike(String value) {
            addCriterion("distributor_name not like", value, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameIn(List<String> values) {
            addCriterion("distributor_name in", values, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameNotIn(List<String> values) {
            addCriterion("distributor_name not in", values, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameBetween(String value1, String value2) {
            addCriterion("distributor_name between", value1, value2, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameNotBetween(String value1, String value2) {
            addCriterion("distributor_name not between", value1, value2, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorIdIsNull() {
            addCriterion("distributor_id is null");
            return (Criteria) this;
        }

        public Criteria andDistributorIdIsNotNull() {
            addCriterion("distributor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistributorIdEqualTo(Integer value) {
            addCriterion("distributor_id =", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdNotEqualTo(Integer value) {
            addCriterion("distributor_id <>", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdGreaterThan(Integer value) {
            addCriterion("distributor_id >", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("distributor_id >=", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdLessThan(Integer value) {
            addCriterion("distributor_id <", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdLessThanOrEqualTo(Integer value) {
            addCriterion("distributor_id <=", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdIn(List<Integer> values) {
            addCriterion("distributor_id in", values, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdNotIn(List<Integer> values) {
            addCriterion("distributor_id not in", values, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdBetween(Integer value1, Integer value2) {
            addCriterion("distributor_id between", value1, value2, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("distributor_id not between", value1, value2, "distributorId");
            return (Criteria) this;
        }

        public Criteria andExecutantNameIsNull() {
            addCriterion("executant_name is null");
            return (Criteria) this;
        }

        public Criteria andExecutantNameIsNotNull() {
            addCriterion("executant_name is not null");
            return (Criteria) this;
        }

        public Criteria andExecutantNameEqualTo(String value) {
            addCriterion("executant_name =", value, "executantName");
            return (Criteria) this;
        }

        public Criteria andExecutantNameNotEqualTo(String value) {
            addCriterion("executant_name <>", value, "executantName");
            return (Criteria) this;
        }

        public Criteria andExecutantNameGreaterThan(String value) {
            addCriterion("executant_name >", value, "executantName");
            return (Criteria) this;
        }

        public Criteria andExecutantNameGreaterThanOrEqualTo(String value) {
            addCriterion("executant_name >=", value, "executantName");
            return (Criteria) this;
        }

        public Criteria andExecutantNameLessThan(String value) {
            addCriterion("executant_name <", value, "executantName");
            return (Criteria) this;
        }

        public Criteria andExecutantNameLessThanOrEqualTo(String value) {
            addCriterion("executant_name <=", value, "executantName");
            return (Criteria) this;
        }

        public Criteria andExecutantNameLike(String value) {
            addCriterion("executant_name like", value, "executantName");
            return (Criteria) this;
        }

        public Criteria andExecutantNameNotLike(String value) {
            addCriterion("executant_name not like", value, "executantName");
            return (Criteria) this;
        }

        public Criteria andExecutantNameIn(List<String> values) {
            addCriterion("executant_name in", values, "executantName");
            return (Criteria) this;
        }

        public Criteria andExecutantNameNotIn(List<String> values) {
            addCriterion("executant_name not in", values, "executantName");
            return (Criteria) this;
        }

        public Criteria andExecutantNameBetween(String value1, String value2) {
            addCriterion("executant_name between", value1, value2, "executantName");
            return (Criteria) this;
        }

        public Criteria andExecutantNameNotBetween(String value1, String value2) {
            addCriterion("executant_name not between", value1, value2, "executantName");
            return (Criteria) this;
        }

        public Criteria andExecutantIdIsNull() {
            addCriterion("executant_id is null");
            return (Criteria) this;
        }

        public Criteria andExecutantIdIsNotNull() {
            addCriterion("executant_id is not null");
            return (Criteria) this;
        }

        public Criteria andExecutantIdEqualTo(Integer value) {
            addCriterion("executant_id =", value, "executantId");
            return (Criteria) this;
        }

        public Criteria andExecutantIdNotEqualTo(Integer value) {
            addCriterion("executant_id <>", value, "executantId");
            return (Criteria) this;
        }

        public Criteria andExecutantIdGreaterThan(Integer value) {
            addCriterion("executant_id >", value, "executantId");
            return (Criteria) this;
        }

        public Criteria andExecutantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("executant_id >=", value, "executantId");
            return (Criteria) this;
        }

        public Criteria andExecutantIdLessThan(Integer value) {
            addCriterion("executant_id <", value, "executantId");
            return (Criteria) this;
        }

        public Criteria andExecutantIdLessThanOrEqualTo(Integer value) {
            addCriterion("executant_id <=", value, "executantId");
            return (Criteria) this;
        }

        public Criteria andExecutantIdIn(List<Integer> values) {
            addCriterion("executant_id in", values, "executantId");
            return (Criteria) this;
        }

        public Criteria andExecutantIdNotIn(List<Integer> values) {
            addCriterion("executant_id not in", values, "executantId");
            return (Criteria) this;
        }

        public Criteria andExecutantIdBetween(Integer value1, Integer value2) {
            addCriterion("executant_id between", value1, value2, "executantId");
            return (Criteria) this;
        }

        public Criteria andExecutantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("executant_id not between", value1, value2, "executantId");
            return (Criteria) this;
        }

        public Criteria andTaskDescribeIsNull() {
            addCriterion("task_describe is null");
            return (Criteria) this;
        }

        public Criteria andTaskDescribeIsNotNull() {
            addCriterion("task_describe is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDescribeEqualTo(String value) {
            addCriterion("task_describe =", value, "taskDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskDescribeNotEqualTo(String value) {
            addCriterion("task_describe <>", value, "taskDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskDescribeGreaterThan(String value) {
            addCriterion("task_describe >", value, "taskDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("task_describe >=", value, "taskDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskDescribeLessThan(String value) {
            addCriterion("task_describe <", value, "taskDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskDescribeLessThanOrEqualTo(String value) {
            addCriterion("task_describe <=", value, "taskDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskDescribeLike(String value) {
            addCriterion("task_describe like", value, "taskDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskDescribeNotLike(String value) {
            addCriterion("task_describe not like", value, "taskDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskDescribeIn(List<String> values) {
            addCriterion("task_describe in", values, "taskDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskDescribeNotIn(List<String> values) {
            addCriterion("task_describe not in", values, "taskDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskDescribeBetween(String value1, String value2) {
            addCriterion("task_describe between", value1, value2, "taskDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskDescribeNotBetween(String value1, String value2) {
            addCriterion("task_describe not between", value1, value2, "taskDescribe");
            return (Criteria) this;
        }

        public Criteria andFinishedMarkIsNull() {
            addCriterion("finished_mark is null");
            return (Criteria) this;
        }

        public Criteria andFinishedMarkIsNotNull() {
            addCriterion("finished_mark is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedMarkEqualTo(Integer value) {
            addCriterion("finished_mark =", value, "finishedMark");
            return (Criteria) this;
        }

        public Criteria andFinishedMarkNotEqualTo(Integer value) {
            addCriterion("finished_mark <>", value, "finishedMark");
            return (Criteria) this;
        }

        public Criteria andFinishedMarkGreaterThan(Integer value) {
            addCriterion("finished_mark >", value, "finishedMark");
            return (Criteria) this;
        }

        public Criteria andFinishedMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("finished_mark >=", value, "finishedMark");
            return (Criteria) this;
        }

        public Criteria andFinishedMarkLessThan(Integer value) {
            addCriterion("finished_mark <", value, "finishedMark");
            return (Criteria) this;
        }

        public Criteria andFinishedMarkLessThanOrEqualTo(Integer value) {
            addCriterion("finished_mark <=", value, "finishedMark");
            return (Criteria) this;
        }

        public Criteria andFinishedMarkIn(List<Integer> values) {
            addCriterion("finished_mark in", values, "finishedMark");
            return (Criteria) this;
        }

        public Criteria andFinishedMarkNotIn(List<Integer> values) {
            addCriterion("finished_mark not in", values, "finishedMark");
            return (Criteria) this;
        }

        public Criteria andFinishedMarkBetween(Integer value1, Integer value2) {
            addCriterion("finished_mark between", value1, value2, "finishedMark");
            return (Criteria) this;
        }

        public Criteria andFinishedMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("finished_mark not between", value1, value2, "finishedMark");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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