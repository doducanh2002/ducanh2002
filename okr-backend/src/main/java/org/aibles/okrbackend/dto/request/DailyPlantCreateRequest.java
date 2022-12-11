package org.aibles.okrbackend.dto.request;

import lombok.*;
import org.aibles.okrbackend.model.DailyPlan;
import org.aibles.okrbackend.model.DailyPlanStatus;
import javax.validation.constraints.*;
@Getter
@Setter
@Data
public class DailyPlantCreateRequest {

    @NotBlank(message = "Title can not be null")
    private String title;

    @NotBlank(message = "Description can not be null")
    private String description;

    @NotBlank(message = "Status can not be null")
    private DailyPlanStatus status;

    private String note;

    public DailyPlan toDailyPlan() {
        DailyPlan dailyPlan = new DailyPlan();
        dailyPlan.setTitle(this.getTitle());
        dailyPlan.setDescription(this.getDescription());
        dailyPlan.setStatus(this.getStatus());
        dailyPlan.setNote(this.getNote());
        return dailyPlan;
    }
}
