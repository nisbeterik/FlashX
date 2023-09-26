package com.nisbeterik.flashx.model;

import com.nisbeterik.flashx.utils.StringUtils;

public class Flashcard extends StudyComponent {

    private String front;
    private String back;

    public Flashcard(String front, String back) {
        super("Flashcard");
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
        StringUtils.validateString(front, "Front of the flashcard cannot be null or empty.");
        StringUtils.validateString(back, "Back of the flashcard cannot be null or empty.");
    }

    @Override
    public int getNumOfFlashcards() {
        return 1;  // Since it's a single flashcard
    }

    @Override
    public String toString() {
        return "Front: " + getFront() + ", Back: " + getBack();
    }


}