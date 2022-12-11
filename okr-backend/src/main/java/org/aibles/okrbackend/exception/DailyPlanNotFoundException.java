package org.aibles.okrbackend.exception;

import org.aibles.okrbackend.exception.common.DailyPlanServiceError;
import org.aibles.okrbackend.exception.common.DailyPlanServiceException;

public class DailyPlanNotFoundException extends DailyPlanServiceException {
    public DailyPlanNotFoundException(){
        super(DailyPlanServiceError.DAILY_PLAN_NOT_FOUND);
    }
}
