package org.aibles.okrbackend.dto.respone;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.aibles.okrbackend.model.DailyPlan;
import org.aibles.okrbackend.model.DailyPlanStatus;

@Getter
@Setter
@Data
public class DailyPlanResponse {
  private int id;
  private String title;
  private String description;
  private DailyPlanStatus status;
  private String note;

  public static DailyPlanResponse from(DailyPlan dailyPlan) {
    DailyPlanResponse response = new DailyPlanResponse();
    response.setId(dailyPlan.getId());
    response.setTitle(dailyPlan.getTitle());
    response.setDescription(dailyPlan.getDescription());
    response.setStatus(dailyPlan.getStatus());
    response.setNote(dailyPlan.getNote());
    return response;
  }
}
