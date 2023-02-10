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
import java.util.Scanner;
public class Swimmmer extends Person{
    String gender;
    int speed;
    public void setGender(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter wearing color: ");
        String color = input.nextLine();
        if(color == "blue"){
            this.gender = "male";
        }
        else{
            this.gender = "female";
        }
    }
    public void setSpeed(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed: ");
        speed = input.nextInt();
    }
    public String getGender(){
        return this.gender;
    }
    public int getSpeed(){
        return this.speed;
    }
    public void swim(){
        System.out.println("Start Swimming " + this.name);
    }
    public void touchTP(){
        System.out.println("Finished Swimming " + this.name);
    }
    
}
