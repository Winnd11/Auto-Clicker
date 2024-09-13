package org.william;

import java.awt.*;
import java.awt.event.InputEvent;

public class StartClicker {
    public void clicker() throws AWTException {
        try {
            Robot robot = new Robot();
            robot.delay(2000);
            for (int i = 0; i <= 15; i ++) {
                robot.delay(50);
                robot.mousePress(InputEvent.getMaskForButton(1));
                robot.mouseRelease(InputEvent.getMaskForButton(1));
            }
        } catch (AWTException e) {
            e.printStackTrace();
        };
    }
}
