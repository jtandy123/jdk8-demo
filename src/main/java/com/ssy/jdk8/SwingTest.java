package com.ssy.jdk8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTest {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("My Frame");
        JButton jButton = new JButton("My JButton");

        jButton.addActionListener((ActionEvent e) -> {
            System.out.println("Button Pressed!");
            System.out.println("hello world");
            System.out.println("executed");
        });

        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
