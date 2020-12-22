package com.Aditya;

import jdk.jfr.DataAmount;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


class Register extends MouseAdapter implements MouseListener{
    public static JLabel newRegisterLabel;
    public static JLabel newPasswordLabel;
    public static JTextField newUserText;
    public static JPasswordField newPasswordText;
    public static JButton createAccount;


    @Override
    public void mouseClicked(MouseEvent e) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        System.out.println(e.getX() + ", " + e.getY());
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        newRegisterLabel = new JLabel("Create New name: ");
        newRegisterLabel.setBounds(10, 20, 140, 25);
        panel.add(newRegisterLabel);

        newPasswordLabel = new JLabel("Create New Password: ");
        newPasswordLabel.setBounds(10, 40, 140, 25);
        panel.add(newPasswordLabel);

        newUserText = new JTextField(20);
        newUserText.setBounds(150, 20, 165, 25);
        panel.add(newUserText);

        newPasswordText = new JPasswordField(20);
        newPasswordText.setBounds(150, 40, 165, 25);
        panel.add(newPasswordText);

        createAccount = new JButton("Create Account");
        createAccount.setBounds(10, 80, 150, 25);
        Data data = new Data();
        createAccount.addMouseListener(data);
        panel.add(createAccount);

        frame.setVisible(true);
    }
}
