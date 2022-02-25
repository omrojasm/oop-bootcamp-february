package oop.greet;

import java.time.LocalTime;

public class Greeter {

    private LocalTime timeOfTheDay;

    public Greeter() {
    }

    public Greeter(LocalTime timeOfTheDay) {
        this.timeOfTheDay = timeOfTheDay;
    }

    public  String greet(String name) {
        var greetingMessage = timeOfTheDay != null ? getTimeGreeting() : "Hello ";
        return greetingMessage + formatName(name);
    }

    private String getTimeGreeting() {
        if(timeOfTheDay.isAfter(LocalTime.of(18,0))
            && timeOfTheDay.isBefore(LocalTime.of(22,0))) {
            return "Good evening ";
        }
        if(timeOfTheDay.isAfter(LocalTime.of(6,0))
            && timeOfTheDay.isBefore(LocalTime.of(12,0))) {
            return "Good morning ";
        }
        return "Hello";
    }

    private static String formatName(String name) {
        var trimmedName = name.trim();

        return trimmedName.substring(0,1).toUpperCase().concat(trimmedName.substring(1));
    }
}
