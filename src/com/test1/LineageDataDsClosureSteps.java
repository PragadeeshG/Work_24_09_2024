package com.test1;

public class LineageDataDsClosureSteps {
	private Integer changeRequestId;
	private String colosureParams;
	private String workFlowStat;
	private String onlyChecker;
	private String underQueue;
	private String queueGroup;
	private String grpCategory;
	private String startAction;
	private String endAction;
	private String startTime;
	private String endTime;
	private String changeRequestCreationDate;
	private String modifiedDate;
	private String entityState;

	public LineageDataDsClosureSteps() {

	}

	public LineageDataDsClosureSteps(Integer changeRequestId, String colosureParams, String workFlowStat,
			String onlyChecker, String underQueue, String queueGroup, String grpCategory, String startAction,
			String endAction, String startTime, String endTime, String changeRequestCreationDate, String modifiedDate,
			String entityState) {
		super();
		this.changeRequestId = changeRequestId;
		this.colosureParams = colosureParams;
		this.workFlowStat = workFlowStat;
		this.onlyChecker = onlyChecker;
		this.underQueue = underQueue;
		this.queueGroup = queueGroup;
		this.grpCategory = grpCategory;
		this.startAction = startAction;
		this.endAction = endAction;
		this.startTime = startTime;
		this.endTime = endTime;
		this.changeRequestCreationDate = changeRequestCreationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getChangeRequestId() {
		return changeRequestId;
	}

	public void setChangeRequestId(Integer changeRequestId) {
		this.changeRequestId = changeRequestId;
	}

	public String getColosureParams() {
		return colosureParams;
	}

	public void setColosureParams(String colosureParams) {
		this.colosureParams = colosureParams;
	}

	public String getWorkFlowStat() {
		return workFlowStat;
	}

	public void setWorkFlowStat(String workFlowStat) {
		this.workFlowStat = workFlowStat;
	}

	public String getOnlyChecker() {
		return onlyChecker;
	}

	public void setOnlyChecker(String onlyChecker) {
		this.onlyChecker = onlyChecker;
	}

	public String getUnderQueue() {
		return underQueue;
	}

	public void setUnderQueue(String underQueue) {
		this.underQueue = underQueue;
	}

	public String getQueueGroup() {
		return queueGroup;
	}

	public void setQueueGroup(String queueGroup) {
		this.queueGroup = queueGroup;
	}

	public String getGrpCategory() {
		return grpCategory;
	}

	public void setGrpCategory(String grpCategory) {
		this.grpCategory = grpCategory;
	}

	public String getStartAction() {
		return startAction;
	}

	public void setStartAction(String startAction) {
		this.startAction = startAction;
	}

	public String getEndAction() {
		return endAction;
	}

	public void setEndAction(String endAction) {
		this.endAction = endAction;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getChangeRequestCreationDate() {
		return changeRequestCreationDate;
	}

	public void setChangeRequestCreationDate(String changeRequestCreationDate) {
		this.changeRequestCreationDate = changeRequestCreationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
