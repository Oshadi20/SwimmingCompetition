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
public class LaunchComp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of swimmers: ");
        int noSwim = input.nextInt();
        Swimmmer[] swimmers = new Swimmmer[noSwim];
        for(int i=0; i<noSwim; ++i){
            swimmers[i] = new Swimmmer();
            swimmers[i].setName();
            swimmers[i].setGender();
            swimmers[i].setId();
            swimmers[i].setSpeed();
        }
        
        System.out.println("Enter number of spectators: ");
        int noSpec = input.nextInt();
        Spectator[] spectators = new Spectator[noSpec];
        for(int i=0; i<noSpec; ++i){
            spectators[i] = new Spectator();
            spectators[i].setName();
            spectators[i].setId();
        }
        
        System.out.println("Enter number of judges: ");
        int noJud = input.nextInt();
        Judge[] judges = new Judge[noJud];
        for(int i=0; i<noJud; ++i){
            judges[i] = new Judge();
            judges[i].setName();
            judges[i].setId();
        }
        
        judges[0].blowWhistle();
        for(int i=0; i<noSwim; ++i){
            swimmers[i].swim();
        }
        for(int i=0; i<noSpec; ++i){
            spectators[i].cheer();
        }
        int j = -1;
        int max = 0;
        for(int i=0; i<noSwim; ++i){
            
            if(swimmers[i].getSpeed() > max){
                max = swimmers[i].getSpeed();
                j = i;
            }
        }
        swimmers[j].touchTP();
        for(int i=0; i<noSpec; ++i){
            spectators[i].cheer();
        }
        ScoreBoard s1 = new ScoreBoard();
        s1.display(swimmers[j]);
            
        
        
    }
    
}
