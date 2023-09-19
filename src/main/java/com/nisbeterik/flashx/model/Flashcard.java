package com.nisbeterik.flashx.model;

import static java.util.Objects.requireNonNull;

public class Flashcard {

    private String front;

    private String back;

    public Flashcard(String front, String back) {
        validateFrontAndBack(front, back);
        this.front = front;
        this.back = back;
    }

    public String getFront() {
        return front;
    }

    public String getBack() {
        return back;
    }


    private void validateFrontAndBack(String front, String back) {
        validateString(front, "Front of the flashcard cannot be null or empty.");
        validateString(back, "Back of the flashcard cannot be null or empty.");
    }

    private void validateString(String value, String errorMessage) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(errorMessage);
        }
    }
    @Override
    public String toString() {
        return "Front: " + getFront() + ", Back: " + getBack();
    }
}
