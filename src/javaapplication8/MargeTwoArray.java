/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.lang.reflect.Array;
import java.util.*;

/**
 *
 * @author Dear Kallu
 */
public class MargeTwoArray {
    public void marge()
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Howmany element for first integer array : ");
        int n1=sc.nextInt();
        System.out.println("Howmany element for second integer array : ");
        int n2 = sc.nextInt();
        
        int []a=new int[n1];
        int []b=new int[n2];
        
        for(int i = 0; i<n1; i++ )
        {
            System.out.println("Enter element for first integer array : ");
            a[i]=sc.nextInt();
        }
        for(int i = 0; i<n2; i++ )
        {
            System.out.println("Enter element for second integer array : ");
            b[i]=sc.nextInt();
        }
        
        
        int j=n1;
        int []c= new int[n1+n2];
        for(int i = 0; i<n1; i++)
        {
            System.out.println(a[i]);
             c[i]=a[i];
             
        }
        for(int i = 0; i<n2; i++)
        {
            
             c[j]=b[i];
             j++;
             
             //System.out.println(c[j]);
             
             
        }
        Arrays.sort(c);
        System.out.println("final print");
        for(int i = 0; i<c.length;i++){
            
            System.out.println(c[i]);
        }
    }
}
