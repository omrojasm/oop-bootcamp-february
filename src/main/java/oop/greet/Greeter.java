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
        var greetingMessage = timeOfTheDay != null ? "Good morning " : "Hello ";
        return greetingMessage + formatName(name);
    }

    private static String formatName(String name) {
        var trimmedName = name.trim();

        return trimmedName.substring(0,1).toUpperCase().concat(trimmedName.substring(1));
    }
}
