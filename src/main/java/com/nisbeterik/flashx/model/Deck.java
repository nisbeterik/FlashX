package com.nisbeterik.flashx.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private String title;

    private String description = "";
    private List<Flashcard> flashcards;

    public Deck(String title, String description) {
        this.title = title;
        this.description = description;
        this.flashcards = new ArrayList<>();
    }

    public Deck(String title) {
        this(title, "");
    }

    public String getTitle() {
        return title;
    }

    public List<Flashcard> getFlashcards() {
        return Collections.unmodifiableList(flashcards);
    }

    public int getNumOfFlashcards() {
        return flashcards.size();
    }
    public void addFlashcard(Flashcard flashcard) {
        this.flashcards.add(flashcard);
    }

    public void removeFlashcard(Flashcard flashcard) {
        this.flashcards.remove(flashcard);
    }



    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "Name: " + getTitle() + ", Description: " + getDescription() + ", Number of Flashcards: " + getNumOfFlashcards();
    }
}
