package org.aibles.okrbackend.repository;

import org.aibles.okrbackend.model.DailyPlan;
import org.aibles.okrbackend.model.DailyPlanStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DailyPlantRepository extends JpaRepository<DailyPlan, Integer> {

    @Query("update DailyPlan d set d.status = :status where d.id = :id")
    @Modifying
    void updateStatus(@Param("id") int id, @Param("status") DailyPlanStatus status);

    List<DailyPlan> findByDateAndUserId(Integer date);

}
