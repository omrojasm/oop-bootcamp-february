package oop.nato;

import java.util.ArrayList;

public class Nato {

    public static final String DELIMITER = "-";

    public static String encode(String plainMessage) {
        var encodedMessage = new ArrayList<String>();
        for (int i = 0; i < plainMessage.length(); i++) {
            var encodedCharacter = CodeWheel.ENCODE_MAP.get(String.valueOf(plainMessage.charAt(i)));
            encodedMessage.add(encodedCharacter);
        }
        return String.join(DELIMITER, encodedMessage);
    }


    public static String decode(String encodedMessage) {
        return "";
    }
}
