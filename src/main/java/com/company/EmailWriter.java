package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class EmailWriter {

    //function to write email message to file

    void emailWriter(String header, String sender, String subject, String body, String type) {


        Email emailObj = new Email(header, sender, subject, body);


        writeFile(emailObj, type);


    }

    void emailWriter(String header, String sender, String body, String type) {


        Tweet tweetObj = new Tweet(header, sender, body);


        writeFile(tweetObj, type);


    }

    void emailWriter(String header, String sender, String subject, String body, String sortCode, String natureOfIncident, String date, String type) {


        Sir sirObj = new Sir(header, sender, subject, body, sortCode, natureOfIncident, date);


        writeFile(sirObj, type);


    }
    void emailWriter(String sortCode, String natureOfIncident,String type) {


        SirList sirListObj = new SirList(sortCode, natureOfIncident);


        writeFile(sirListObj, type+"List");


    }

    void emailWriter(HashMap<String, String> hashtags, String type) {


        new JSONObject(hashtags);



        writeFile(hashtags, type);


    }
    void emailWriter(List<String> urls, String type) {


        String json = JSONArray.toJSONString(urls);



        writeFile(json, type);


    }

    public static <E> void writeFile(Object x, String messageType) {

        ObjectMapper mapper = new ObjectMapper();
        try {

            // Writing to a file
            mapper.writeValue(new File(messageType + System.currentTimeMillis() + ".json"), x);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static class MessageWriter {

        //function to write message to file

        void messageWriter(String message, String messageType) {


            JSONObject jsonObject = new JSONObject();


            try {
                File file = new File(messageType + " message" + System.currentTimeMillis() + ".txt");
                FileWriter myWriter = new FileWriter(file);
                myWriter.write(message);
                System.out.println(messageType + " wrote to the file");
                myWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}
