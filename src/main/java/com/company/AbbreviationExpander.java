package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class AbbreviationExpander {



    static String abbreviationExpander(String messageBody) {



        String csvFile = "textwords.csv";
        String line = "";
        String splitChar = ",";
        String bodyOut = messageBody;
        HashMap<String, String> list = new HashMap<>();

        //reading file with abbreviations into the program
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] abbreviatonFile = line.split(splitChar);

                //load the read data into the hashmap

                list.put(abbreviatonFile[0], abbreviatonFile[1]);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //if any abbreviations found then replace them with expanded version
        for (String key : list.keySet()) {
            if (messageBody.contains(key)) {
                bodyOut = bodyOut.replace(key, key + "<" + list.get(key).toLowerCase() + ">");
            }
        }
        //write SMS message to file



        return bodyOut;
    }

}





