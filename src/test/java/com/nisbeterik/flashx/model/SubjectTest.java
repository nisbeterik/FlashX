package com.nisbeterik.flashx.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubjectTest {

    private Subject subject;

    @BeforeEach
    void setup() {
        subject = new Subject("World History");
    }

    @Test
    void testCreateNewSubject() {
        assertNotNull(subject, "Subject should not be null after creation");
        assertEquals("World History", subject.getTitle(), "Subject name should be 'World History'");
        assertTrue(subject.getComponents().isEmpty(), "New subject should have no folders");
    }

    @Test
    void testAddFolderToSubject() {
        Folder folder = new Folder("History: 20th Century");
        subject.add(folder);
        assertFalse(subject.getComponents().isEmpty(), "Subject should contain folders");
        assertTrue(subject.getComponents().contains(folder), "Subject should contain the added folder");
    }

    @Test
    void testNumOfFolders() {
        Folder folder = new Folder("History: Middle Ages");
        subject.add(folder);
        assertEquals(1, subject.getComponents().size(), "Should have one folder");
    }

    @Test
    void testRemoveFolderFromSubject() {
        Folder folder = new Folder("History: Ancient Civilizations");
        subject.add(folder);
        subject.remove(folder);
        assertFalse(subject.getComponents().contains(folder), "Subject should not contain the removed folder");
    }

    @Test
    void testHoldingMultipleFolders() {
        Folder folder1 = new Folder("History: Renaissance");
        Folder folder2 = new Folder("History: Industrial Revolution");
        subject.add(folder1);
        subject.add(folder2);
        assertEquals(2, subject.getComponents().size());
    }

    @Test
    void testToString() {
        Folder folder = new Folder("History: World Wars");
        subject.add(folder);
        String expectedString = "Title: World History, Number of Folders: " + subject.getComponents().size();
        assertEquals(expectedString, subject.toString());
    }
}
