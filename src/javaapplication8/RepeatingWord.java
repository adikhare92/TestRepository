/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;


/**
 *
 * @author Dear Kallu
 */
public class RepeatingWord {
    public void show()
    {
        
        String [] str = {"AAA","AAA","BBB","BBB","BBB","CC","CC", "XXX", "XXX","PP","QQ","XXX","XXX"};
        int count=0;
        
        
        for(int i=0;i<str.length;i++)
        {
            for(int j=0;j<str.length;j++)
            {
                if(str[i].equals(str[j]))
                {
                    count=count+1;
                    
                }
                
            }
            //if(str[i]!="0")
            
            for(int j=i;j<=((i==str.length-1)?(i):(i+1));j++)
            {   if(!str[i].equals(str[j])){
                System.out.println(str[i]+" "+count);
                        
                        
                        
                }
                
                
                
            }
                    count=0;
        }
        
        
        
      
    }
    
}
