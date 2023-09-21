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
        assertTrue(deck.getFlashcards().isEmpty(), "New deck should have no flashcards");
    }

    @Test
    void testCreateNewDeckWithoutDescription() {
        assertNotNull(deckWithoutDesc, "Deck should not be null after creation");
        assertEquals("History", deckWithoutDesc.getTitle(), "Deck name should be 'History'");
        assertEquals("", deckWithoutDesc.getDescription(), "Deck description should be 'German WW2'");
        assertTrue(deckWithoutDesc.getFlashcards().isEmpty(), "New deck should have no flashcards");
    }

    @Test
    void testAddFlashcardToDeck() {
        Flashcard flashcard = new Flashcard("Question", "Answer");
        deck.addFlashcard(flashcard);
        assertFalse(deck.getFlashcards().isEmpty(), "Should have flashcards");
        assertTrue(deck.getFlashcards().contains(flashcard), "Deck should contain the added flashcard");
    }
    @Test
    void testNumOfFlashcards() {
        Flashcard flashcard = new Flashcard("Question", "Answer");
        deck.addFlashcard(flashcard);
        assertEquals(1, deck.getNumOfFlashcards());
    }

    @Test
    void testRemoveFlashcardFromDeck() {
        Flashcard flashcard = new Flashcard("Question", "Answer");
        deck.addFlashcard(flashcard);
        deck.removeFlashcard(flashcard);
        assertFalse(deck.getFlashcards().contains(flashcard), "Deck should not contain the removed flashcard");
    }

    @Test
    void testHoldingMultipleFlashcards() {
        Flashcard flashcard1 = new Flashcard("Question", "Answer");
        Flashcard flashcard2 = new Flashcard("Question", "Answer");
        deck.addFlashcard(flashcard1);
        deck.addFlashcard(flashcard2);
        assertEquals(2, deck.getFlashcards().size());
        }

    @Test
    void testToString() {
        Flashcard flashcard2 = new Flashcard("Question", "Answer");
        deck.addFlashcard(flashcard2);
        deckWithoutDesc.addFlashcard(flashcard2);
        String expectedString = "Name: History, Description: German WW2, Number of Flashcards: " + deck.getFlashcards().size();
        String expectedStringNoDesc = "Name: History, Description: , Number of Flashcards: " + deck.getFlashcards().size();
        assertEquals(expectedString, deck.toString());
        assertEquals(expectedStringNoDesc, deckWithoutDesc.toString());
    }
    }
