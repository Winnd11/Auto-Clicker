package org.william.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton jButton;

    public MyFrame(Component addComponent) {
        jButton = new JButton();
        jButton.setBounds(100, 50, 120, 40);
        jButton.addActionListener(this);
        jButton.setText("Is Actived");
        jButton.setFocusable(false);
        jButton.setBackground(new Color(0xE8E8E8));
        jButton.setFont(new Font("Helvetica", Font.BOLD, 10));
        jButton.setBorder(BorderFactory.createLineBorder(new Color(0x151515)));

        JMenu jMenu = new JMenu("Options");
        JMenuItem mI = new JMenuItem("1");
        JMenuBar jMenuBar = new JMenuBar();

        jMenu.add(mI);
        jMenuBar.add(jMenu);

        this.setTitle("Auto Clicker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(300, 200);
        this.add(addComponent);
        this.setJMenuBar(jMenuBar);
        this.add(jButton);
        this.setLayout(null);
        this.setResizable(true);
        //this.setFocusable(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton) {

        }
    }
}
