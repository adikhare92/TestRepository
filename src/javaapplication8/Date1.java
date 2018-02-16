/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Dear Kallu
 */
public class Date1 {
    public static int getLastDateOfTheMonth(int year, int month)
    {
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, month);
        c.set(Calendar.DATE,c.getActualMaximum(Calendar.DATE));
        return c.getTime().getDate();
    }
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("please enter fromdate in YYYY-MM-DD format :");
            String fromDate1 = sc.next();
            System.out.println("please enter today date in YYYY-MM-DD format :");
            String todayDate1 = sc.next();
            DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
            
           
            if(df.isLenient())
            {
            String []fD = fromDate1.split("-");
            int fyear = Integer.parseInt(fD[0]);

            int fmonth = Integer.parseInt(fD[1]);
            int fdate = 1;
            String []tD = todayDate1.split("-");
            int tyear = Integer.parseInt(tD[0]);

            int tmonth = Integer.parseInt(tD[1]);
            int tdate = Integer.parseInt(tD[2]);
            if(fmonth<=12&&tmonth<=12){
            System.out.println("From date "+fyear+ "-"+fmonth+"-"+fdate);
            
            System.out.println("Today date : "+tyear+"-"+tmonth+"-"+getLastDateOfTheMonth(tyear, tmonth));
            
            }
        }
        
        
        }
        catch(Exception e)
        {
            System.out.println("Please Enter validate date format 'YYYY-MM-dd'" );
        }
         
      
        
    }
    
}
