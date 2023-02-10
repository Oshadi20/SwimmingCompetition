/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.swimmingcomp;

/**
 *
 * @author OshadiPC
 */
public class ScoreBoard {
    
    public void display(Swimmmer swimmer){
        System.out.println("Winner is " + swimmer.getName() + ". Winner is a "+ swimmer.getGender() + ". Winner's id: "+ swimmer.getId());  
    }
}
