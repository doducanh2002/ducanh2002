package org.aibles.okrbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "daily_plan")
public class DailyPlan {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  private String title;

  private String description;

  @Enumerated(EnumType.STRING)
  private DailyPlanStatus status;

  private Integer date;

  private String note;

//  public static DailyPlan of(String title, String description, String userId, String keyResultId) {
//    DailyPlan dailyPlan = new DailyPlan();
//    dailyPlan.setTitle(title);
//    dailyPlan.setDescription(description);
//    dailyPlan.setStatus(DailyPlanStatus.TODO);
//    return dailyPlan;
//  }
}
