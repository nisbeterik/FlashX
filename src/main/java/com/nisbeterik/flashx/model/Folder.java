package com.nisbeterik.flashx.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Folder extends StudyComponent {

    private List<StudyComponent> components;

    public Folder(String title) {
        super(title);
        this.components = new ArrayList<>();
    }

    public List<StudyComponent> getComponents() {
        return Collections.unmodifiableList(components);
    }

    public int getNumOfDecks() {
        int count = 0;
        for (StudyComponent component : components) {
            if (component instanceof Deck) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int getNumOfFlashcards() {
        int total = 0;
        for (StudyComponent component : components) {
            total += component.getNumOfFlashcards();
        }
        return total;
    }

    @Override
    public void add(StudyComponent component) {
        if (component instanceof Deck) {
            components.add(component);
        } else {
            throw new IllegalArgumentException("Folder can only contain decks.");
        }
    }

    @Override
    public void remove(StudyComponent component) {
        components.remove(component);
    }

    @Override
    public String toString() {
        String baseDescription = super.toString();
        if (getDescription().isEmpty()) {
            baseDescription = "Title: " + getTitle();
        }
        return baseDescription + ", Number of Decks: " + getNumOfDecks();
    }
}