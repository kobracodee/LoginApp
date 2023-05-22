/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
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
public class CreateAccount implements ActionListener {
    JFrame frame = new JFrame();
    JTextField userIdInputField = new JTextField();
//    JTextField userIdField = new JTextField();
    JPasswordField userPasswordInputField = new JPasswordField();
    JLabel userIdJLabel = new JLabel("UserID:");
    JLabel userPasswordJLabel = new JLabel("Password:");
    JLabel messeJLabel = new JLabel();
    JButton createButton = new JButton("Create");
    JButton button = new JButton("Back");
    HashMap<String, String> logininfo = new HashMap<String,String>();
    
   CreateAccount(HashMap<String,String> loginInfoOriginal){
       
        logininfo = loginInfoOriginal;
        
        userIdJLabel.setBounds(50,100,75,25);
        userPasswordJLabel.setBounds(50,150,75,25);
        
        messeJLabel.setBounds(100,250,250,35);
        messeJLabel.setFont(new Font(null,Font.ITALIC,25));
        
        userIdInputField.setBounds(125,100,200,25);
        userPasswordInputField.setBounds(125,150,200,25);
        
        createButton.setBounds(225,200,100,25);
        createButton.setFocusable(false);
        createButton.addActionListener(this);
        
        button.setBounds(100, 200, 100,25);
        button.setFocusable(false);
        button.addActionListener(this);
        
        frame.add(userIdJLabel);
        frame.add(userPasswordJLabel);
        frame.add(messeJLabel);
        frame.add(userIdInputField);
        frame.add(userPasswordInputField);
        frame.add(createButton);
        frame.add(button);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
   
   }
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        
        if (e.getSource()==createButton) {
            //checks if text is empty
            if (userIdInputField.getText().isEmpty()|| userPasswordInputField.getText().isEmpty()) {
                messeJLabel.setForeground(Color.RED);
                messeJLabel.setText("Provide the required information");
            }else{
                String addedUser = userIdInputField.getText();
                String addedPassowrd =  String.valueOf(userPasswordInputField.getPassword());
                logininfo.put(addedUser, addedPassowrd);
                messeJLabel.setForeground(Color.GREEN);
                messeJLabel.setText("Account has been added");
            }
        }
        if (e.getSource()==button) {
            frame.dispose();
            loginPage loginPage1 = new loginPage(logininfo);
        }
    }

}