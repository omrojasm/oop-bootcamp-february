package oop.nato;

import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Nato {

    public static final String DELIMITER = "-";

    public static String encode(String plainMessage) {
        return plainMessage.chars()
            .mapToObj(charAt -> String.valueOf((char) charAt))
            .map(CodeWheel.ENCODE_MAP::get)
            .collect(Collectors.joining(DELIMITER));
    }

    public static String decode(String encodedMessage) {
        return stream(encodedMessage.split(DELIMITER))
            .map(CodeWheel.DECODE_MAP::get)
            .collect(Collectors.joining());
    }
}
