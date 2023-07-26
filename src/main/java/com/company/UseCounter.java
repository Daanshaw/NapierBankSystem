package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class UseCounter {

    public HashMap<String, String> counter(List<String> message) {

        HashMap<String, String> trendingList = new HashMap<String, String>();

        //List<String> extractedUrls = hashtagExtracter(message);

        for (int i = 0; i < message.size(); i++) {

            String occurrences = String.valueOf(Collections.frequency(message, message.get(i)));


            trendingList.put(message.get(i), occurrences);

        }
        return trendingList;
    }
}