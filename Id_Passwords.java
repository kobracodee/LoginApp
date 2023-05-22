/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginsystem;

import java.util.HashMap;

/**
 *
 * @author DellPc
 */
public class Id_Passwords {
    HashMap<String,String> loginInfo = new HashMap<String,String>();

    public Id_Passwords() {
        loginInfo.put("Abbas", "Hamze");
        loginInfo.put("bro", "Hamze");
        loginInfo.put("code", "Hamze");
    }

    protected HashMap getLoginInfo() {
        return loginInfo;
    }
    
    
}
