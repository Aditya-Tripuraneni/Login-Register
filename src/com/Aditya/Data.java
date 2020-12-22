package com.Aditya;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Data extends Register{
    String [] storedUserName = new String[1];
    String [] storedPasswordName = new String[1];

    public void mouseClicked(MouseEvent e){
        storedUserName[0] = newUserText.getText();
        storedPasswordName[0] = newPasswordText.getText();
        System.out.println(storedUserName[0]);
        System.out.println(storedPasswordName[0]);
    }

}
