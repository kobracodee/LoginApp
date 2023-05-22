/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginsystem;

/**
 *
 * @author DellPc
 */
public class LogInSystem {

    public static void main(String[] args) {
        Id_Passwords idandPasswords = new Id_Passwords();
        
        
        
        loginPage loginpage = new loginPage(idandPasswords.getLoginInfo());
    }
}
