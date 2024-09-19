package org.william.frame;

import org.william.StartClicker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton jButton;
    JMenuItem mI;
    JTextField jTextField;
    JFrame jFrameSpeed;
    StartClicker startClicker;

    public MyFrame(Component addComponent, StartClicker startClicker) {
        this.startClicker = startClicker;
//        jButton = new JButton();
//        jButton.addActionListener(this);

        JMenu jMenu = new JMenu("Options");
        mI = new JMenuItem("Delay");
        mI.addActionListener(this);
        JMenuBar jMenuBar = new JMenuBar();

        jMenu.add(mI);
        jMenuBar.add(jMenu);
        jMenuBar.setBackground(new Color(0xE8E8E8));

        this.setTitle("Auto Clicker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(300, 300);
        this.add(addComponent);
        this.setJMenuBar(jMenuBar);
        this.setLayout(null);
//        this.add(jButton);
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(0xE8E8E8));
        this.setLocationRelativeTo(null);

        jTextField = new JTextField(10);
        jTextField.setBounds(0, 0, 100, 100);

        jButton = new JButton("Delay");
        jButton.setSize(10, 10 );
        jButton.setBackground(new Color(0xE8E8E8));
        jButton.addActionListener(this);
        jButton.setBorder(BorderFactory.createLineBorder(new Color(0x111111)));

        jFrameSpeed = new JFrame();
        jFrameSpeed.setTitle("Options / Delay");
        jFrameSpeed.setResizable(true);
        jFrameSpeed.setSize(250,250);
        jFrameSpeed.setLayout(new FlowLayout());

        jFrameSpeed.add(jTextField);
        jFrameSpeed.add(jButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mI) {
            jFrameSpeed.setVisible(true);
        }

        if (e.getSource() == jButton) {
            int value = Integer.parseInt(jTextField.getText());
            startClicker.startDelay(value);
        }
    }
}
