package oop.greet;

import java.time.Clock;
import java.time.ZoneId;

public class Greeter {

    private final Clock clock;

    public Greeter(Clock clock) {
        this.clock = clock;
    }

    public String greet(String name) {
        int currentHour = clock.instant().atZone(ZoneId.systemDefault()).getHour();
        if(currentHour >= 6 && currentHour <= 12) {
            return "Good morning " + formatName(name);
        }
        return "Hello " + formatName(name);
    }

    private static String formatName(String name) {
        var trimmedName = name.trim();
        return trimmedName.substring(0,1).toUpperCase().concat(trimmedName.substring(1));
    }
}
