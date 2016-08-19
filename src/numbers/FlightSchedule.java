/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;
import string.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author chintan
 * 
 * Format : Flight #<number> arrived|departed at hh:mm AM|PM
 * Example : Flight #123 arrived at 11:23 AM
 */



/** Link to question : https://www.hackerrank.com/challenges/crush */
public class FlightSchedule {
    public static ArrayList<String> flightArray;
    
    
    public void init(){
        flightArray = new ArrayList<String>();
        flightArray.add("Flight #123 arrived at 11:23 AM");
        flightArray.add("Flight #2 arrived at 12:47 PM");
        flightArray.add("Flight #2 departed at 2:27 PM");
        flightArray.add("Flight #82 arrived at 3:03 PM");
        flightArray.add("Flight #82 departed at 5:12 PM");
        flightArray.add("Flight #123 departed at 11:59 PM");
    }
    
    
    public void computePairs(){
        HashMap <String,String> arrival = new HashMap <String,String>();
        HashMap <String,String> departure = new HashMap <String,String>();
        
        for(int i = 0; i < flightArray.size(); i++){
            String current = flightArray.get(i);
            String[] parts = current.split(" ");
            
            String number = parts[1];
            String status = parts[2];
            String time = parts[4] + " " + parts[5];
            
            if(status.equalsIgnoreCase("arrived")){
                arrival.put(number, time);
            }else{
                departure.put(number, time);
            }
           // System.out.println(" Flight " + number + " " + status + " at " + time);
        }
        
        ArrayList<Long> timeArray = new ArrayList<Long>() ;
        double sum  = 0; double count = 0;
        for (String key : arrival.keySet()) {
            String dateStart = arrival.get(key);
            String dateStop = departure.get(key);
            
             // Custom date format
            SimpleDateFormat format = new SimpleDateFormat("hh:mm a");  

            Date d1 = null;
            Date d2 = null;
            try {
                d1 = format.parse(dateStart);
                d2 = format.parse(dateStop);
            } catch (ParseException ex) {
                Logger.getLogger(FlightSchedule.class.getName()).log(Level.SEVERE, null, ex);
            }
            long diff = d2.getTime() - d1.getTime();//as given

            long seconds = TimeUnit.MILLISECONDS.toSeconds(diff);
            double minutes = TimeUnit.MILLISECONDS.toMinutes(diff); 
            sum = sum + minutes;
            count++;
        }
        
        int average = (int) Math.ceil(sum/count);
        
        System.out.println("Avg time " + average);
        
    }
    
    
    /*
    public void calculateTime(){
        String dateStart = "09:29 AM";
        String dateStop = "09:33 PM";

        // Custom date format
        SimpleDateFormat format = new SimpleDateFormat("hh:mm a");  

        Date d1 = null;
        Date d2 = null;
        try {
            d1 = format.parse(dateStart);
            d2 = format.parse(dateStop);
        } catch (ParseException ex) {
            Logger.getLogger(FlightSchedule.class.getName()).log(Level.SEVERE, null, ex);
        }
        long diff = d2.getTime() - d1.getTime();//as given

        long seconds = TimeUnit.MILLISECONDS.toSeconds(diff);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(diff); 
        
        System.out.println("TIme in muinutes is "+minutes );
    }*/
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */        
        FlightSchedule p1 = new FlightSchedule();
        p1.init();
        //p1.calculateTime();
        p1.computePairs();
    }
}
