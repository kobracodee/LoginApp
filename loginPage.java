/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author DellPc
 */
public class loginPage implements ActionListener{
    
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton restButton = new JButton("Rest");
    JTextField userIdField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIdJLabel = new JLabel("UserID:");
    JLabel userPasswordJLabel = new JLabel("Password:");
    JLabel messeJLabel = new JLabel();
    JButton createAccButton = new JButton("Create Account");
    HashMap<String, String> logininfo = new HashMap<String,String>();

    loginPage(HashMap<String,String> loginInfoOriginal) {
        
        logininfo = loginInfoOriginal;
        
        userIdJLabel.setBounds(50,100,75,25);
        userPasswordJLabel.setBounds(50,150,75,25);
        
        messeJLabel.setBounds(125,350,250,35);
        messeJLabel.setFont(new Font(null,Font.ITALIC,25));
        
        userIdField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);
        
        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        
        restButton.setBounds(225,200,100,25);
        restButton.setFocusable(false);
        restButton.addActionListener(this);
        
        createAccButton.setBounds(150, 250, 150,25);
        createAccButton.setFocusable(false);
        createAccButton.addActionListener(this);
        
        frame.add(userIdJLabel);
        frame.add(userPasswordJLabel);
        frame.add(messeJLabel);
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(restButton);
        frame.add(createAccButton);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        if (e.getSource()==restButton) {
            userIdField.setText("");
            userPasswordField.setText("");
        }
        
        if (e.getSource()==loginButton) {
            
            String userID = userIdField.getText();
            String password = String.valueOf(userPasswordField.getPassword());
            
            if (logininfo.containsKey(userID)) {
                if (logininfo.get(userID).equals(password)) {
                    messeJLabel.setForeground(Color.GREEN);
                    messeJLabel.setText("Login successful");
                    frame.dispose();
                    welcomePage welcomePage = new welcomePage(userID);
                }else{
                    messeJLabel.setForeground(Color.RED);
                    messeJLabel.setText("Wrong Password");
                }
            }else{
                messeJLabel.setForeground(Color.RED);
                messeJLabel.setText("Username not Found");
            }
        }
        
        if (e.getSource()==createAccButton) {
            frame.dispose();
            CreateAccount createAccount = new CreateAccount(logininfo);
        }
        
    }
    
    
}
    

