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
 * QUESTION IS ON THIS LINK : https://www.hackerrank.com/challenges/crush
 * 
 */


/** Link to question : https://www.hackerrank.com/challenges/crush */
public class AlgorithmCrush {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numArr = new int[n];
        
        int m = input.nextInt();
        for(int i=0; i < m; i++){
            int a = input.nextInt() - 1;
            int b = input.nextInt() - 1;
            int k = input.nextInt();
            
            for(int y = a; y <= b; y++){
                numArr[y] = numArr[y] + k;
                System.out.println("Arraylist " + Arrays.toString(numArr));
            }
        }
        
        Arrays.sort(numArr);
        System.out.println("Arraylist " + Arrays.toString(numArr));
        int size = numArr.length;
        System.out.println("Maximum value of element is " + numArr[size-1]);
    }
}
