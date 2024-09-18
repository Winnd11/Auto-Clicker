package org.william.label;

import javax.swing.*;
import java.awt.*;

public class MyLabel extends JLabel {
    public MyLabel() {
        this.setText("1 Start | 2 Stop");

        this.setFont(new Font("Helvetica", Font.BOLD, 10));
        this.setVerticalAlignment(SwingConstants.CENTER);
        this.setHorizontalAlignment(SwingConstants.CENTER);
    }
}
