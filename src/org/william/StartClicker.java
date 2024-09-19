package org.william;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class StartClicker {
    public void clicker() throws AWTException {
        Robot robot = new Robot();
        while (!Thread.interrupted()) {
            try {
                robot.delay(10);
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
