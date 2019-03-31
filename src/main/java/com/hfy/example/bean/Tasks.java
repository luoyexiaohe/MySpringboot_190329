package com.hfy.example.bean;

import java.util.Date;

public class Tasks {
    private Integer id;

    private String distributorName;

    private Integer distributorId;

    private String executantName;

    private Integer executantId;

    private String taskDescribe;

    private Integer finishedMark;

    private String remark;

    private Date startTime;

    private Date endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName == null ? null : distributorName.trim();
    }

    public Integer getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(Integer distributorId) {
        this.distributorId = distributorId;
    }

    public String getExecutantName() {
        return executantName;
    }

    public void setExecutantName(String executantName) {
        this.executantName = executantName == null ? null : executantName.trim();
    }

    public Integer getExecutantId() {
        return executantId;
    }

    public void setExecutantId(Integer executantId) {
        this.executantId = executantId;
    }

    public String getTaskDescribe() {
        return taskDescribe;
    }

    public void setTaskDescribe(String taskDescribe) {
        this.taskDescribe = taskDescribe == null ? null : taskDescribe.trim();
    }

    public Integer getFinishedMark() {
        return finishedMark;
    }

    public void setFinishedMark(Integer finishedMark) {
        this.finishedMark = finishedMark;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}