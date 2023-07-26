package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.company.Extractor.extractor;
import static com.company.HyperlinksQuarantiner.hyperlinksQuarantiner;
import static org.junit.jupiter.api.Assertions.*;

class HyperlinksQuarantinerTest {

    @Test
    void hyperlinksQuarantinerCheck() {



        String message1 = "Example message https://www.facebook.com/";
        String message2 = "Example message https://www.netflix.com/browse test https://www.netflix.com/browse ";

        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        list1.add("https://www.facebook.com/");
        list2.add("https://www.netflix.com/browse");


        assertEquals("Example message <URL QUARANTINED>", hyperlinksQuarantiner(message1, list1));
        assertEquals("Example message <URL QUARANTINED> test <URL QUARANTINED> ", hyperlinksQuarantiner(message2, list2));
    }
}