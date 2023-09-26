package com.nisbeterik.flashx.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeckTest {

    private Deck deck;
    private Deck deckWithoutDesc;

    @BeforeEach
    void setup() {
        deck = new Deck("History", "German WW2");
        deckWithoutDesc = new Deck("History");
    }

    @Test
    void testCreateNewDeck() {
        assertNotNull(deck, "Deck should not be null after creation");
        assertEquals("History", deck.getTitle(), "Deck name should be 'History'");
        assertEquals("German WW2", deck.getDescription(), "Deck description should be 'German WW2'");
        assertTrue(deck.getComponents().isEmpty(), "New deck should have no flashcards");
    }

    @Test
    void testCreateNewDeckWithoutDescription() {
        assertNotNull(deckWithoutDesc, "Deck should not be null after creation");
        assertEquals("History", deckWithoutDesc.getTitle(), "Deck name should be 'History'");
        assertEquals("", deckWithoutDesc.getDescription(), "Deck description should be 'German WW2'");
        assertTrue(deckWithoutDesc.getComponents().isEmpty(), "New deck should have no flashcards");
    }

    @Test
    void testAddFlashcardToDeck() {
        Flashcard flashcard = new Flashcard("Question", "Answer");
        deck.add(flashcard);
        assertFalse(deck.getComponents().isEmpty(), "Should have flashcards");
        assertTrue(deck.getComponents().contains(flashcard), "Deck should contain the added flashcard");
    }
    @Test
    void testNumOfFlashcards() {
        Flashcard flashcard = new Flashcard("Question", "Answer");
        deck.add(flashcard);
        assertEquals(1, deck.getNumOfFlashcards());
    }

    @Test
    void testRemoveFlashcardFromDeck() {
        Flashcard flashcard = new Flashcard("Question", "Answer");
        deck.add(flashcard);
        deck.remove(flashcard);
        assertFalse(deck.getComponents().contains(flashcard), "Deck should not contain the removed flashcard");
    }

    @Test
    void testHoldingMultipleFlashcards() {
        Flashcard flashcard1 = new Flashcard("Question", "Answer");
        Flashcard flashcard2 = new Flashcard("Question", "Answer");
        deck.add(flashcard1);
        deck.add(flashcard2);
        assertEquals(2, deck.getComponents().size());
        }

    @Test
    void testToString() {
        Flashcard flashcard2 = new Flashcard("Question", "Answer");
        deck.add(flashcard2);
        deckWithoutDesc.add(flashcard2);
        String expectedString = "Title: History, Description: German WW2, Number of Flashcards: " + deck.getComponents().size();
        String expectedStringNoDesc = "Title: History, Description: , Number of Flashcards: " + deck.getComponents().size();
        assertEquals(expectedString, deck.toString());
        assertEquals(expectedStringNoDesc, deckWithoutDesc.toString());
    }
    }
