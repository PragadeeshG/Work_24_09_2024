package com.test1;

public class LineageDataDsAmendment {
	private Integer changeRequestId;
	private String refName;
	private String amendRoute;
	private boolean routeActive;
	private String routeName;
	private Integer routeType;
	private boolean autoApproval;
	private Integer autoApprovalStep;
	private String changeRequestCreationDate;
	private String modifiedDate;
	private String entityState;

	public LineageDataDsAmendment() {

	}

	public LineageDataDsAmendment(Integer changeRequestId, String refName, String amendRoute, boolean routeActive,
			String routeName, Integer routeType, boolean autoApproval, Integer autoApprovalStep,
			String changeRequestCreationDate, String modifiedDate, String entityState) {
		super();
		this.changeRequestId = changeRequestId;
		this.refName = refName;
		this.amendRoute = amendRoute;
		this.routeActive = routeActive;
		this.routeName = routeName;
		this.routeType = routeType;
		this.autoApproval = autoApproval;
		this.autoApprovalStep = autoApprovalStep;
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

	public String getRefName() {
		return refName;
	}

	public void setRefName(String refName) {
		this.refName = refName;
	}

	public String getAmendRoute() {
		return amendRoute;
	}

	public void setAmendRoute(String amendRoute) {
		this.amendRoute = amendRoute;
	}

	public boolean isRouteActive() {
		return routeActive;
	}

	public void setRouteActive(boolean routeActive) {
		this.routeActive = routeActive;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public Integer getRouteType() {
		return routeType;
	}

	public void setRouteType(Integer routeType) {
		this.routeType = routeType;
	}

	public boolean isAutoApproval() {
		return autoApproval;
	}

	public void setAutoApproval(boolean autoApproval) {
		this.autoApproval = autoApproval;
	}

	public Integer getAutoApprovalStep() {
		return autoApprovalStep;
	}

	public void setAutoApprovalStep(Integer autoApprovalStep) {
		this.autoApprovalStep = autoApprovalStep;
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
