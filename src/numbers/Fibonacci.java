/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import searching.*;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author chintan
 */
public class Fibonacci {
    
    /*Find an element inside arr, if found, print iteration count - should be within log n*/
    public int fib(int number){
        if(number == 0){
            return 0;
        }
        
        if(number == 1){
            return 1;
        }
        
        return fib(number-1) + fib(number-2);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Fibonacci fb = new Fibonacci();
        for (int i = 1; i <= 8; i++){
            System.out.println(i + ": " + fb.fib(i));
        }

    }
}
