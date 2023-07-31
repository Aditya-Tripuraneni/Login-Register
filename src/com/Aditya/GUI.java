package com.Aditya;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class GUI implements ActionListener {
    public static JLabel userLabel;
    public static JTextField userText;
    public static JPasswordField passwordText;
    public static JLabel passwordLabel;
    public static JButton loginButton;
    public static JLabel success;
    public static JButton registerButton;


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User: ");
        userLabel.setBounds(10,20, 80,25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        loginButton = new JButton("Login");
        loginButton.setBounds(10,80,85,25);
        loginButton.addActionListener(new GUI());
        panel.add(loginButton);

        registerButton = new JButton("Register");
        registerButton.setBounds(10,110,85,25);
        registerButton.addMouseListener(new Register());
        panel.add(registerButton);


        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);


        frame.setVisible(true);

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        System.out.println("Age" + " " + age);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user +" " + password);

        if (user.equals("Enter-Your-Username-Here") && password.equals("Enter-Your-Own-Password-Here")){
            success.setText("Login successful!");
        }
    }
}
