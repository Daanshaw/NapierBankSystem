//package com.company;
//
//import java.util.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class TwitterListCreator {
//
//
//
//    public HashMap<String, Integer> hashtagWriter(String message) {
//        HashMap<String, Integer> trendingList = new HashMap<String, Integer>();
//
//        List<String> extractedUrls = hashtagExtracter(message);
//
//        for (int i = 0; i < extractedUrls.size(); i++) {
//
//            int occurrences = Collections.frequency(extractedUrls, extractedUrls.get(i));
//
//
//            trendingList.put(extractedUrls.get(i), occurrences);
//
//        }
//        return  trendingList;
//    }
//}
