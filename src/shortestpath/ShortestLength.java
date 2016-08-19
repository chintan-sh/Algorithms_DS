/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortestpath;
import string.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author chintan
 */
public class ShortestLength {
    public static int n1 = 99;
    public static int n2 = 155;
    public static int count = 0;
    
    public void findShortestPath(int num1, int num2){
        int difference = num2 - num1;
        int max = 0;
        String tmp = String.valueOf(num1);
        String[] nums = tmp.split("");
        
        for(int i =0; i < nums.length; i++){
                int currentNumber = Integer.parseInt(nums[i]);
                if(currentNumber == difference){
                    max = currentNumber;
                }else if(currentNumber > max && currentNumber < difference){
                    max = currentNumber;
                }
        }
        
        System.out.println("Naya number hai compute hua hai by " + num1 + " + " + max + " = " +  (num1+max) );
        num1 = num1 + max;
        
        count++;
        
        System.out.println("Current count " + count);
        if(num2!=num1){
            findShortestPath(num1, num2);
        }
    }
    
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */        
        ShortestLength sl = new ShortestLength();
        sl.findShortestPath(n1, n2);
        System.out.println("Final Count is " + count);
    }
}


