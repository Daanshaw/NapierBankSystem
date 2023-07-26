//package com.company;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.List;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class MentionsWriter {
//
//    //function to extract twitter Ids from message body
//
//    public static List<String> mentionsExtracter(String text) {
//        List<String> containedUrls = new ArrayList<String>();
//        String hashtagPattern = "(@[A-Za-z0-9-_]+)";
//        Pattern pattern = Pattern.compile(hashtagPattern, Pattern.CASE_INSENSITIVE);
//        Matcher urlMatcher = pattern.matcher(text);
//
//        while (urlMatcher.find()) {
//            containedUrls.add(text.substring(urlMatcher.start(0),
//                    urlMatcher.end(0)));
//
//        }
//
//
//        return containedUrls;
//    }
//
//    void mentionsWriter(String message) {
//
//        //function to write found twitter Ids to mentions list along with number of mentions
//
//        HashMap<String, Integer> mentionsList = new HashMap<String, Integer>();
//
//        List<String> extractedUrls = mentionsExtracter(message);
//
//        for (int i = 0; i < extractedUrls.size(); i++) {
//
//            int occurrences = Collections.frequency(extractedUrls, extractedUrls.get(i));
//
//
//            mentionsList.put(extractedUrls.get(i), occurrences);
//
//        }
//        System.out.println(mentionsList);
//
//        try {
//            File file = new File("mentionsList.txt");
//            FileWriter myWriter = new FileWriter(file, true);
//            myWriter.write(String.valueOf(mentionsList));
//            System.out.println("Trending list wrote to the file");
//            myWriter.close();
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//
//
//    }
//
////
//}
