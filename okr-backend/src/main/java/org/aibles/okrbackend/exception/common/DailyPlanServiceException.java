package org.aibles.okrbackend.exception.common;

import org.aibles.okrbackend.exception.common.DailyPlanServiceError;

public abstract class DailyPlanServiceException extends RuntimeException {

    private final DailyPlanServiceError dailyPlanServiceError ;

    private static final long serialVersionUID = 1L;

    protected DailyPlanServiceException(DailyPlanServiceError dailyPlanServiceError){
        super();
        this.dailyPlanServiceError =dailyPlanServiceError;
    }

    public DailyPlanServiceError getDailyPlanServiceError(){
        return dailyPlanServiceError;
    }
}
