package me.whiteship.chapter01.item05.staticutils;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {

    @Disabled
    @Test
    void isValid() {
        assertTrue(SpellChecker.isValid("test"));
    }

}