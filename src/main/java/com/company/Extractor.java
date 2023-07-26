package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extractor {

    public static List<String> extractor(String text, String pattern) {
        List<String> extractedObj = new ArrayList<String>();
        //String hashtagPattern = "(#[A-Za-z0-9-_]+)";
        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher urlMatcher = p.matcher(text);

        while (urlMatcher.find()) {
            extractedObj.add(text.substring(urlMatcher.start(0),
                    urlMatcher.end(0)));

        }


        return extractedObj;
    }
}
