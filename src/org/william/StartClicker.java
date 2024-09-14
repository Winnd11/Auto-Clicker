package org.william;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class StartClicker {
    public void clicker(int state) throws AWTException {
            try {
                Robot robot = new Robot();
                while (state != 2) {
                    robot.delay(50);
//                    robot.mousePress(InputEvent.getMaskForButton(1));
//                    robot.mouseRelease(InputEvent.getMaskForButton(1));
                    robot.keyPress(KeyEvent.VK_L);
                    if (state == 2) {
                        break;
                    }
                }
            } catch (AWTException e) {
                e.printStackTrace();
            }
    }
}
