/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginsystem;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author DellPc
 */
public class welcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeJLabel = new JLabel("Hello!");

    welcomePage(String userID) {
        
        welcomeJLabel.setBounds(0,0,200,35);
        welcomeJLabel.setFont(new Font(null,Font.PLAIN,25));
        welcomeJLabel.setText("Hello " + userID);
        
        frame.add(welcomeJLabel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    
}
