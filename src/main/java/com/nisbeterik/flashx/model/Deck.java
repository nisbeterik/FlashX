package com.nisbeterik.flashx.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck extends StudyComponent {

    private List<StudyComponent> components;

    public Deck(String title, String description) {
        super(title, description);
        this.components = new ArrayList<>();
    }

    public Deck(String title) {
        this(title, "");
    }

    public List<StudyComponent> getComponents() {
        return Collections.unmodifiableList(components);
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
        components.add(component);
    }

    @Override
    public void remove(StudyComponent component) {
        components.remove(component);
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Flashcards: " + getNumOfFlashcards();
    }
}