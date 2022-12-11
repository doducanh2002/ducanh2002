package org.aibles.okrbackend.service.impl;

import org.aibles.okrbackend.dto.request.DailyPlantCreateRequest;
import org.aibles.okrbackend.dto.respone.DailyPlanResponse;
import org.aibles.okrbackend.exception.DailyPlanNotFoundException;
import org.aibles.okrbackend.model.DailyPlan;
import org.aibles.okrbackend.model.DailyPlanStatus;
import org.aibles.okrbackend.repository.DailyPlantRepository;
import org.aibles.okrbackend.service.DailyPlantService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DailyPlantServiceImpl implements DailyPlantService {

    public final DailyPlantRepository dailyPlantRepository;

    public DailyPlantServiceImpl(DailyPlantRepository dailyPlantRepository) {
        this.dailyPlantRepository = dailyPlantRepository;
    }

    @Override
    public DailyPlanResponse create(DailyPlantCreateRequest dailyPlantCreateRequest) {
        DailyPlan dailyPlan = dailyPlantCreateRequest.toDailyPlan();
        dailyPlan = dailyPlantRepository.save(dailyPlan);
        DailyPlanResponse dailyPlanResponse = DailyPlanResponse.from(dailyPlan);
        return dailyPlanResponse;
    }

    @Override
    public DailyPlan delete(int id) {
        return dailyPlantRepository.findById(id)
                .map(dailyPlan -> {
                    dailyPlantRepository.delete(dailyPlan);
                    return dailyPlan;
                })
                .orElseThrow(DailyPlanNotFoundException::new);
    }

    @Override
    public DailyPlanResponse update(int id, DailyPlantCreateRequest dailyPlantCreateRequest) {
        DailyPlan checkDailyPlan = dailyPlantRepository.findById(id).orElseThrow(DailyPlanNotFoundException::new);
        DailyPlan dailyPlan = dailyPlantCreateRequest.toDailyPlan();
        dailyPlan.setDescription(checkDailyPlan.getDescription());
        dailyPlan.setStatus(checkDailyPlan.getStatus());
        dailyPlan.setTitle(checkDailyPlan.getTitle());
        dailyPlan.setNote(checkDailyPlan.getNote());
        dailyPlan = dailyPlantRepository.save(dailyPlan);
        return DailyPlanResponse.from(dailyPlan);
    }

    @Override
    public void updateStatusDailyPlan(int id, DailyPlanStatus status) {
         dailyPlantRepository.updateStatus(id, status);
    }

    @Override
    public List<DailyPlanResponse> getByDate(Integer date) {
        return dailyPlantRepository.findByDateAndUserId(date)
                .stream()
                .map(DailyPlanResponse :: from)
                .collect(Collectors.toList());

    }
}
