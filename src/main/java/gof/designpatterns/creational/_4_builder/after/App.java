package gof.designpatterns.creational._4_builder.after;

import gof.designpatterns.creational._4_builder.before.TourPlan;

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

        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();

    }
}
