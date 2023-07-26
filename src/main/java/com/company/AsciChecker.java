package com.company;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class AsciChecker {

    //function to check the characters if ASCII

    public static boolean asciChecker(String x) {
        return StandardCharsets.US_ASCII.newEncoder().canEncode(x);
    }
}
