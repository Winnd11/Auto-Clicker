package org.william.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton jButton;
    JMenuItem mI;
    JTextField jTextField;

    public MyFrame(Component addComponent) {
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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jTextField = new JTextField(10);
        jTextField.setBounds(0, 0, 100, 100);

        jButton = new JButton("Delay");
        jButton.setSize(10, 10 );
        jButton.setBackground(new Color(0xE8E8E8));
        jButton.setBorder(BorderFactory.createLineBorder(new Color(0x111111)));

        JFrame jFrameSpeed = new JFrame();
        jFrameSpeed.setTitle("Options / Delay");
        jFrameSpeed.setResizable(true);
        jFrameSpeed.setSize(250,250);
        jFrameSpeed.setLayout(new FlowLayout());

        jFrameSpeed.add(jTextField);
        jFrameSpeed.add(jButton);

        if (e.getSource() == mI) {
            jFrameSpeed.setVisible(true);
        }
    }
}
