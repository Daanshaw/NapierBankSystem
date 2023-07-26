package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.company.AbbreviationExpander.abbreviationExpander;
import static com.company.Extractor.extractor;
import static org.junit.jupiter.api.Assertions.*;

class ExtractorTest {

    @Test
    void extractorCheck() {

       String urlPattern = "((https?|ftp|gopher|telnet|file):((//)|(\\\\))+[\\w\\d:#@%/;$()~_?\\+-=\\\\\\.&]*)";

        String message1 = "Example message https://www.facebook.com/";
        String message2 = "Example message https://www.netflix.com/browse";

        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        list1.add("https://www.facebook.com/");
        list2.add("https://www.netflix.com/browse");


        assertEquals(list1, extractor(message1, urlPattern));
        assertEquals(list2, extractor(message2, urlPattern));



    }
}