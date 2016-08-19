/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;
import string.*;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author chintan
 */
public class PascalTriangle {
    
    public long factorial(long number){
        long factorial = 1;
        
        if(number < 2){
            return factorial;
        }
        
        for(long k = number; k > 1; k--){
            factorial = factorial * k;
        }
        
        return factorial;
    }
    
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */        
        PascalTriangle pt = new PascalTriangle();
        Scanner input = new Scanner(System.in);
        int inputCount = input.nextInt();
        System.out.println(1);
        for(int i=1; i <= inputCount; i++){
            String concatStr = 1 + " ";
            for(int j=1; j <= i; j++){
                long value = pt.factorial(i) / (pt.factorial(j) * (pt.factorial(i-j)) );
                concatStr += value + " ";
            }
            System.out.println(concatStr);
        }
    }
}
