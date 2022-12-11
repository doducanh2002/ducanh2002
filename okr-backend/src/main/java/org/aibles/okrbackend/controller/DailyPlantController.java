package org.aibles.okrbackend.controller;

import org.aibles.okrbackend.dto.request.DailyPlantCreateRequest;
import org.aibles.okrbackend.dto.respone.DailyPlanResponse;
import org.aibles.okrbackend.model.DailyPlan;
import org.aibles.okrbackend.service.DailyPlantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/daily-plan")
public class DailyPlantController {

    public final DailyPlantService service;

    public DailyPlantController(DailyPlantService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<DailyPlanResponse> created(@Valid @RequestBody DailyPlantCreateRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(request));
    }

    @GetMapping
    public ResponseEntity<List<DailyPlanResponse>> getByDate(@RequestParam Integer date) {
        return ResponseEntity.status(HttpStatus.OK).body(service.getByDate(date));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DailyPlanResponse> update(@Valid @PathVariable("id") int id, @RequestBody DailyPlantCreateRequest request) {
        return ResponseEntity.status(HttpStatus.OK).body(service.update(id, request));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<DailyPlan> delete(@PathVariable("id") int id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<Void> updateStatus(@PathVariable("id") int id, @RequestBody DailyPlanStatus status) {
//        final DailyPlan updateStatus = service.updateStatusDailyPlan(id,status);
//        return ResponseEntity.status(HttpStatus.OK).body(service.updateStatusDailyPlan(id, status));)
//    }
}
