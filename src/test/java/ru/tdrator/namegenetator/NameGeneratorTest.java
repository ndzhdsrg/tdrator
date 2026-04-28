package ru.tdrator.namegenerator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameGeneratorTest {

    @Test
    void shouldGenerateNameWithCorrectLength() {
        int length = 6;

        String name = NameGenerator.generateRussianName(length);

        assertEquals(length, name.length());
    }

    @Test
    void shouldStartWithUppercaseLetter() {
        String name = NameGenerator.generateRussianName(5);

        assertTrue(Character.isUpperCase(name.charAt(0)));
    }

    @Test
    void shouldHaveLowercaseLettersAfterFirst() {
        String name = NameGenerator.generateRussianName(7);

        for (int i = 1; i < name.length(); i++) {
            assertTrue(Character.isLowerCase(name.charAt(i)));
        }
    }

    @Test
    void shouldContainOnlyRussianLetters() {
        String name = NameGenerator.generateRussianName(10);

        String lower = name.toLowerCase();

        assertTrue(lower.matches("[а-яё]+"));
    }

    @Test
    void shouldThrowExceptionWhenLengthIsZero() {
        assertThrows(IllegalArgumentException.class,
                () -> NameGenerator.generateRussianName(0));
    }

    @Test
    void shouldThrowExceptionWhenLengthIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> NameGenerator.generateRussianName(-5));
    }
}