//package org.aibles.okrbackend.config;
//
//import org.aibles.okrbackend.repository.DailyPlantRepository;
//import org.aibles.okrbackend.service.DailyPlantService;
//import org.aibles.okrbackend.service.impl.DailyPlantServiceImpl;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//
//@Configuration
//@EnableJpaRepositories(basePackages = "package org.aibles.okrbackend.repository ")
//@ComponentScan(basePackages = "package org.aibles.okrbackend.repository ")
//public class Config {
//
//    @Bean
//    public DailyPlantService dailyPlanService(
//            DailyPlantRepository repository) {
//        return new DailyPlantServiceImpl(repository);
//    }
//}
