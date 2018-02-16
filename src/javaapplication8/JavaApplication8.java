/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Dear Kallu
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("press '1' for count your repeat word ");
       System.out.println("press '2' for marge two array");
       System.out.println("press '3' for date");
       System.out.println("press '4' for exit");
       System.out.println("Your choose");
       int p = sc.nextInt();
       
                
        
        switch(p)
        {
            case 1 :
                RepeatingWord obj = new RepeatingWord();
                obj.show();
                break;
            case 2 :
                MargeTwoArray mta = new MargeTwoArray();
                mta.marge();
                break;
                
            case 3 :
            Date1 d = new Date1();
            d.display(); 
            default:
                return;
        }
        
    }
    
}
