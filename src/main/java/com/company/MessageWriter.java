package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class MessageWriter {

    //function to write email message to file

    void messageWriter(String header, String sender, String subject, String body, String type) {


        Email emailObj = new Email(header, sender, subject, body);


        writeFile(emailObj, type);


    }

    void messageWriter(String header, String sender, String body, String type) {


        Tweet tweetObj = new Tweet(header, sender, body);


        writeFile(tweetObj, type);


    }

    void messageWriter(String header, String sender, String subject, String body, String sortCode, String natureOfIncident, String date, String type) {


        Sir sirObj = new Sir(header, sender, subject, body, sortCode, natureOfIncident, date);


        writeFile(sirObj, type);


    }
    void messageWriter(String sortCode, String natureOfIncident) {


        SirList sirListObj = new SirList(sortCode, natureOfIncident);


        writeFile(sirListObj, "SIRList");


    }

    void messageWriter(HashMap<String, String> hashtags, String type) {


        new JSONObject(hashtags);



        writeAppendFile(hashtags, type);


    }
    void messageWriter(List<String> urls, String type) {

        String name = "quarantinedLinks";
        String json = JSONArray.toJSONString(urls);



        writeAppendFile(json, name);


    }

    public static void writeFile(Object x, String messageType) {

        ObjectMapper mapper = new ObjectMapper();
        try {

            // Writing to a file
            mapper.writeValue(new File(messageType + System.currentTimeMillis() + ".json"), x);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void writeAppendFile(Object x, String name) {

        ObjectMapper mapper = new ObjectMapper();
        try {
            FileWriter file= new FileWriter(name+".json",true);
            file.write(String.valueOf(x));

            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }













//        ObjectMapper mapper = new ObjectMapper();
//        try {
//
//            // Writing to a file
//            mapper.writeValue(new File(messageType + System.currentTimeMillis() + ".json"), x);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }

}
