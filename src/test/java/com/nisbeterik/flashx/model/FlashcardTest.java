package com.nisbeterik.flashx.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class FlashcardTest {

    @Test
    void requireNonNullFront() {
        assertThrows(IllegalArgumentException.class, () -> new Flashcard(null, "Answer"));
    }

    @Test
    void requireNonNullBack() {
        assertThrows(IllegalArgumentException.class, () -> new Flashcard("Question", null));
    }
    @Test
    void createFlashcardTest() {
        Flashcard flashcard = new Flashcard("Question", "Answer");
        assertEquals("Question", flashcard.getFront());
        assertEquals("Answer", flashcard.getBack());
    }

    @Test
    void addFlashcardUnsupported() {
        Flashcard flashcard = new Flashcard("Question", "Answer");
        assertThrows(UnsupportedOperationException.class, () -> flashcard.add(new Flashcard("Another Question", "Another Answer")));
    }

    @Test
    void removeFlashcardUnsupported() {
        Flashcard flashcard = new Flashcard("Question", "Answer");
        assertThrows(UnsupportedOperationException.class, () -> flashcard.remove(new Flashcard("Another Question", "Another Answer")));
    }

    @Test
    void testToString() {
        Flashcard flashcard = new Flashcard("Question", "Answer");
        String expectedString = "Front: Question, Back: Answer";
        assertEquals(expectedString, flashcard.toString());
    }
}
