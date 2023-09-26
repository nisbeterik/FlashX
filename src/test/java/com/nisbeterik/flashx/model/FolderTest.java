package com.nisbeterik.flashx.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FolderTest {

    private Folder folder;

    @BeforeEach
    void setup() {
        folder = new Folder("History Collections");
    }

    @Test
    void testCreateNewFolder() {
        assertNotNull(folder, "Folder should not be null after creation");
        assertEquals("History Collections", folder.getTitle(), "Folder name should be 'History Collections'");
        assertTrue(folder.getComponents().isEmpty(), "New folder should have no decks");
    }

    @Test
    void testAddDeckToFolder() {
        Deck deck = new Deck("History", "German WW2");
        folder.add(deck);
        assertFalse(folder.getComponents().isEmpty(), "Folder should contain decks");
        assertTrue(folder.getComponents().contains(deck), "Folder should contain the added deck");
    }

    @Test
    void testNumOfDecks() {
        Deck deck = new Deck("History", "German WW2");
        folder.add(deck);
        assertEquals(1, folder.getNumOfDecks());
    }

    @Test
    void testRemoveDeckFromFolder() {
        Deck deck = new Deck("History", "German WW2");
        folder.add(deck);
        folder.remove(deck);
        assertFalse(folder.getComponents().contains(deck), "Folder should not contain the removed deck");
    }

    @Test
    void testHoldingMultipleDecks() {
        Deck deck1 = new Deck("History I", "Ancient");
        Deck deck2 = new Deck("History II", "Medieval");
        folder.add(deck1);
        folder.add(deck2);
        assertEquals(2, folder.getComponents().size());
    }

    @Test
    void testToString() {
        Deck deck = new Deck("History", "German WW2");
        folder.add(deck);
        String expectedString = "Title: History Collections, Number of Decks: " + folder.getComponents().size();
        assertEquals(expectedString, folder.toString());
    }
}