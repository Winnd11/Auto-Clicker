package org.william;

import java.awt.*;
import java.awt.event.InputEvent;

public class StartClicker {
    int delay;

    public void startDelay(int delay) {
        this.delay = delay;
    }

    public void clicker() throws AWTException {
        System.out.println(delay);
        Robot robot = new Robot();
        while (!Thread.interrupted()) {
            try {
                robot.delay(delay);
                robot.mousePress(InputEvent.getMaskForButton(1));
                robot.mouseRelease(InputEvent.getMaskForButton(1));
                    if (Thread.interrupted()) {
                        break;
                    }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
