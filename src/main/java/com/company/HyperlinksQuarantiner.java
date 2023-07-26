package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HyperlinksQuarantiner {

    private static final String urlPattern = "((https?|ftp|gopher|telnet|file):((//)|(\\\\))+[\\w\\d:#@%/;$()~_?\\+-=\\\\\\.&]*)";



    public static String hyperlinksQuarantiner(String messageBody, List<String> extractedUrls) {


        //List<String> extractedUrls = matchedUrls(messageBody);

        //loop to replace all found URls for different String

        for (String url : extractedUrls) {

            messageBody = messageBody.replaceAll("(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]", "<URL QUARANTINED>");


        }

        //function to write message to file




        return messageBody;
    }

    //function to extract URLs from body message and write them to seperate file

//    public static List<String> matchedUrls(String text) {
//        List<String> containedUrls = new ArrayList<String>();
//
//
//
//        Pattern pattern = Pattern.compile(urlPattern, Pattern.CASE_INSENSITIVE);
//        Matcher urlMatcher = pattern.matcher(text);
//
//        while (urlMatcher.find()) {
//            containedUrls.add(text.substring(urlMatcher.start(0),
//                    urlMatcher.end(0)));
//
//            LinksWriter lw = new LinksWriter();
//            lw.linksWriter(containedUrls);
//        }
//
//
//        return containedUrls;
//    }


}


