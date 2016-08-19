/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;
import java.io.*;
import java.util.*;
/**
 *
 * @author chintan
 */
public class AISubstring {
    public String input = "abcdabcdeababcdef";
    
    public int checkAISubstring(){
        char[] c = input.toCharArray();
        int charLength = c.length;
        String[] arr = new String[charLength];
        int j = -1;
        
        
        StringBuilder sb = new StringBuilder();
        sb.append(c[0]);
        System.out.println(" start sb  value   " + sb);
        for(int i=1; i< charLength; i++ ){
            System.out.println(" Comparing  " + c[i-1] + "  and " + c[i] );
            if(c[i-1] < c[i]){
                sb.append(c[i]);
                System.out.println(" sb value   " + sb);
                if(i == charLength-1){
                    if(sb.length() >= 2){
                        j++;
                        arr[j] = sb.toString();
                    }
                }
            }else{
                System.out.println(" Inside else, final sb :   " + sb);
                if(sb.length() >= 2){
                    j++;
                    arr[j] = sb.toString();
                    
                }
                sb = new StringBuilder();
                sb.append(c[i]);
            }
        }
        
        
        
        int count = 1; int max = 0;
        for(int k=0; k <= j; k++){
            System.out.println("Looping for " + arr[k]);
            count = 1;
            for(int x = k+1; x <= j; x++){
                System.out.println(" Comparring : " + arr[k].length() + " with " + arr[x].length());
                if(arr[k].length() < arr[x].length()){
                        count++;
                }
            }
            
            System.out.println(" Count after for :   " + count);
            if(count > max){
                max = count;
            }
        }
        
        System.out.println(" Final count :   " + max);
        return max;
    }
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */        
        AISubstring as = new AISubstring();
        System.out.println("Final result " + as.checkAISubstring());
    }
}


