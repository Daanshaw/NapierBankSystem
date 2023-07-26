//package com.company;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class SirWriter {
//
//    String sirMessage = "";
//
//    public static List<String> extracter(String bodyMessage) {
//        List<String> containedUrls = new ArrayList<String>();
//        String urlRegex = "((https?|ftp|gopher|telnet|file):((//)|(\\\\))+[\\w\\d:#@%/;$()~_?\\+-=\\\\\\.&]*)";
//        Pattern pattern = Pattern.compile(urlRegex, Pattern.CASE_INSENSITIVE);
//        Matcher urlMatcher = pattern.matcher(bodyMessage);
//
//        while (urlMatcher.find()) {
//            containedUrls.add(bodyMessage.substring(urlMatcher.start(0),
//                    urlMatcher.end(0)));
//        }
//
//        return containedUrls;
//    }
//
//
//    void sirWriter(String sCode, String natureofIncident) {
//
//        sirMessage = sCode + natureofIncident;
//
//        try {
//            String filename = "sirList.txt";
//            FileWriter fw = new FileWriter(filename, true); //the true will append the new data
//            fw.write(sirMessage + "\n");//appends the string to the file
//            fw.close();
//        } catch (IOException ioe) {
//            System.err.println("IOException: " + ioe.getMessage());
//        }
//
//    }
//}
