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


public class PairOfPairs {
    public int[] arr = {5,2,4,5,1,9};
    
    public void computePairs(){
        HashMap <Integer,Integer> map = new HashMap <Integer,Integer>();
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                    int val = arr[i] + arr[j];
                    System.out.println("Outcome for : " + arr[i] + " and " + arr[j] + " is " + val);
                    if(map.containsKey(val)){
                        map.put(val, map.get(val)+1);
                    }else{
                        map.put(val, 1);
                    }
            }
        }
        
        
        //iterating over keys only
        int max = 0;
        for (Integer key : map.keySet()) {
            if(map.get(key) > 1){
                max++;
            }
        }
        
        System.out.println("Output is : " + max);
    
    }
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */        
        PairOfPairs p1 = new PairOfPairs();
        p1.computePairs();
    }
}
