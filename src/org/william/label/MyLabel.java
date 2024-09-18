package org.william.label;

import javax.swing.*;
import java.awt.*;

public class MyLabel extends JLabel {
    public MyLabel() {
        //this.setBackground(new Color(0xE8E8E8));
        //this.setHorizontalAlignment(JLabel.CENTER);
        this.setText("1 Start | 2 Stop");
        this.setBounds(90, 30, 90, 80);
        this.setBorder(BorderFactory.createLineBorder(new Color(0x111111)));
    }
}
