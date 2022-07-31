package org.example;

public class Action {
    private String message;
    private Runnable action;

    public static Action perform(String message, Runnable action) {
        Action a = new Action();
        a.message = message;
        a.action = action;
        return a;
    }

    public String getMessage() {
        return message;
    }

    public Runnable getAction() {
        return action;
    }

}