package com.nisbeterik.flashx.model;

import com.nisbeterik.flashx.utils.StringUtils;

public abstract class StudyComponent {

    private String title;
    private String description;

    public StudyComponent(String title, String description) {
        StringUtils.validateString(title, "Title cannot be null or empty.");
        this.title = title;
        this.description = description != null ? description : ""; //
    }

    public StudyComponent(String title) {
        this.title = title;
        this.description = "";
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public int getNumOfFlashcards() {
        throw new UnsupportedOperationException("This method is not implemented for this component.");
    }

    public void add(StudyComponent component) {
        throw new UnsupportedOperationException("Cannot add to a leaf component.");
    }

    public void remove(StudyComponent component) {
        throw new UnsupportedOperationException("Cannot remove from a leaf component.");
    }
    @Override
    public String toString() {
        return "Title: " + title + ", Description: " + description;
    }
}