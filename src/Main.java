import org.william.StartClicker;
import org.william.frame.MyFrame;
import org.william.label.MyLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.InputEvent;

public class Main {
    public static void main(String[] args) {
        MyLabel myLabel = new MyLabel();
        MyFrame myFrame = new MyFrame(myLabel);

        StartClicker startClicker = new StartClicker();

        myFrame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_B) {
                    try {
                        startClicker.clicker();
                    } catch (AWTException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_A) {
                    try {
                        startClicker.clicker();
                    } catch (AWTException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
}