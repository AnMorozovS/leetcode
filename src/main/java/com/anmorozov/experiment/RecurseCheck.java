package com.anmorozov.experiment;

public class RecurseCheck {

    public static void main(String[] args) {
        RecurseCheck starter = new RecurseCheck();
        starter.recurse(512_600L);
    }

    public void recurse(long counter) {
        if (counter > 0) {
            recurse(--counter);
        }
    }
}
