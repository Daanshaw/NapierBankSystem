//package com.company;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.List;
//
//public class LinksWriter {
//
//    //function to write all quarantined links to seperate file
//
//    void linksWriter(List<String> urls) {
//
//        try {
//
//            String filename = "quarantinedLinks.txt";
//            FileWriter fw = new FileWriter(filename, true); //the true will append the new data
//
//
//            fw.write(urls + "\n");//appends the string to the file
//
//
//            fw.close();
//
//        } catch (IOException ioe) {
//            System.err.println("IOException: " + ioe.getMessage());
//        }
//
//    }
//}
