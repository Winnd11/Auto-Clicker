package org.william.label;

import javax.swing.*;
import java.awt.*;

public class MyLabel extends JLabel {
    public MyLabel() {
        this.setText("1 Start | 2 Stop");

        this.setVerticalAlignment(SwingConstants.CENTER);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setFont(new Font("Arial", Font.BOLD, 12));
    }
}
