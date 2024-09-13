package org.william.frame;

import javax.swing.JFrame;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(Component addComponent) {
        this.setTitle("Auto Clicker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(500, 500);
        this.add(addComponent);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(false);
    }
}
