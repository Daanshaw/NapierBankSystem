package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.company.AbbreviationExpander.abbreviationExpander;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AbbreviationExpanderTest {

    @Test
    @DisplayName("Abbreviaton expander checl")
    void abbreviationExpanderCheck() {

        String message1 = "Example message BRT";
        String message2 = "Example message AAP";


        assertEquals("Example message BRT<be right there>", abbreviationExpander(message1));
        assertEquals("Example message AAP<always a pleasure>", abbreviationExpander(message2));


    }


}