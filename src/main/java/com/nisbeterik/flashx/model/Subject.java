package com.nisbeterik.flashx.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subject extends StudyComponent {

    private List<StudyComponent> components;

    public Subject(String title) {
        super(title);
        this.components = new ArrayList<>();
    }

    public List<StudyComponent> getComponents() {
        return Collections.unmodifiableList(components);
    }


    @Override
    public void add(StudyComponent component) {
        if (component instanceof Folder) {
            components.add(component);
        } else {
            throw new IllegalArgumentException("Only Folders can be added to a Subject");
        }
    }

    @Override
    public void remove(StudyComponent component) {
        components.remove(component);
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + ", Number of Folders: " + getComponents().size();
    }
}