/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;
import string.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author chintan
 * 
 * 
 */


/** Link to question : https://www.hackerrank.com/challenges/crush */
public class IndianaJones {
    public static ArrayList<Integer> intArray;
    public static long sum = 8;
    public static long count = 0;
    
    public void init(){
        intArray = new ArrayList<Integer>();
        intArray.add(6);
        intArray.add(1);
        intArray.add(3);
        intArray.add(5);
        intArray.add(7);
        intArray.add(1);
        intArray.add(9);
    }
    
    public void computePairs(){
        for(int i =0; i < intArray.size(); i++){
            for(int j = i+1; j < intArray.size(); j++){
                long summation = intArray.get(i) + intArray.get(j);
                if(summation == sum){
                    count++;
                }
            }
        }
        
        System.out.println("Total unique pairs with same value as sum " + count);
    }
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */        
        IndianaJones p1 = new IndianaJones();
        p1.init();
        p1.computePairs();
    }
}
