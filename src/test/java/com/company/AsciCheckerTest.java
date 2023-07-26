package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.company.AsciChecker.asciChecker;
import static org.junit.jupiter.api.Assertions.*;

class AsciCheckerTest {

    @Test
    @DisplayName("Ascii characters check")
    void asciCheckerIsWorking() {

        assertTrue(asciChecker("Ascii characters"));
        assertTrue(asciChecker("07380801414"));
        assertTrue(asciChecker("Example message"));
        assertFalse(asciChecker("È"));
        assertFalse(asciChecker("Ĉ Ĝ Ĥ Ĵ Ŝ Ŵ Ẑ"));
        assertFalse(asciChecker("भारत"));
    }
}