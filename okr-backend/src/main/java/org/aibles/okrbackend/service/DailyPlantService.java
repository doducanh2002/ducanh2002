package org.aibles.okrbackend.service;

import org.aibles.okrbackend.dto.request.DailyPlantCreateRequest;
import org.aibles.okrbackend.dto.respone.DailyPlanResponse;
import org.aibles.okrbackend.model.DailyPlan;
import org.aibles.okrbackend.model.DailyPlanStatus;

import java.util.List;

public interface DailyPlantService {

    DailyPlanResponse create(DailyPlantCreateRequest dailyPlantCreateRequest);

    DailyPlan delete(final int id);

    DailyPlanResponse update(int id, DailyPlantCreateRequest dailyPlantCreateRequest);

    void updateStatusDailyPlan(int id, DailyPlanStatus status);

    List<DailyPlanResponse> getByDate(Integer date);

}
