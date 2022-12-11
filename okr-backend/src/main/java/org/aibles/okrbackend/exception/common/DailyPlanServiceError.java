package org.aibles.okrbackend.exception.common;

public enum DailyPlanServiceError {

    DAILY_PLAN_NOT_FOUND(404,"DAILY PLAN NOT FOUND");

    private DailyPlanServiceError(int errorCode, String errMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errMessage;
    }

    private final int errorCode;
    private final String errorMessage;

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}