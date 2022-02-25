package oop.greet;

public class Greeter {
    public  String greet(String name) {
        return "Hello " + formatName(name);
    }

    private static String formatName(String name) {
        var trimmedName = name.trim();

        return trimmedName.substring(0,1).toUpperCase().concat(trimmedName.substring(1));
    }
}
