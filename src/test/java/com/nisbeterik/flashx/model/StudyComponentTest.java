/*package com.nisbeterik.flashx.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class StudyComponentTest {

    private StudyComponent subject;
    private StudyComponent folder;
    private StudyComponent deck;

    @BeforeEach
    void setup() {
        subject = new Subject("Mathematics");
        folder = new Folder("Algebra");
        deck = new Deck("Linear Equations");
    }

    @Test
    void testAddStudyComponent() {
        subject.add(folder);
        folder.add(deck);


        assertTrue(subject.getComponents().contains(folder), "Subject should contain the folder");
        assertTrue(folder.getComponents().contains(deck), "Folder should contain the deck");
    }

    @Test
    void testRemoveStudyComponent() {
        subject.add(folder);
        subject.remove(folder);

        assertFalse(subject.getComponents().contains(folder), "Subject should not contain the removed folder");
    }

    @Test
    void testCompositeSize() {
        subject.add(folder);
        folder.add(deck);
        Flashcard flashcard = new Flashcard("Question", "Answer");
        deck.add(flashcard);

        assertEquals(1, subject.getComponents().size());
        assertEquals(1, folder.getComponents().size());
        assertEquals(1, deck.getComponents().size());
    }

    @Test
    void testLeaf() {
        Flashcard flashcard = new Flashcard("Question", "Answer");
        assertThrows(UnsupportedOperationException.class, () -> flashcard.add(new Deck("Some Deck")));
    }
}*/