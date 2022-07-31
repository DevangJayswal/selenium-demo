package org.example;

import org.openqa.selenium.NoSuchElementException;

public class Try {
    static void these(Action... actions) {
        for (Action action : actions) {
            boolean flag = true;
            while (flag) {
                try {
                    Thread.sleep(1000);
                    System.out.println("\n--- Trying " + action.getMessage());
                    action.getAction().run();
                    System.out.println("\n--- Done " + action.getMessage());
                    flag = false;
                } catch (NoSuchElementException ignored) {
                    // we are going to try again
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}


