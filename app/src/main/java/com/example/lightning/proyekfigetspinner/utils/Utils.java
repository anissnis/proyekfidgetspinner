package com.example.lightning.proyekfigetspinner.utils;



public class Utils {

    public static int getUnsignedInt(int valueToFormat) {
        if (String.valueOf(valueToFormat).contains("-")) {
            return Integer.parseInt(String.valueOf(valueToFormat).substring(1));
        }

        return valueToFormat;
    }

}
