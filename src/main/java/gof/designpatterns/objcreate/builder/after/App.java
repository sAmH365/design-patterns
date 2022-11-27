package gof.designpatterns.objcreate.builder.after;

import gof.designpatterns.objcreate.builder.before.TourPlan;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
//        TourPlanBuilder builder = new DefalutTourBuilder();
//        TourPlan plan = builder.title("칸쿤 여행")
//            .nightsAndDays(2,3)
//            .startDate(LocalDate.of(2020,12,9))
//            .addPlan(0, "체크인하고 짐 풀기")
//            .addPlan(0, "저녁 식사")
//            .getPlan();
//
//        TourPlan longBeachTrip = builder.title("롱비치")
//            .startDate(LocalDate.of(2021,7,15))
//            .getPlan();

        TourDirector director = new TourDirector(new DefalutTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();

    }
}
