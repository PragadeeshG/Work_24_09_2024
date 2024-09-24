package com.test1;

public class LineageDataDsAmendmentSteps {
	private Integer changeRequestId;
	private String paramsOfchangeRequest;
	private String changeRequestStatus;
	private String changeRequestApproved;
	private String pendingOn;
	private String grpName;
	private String grpCategory;
	private String startAction;
	private String endAction;
	private String startTime;
	private String endTime;
	private String changeRequestCreationDate;
	private String modifiedDate;
	private String entityState;

	public LineageDataDsAmendmentSteps() {

	}

	public LineageDataDsAmendmentSteps(Integer changeRequestId, String paramsOfchangeRequest,
			String changeRequestStatus, String changeRequestApproved, String pendingOn, String grpName,
			String grpCategory, String startAction, String endAction, String startTime, String endTime,
			String changeRequestCreationDate, String modifiedDate, String entityState) {
		super();
		this.changeRequestId = changeRequestId;
		this.paramsOfchangeRequest = paramsOfchangeRequest;
		this.changeRequestStatus = changeRequestStatus;
		this.changeRequestApproved = changeRequestApproved;
		this.pendingOn = pendingOn;
		this.grpName = grpName;
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

	public String getParamsOfchangeRequest() {
		return paramsOfchangeRequest;
	}

	public void setParamsOfchangeRequest(String paramsOfchangeRequest) {
		this.paramsOfchangeRequest = paramsOfchangeRequest;
	}

	public String getChangeRequestStatus() {
		return changeRequestStatus;
	}

	public void setChangeRequestStatus(String changeRequestStatus) {
		this.changeRequestStatus = changeRequestStatus;
	}

	public String getChangeRequestApproved() {
		return changeRequestApproved;
	}

	public void setChangeRequestApproved(String changeRequestApproved) {
		this.changeRequestApproved = changeRequestApproved;
	}

	public String getPendingOn() {
		return pendingOn;
	}

	public void setPendingOn(String pendingOn) {
		this.pendingOn = pendingOn;
	}

	public String getGrpName() {
		return grpName;
	}

	public void setGrpName(String grpName) {
		this.grpName = grpName;
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
