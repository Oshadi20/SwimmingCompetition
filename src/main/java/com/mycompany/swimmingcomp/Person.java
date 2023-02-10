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
public class Person {
    public String name;
    public int id;
    
    public void setName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = input.nextLine();
        
    }
    public void setId(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter id: ");
        id = input.nextInt();
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
}
