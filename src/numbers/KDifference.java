/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author chintan
 */
public class KDifference {
    
    
    public int checkDifference(int[] a, int k){
        int difference = 0;
        int paircounter = 0;
        for(int i=0; i < a.length; i++){
            for(int j= i+1; j < a.length; j++){
                System.out.println("K diff to be compared for " + a[i] + "," + a[j] );
                difference = a[i] - a[j];
                if(Math.abs(difference) == k){
                    //System.out.println("K diff found for " + a[i] + "," + a[j] );
                    paircounter ++;
                }
            }
        
        }
        
        System.out.println("Total pair counter is " + paircounter);
        return paircounter;
    }
    
     public void checkDifferenceForUserInput(){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[2];
        for(int i=0; i < 2; i++){
             numbers[i] = input.nextInt();
        }
        
        int total = numbers[0];
        int k = numbers[1];
        int[] a = new int[total];
        for(int j=0; j < total; j++){
             a[j] = input.nextInt();
        }
        
        Arrays.sort(a);
        
        int difference = 0;
        int paircounter = 0;
        int arrSize = a.length-1;
        int absolute_value = 0;
        System.out.println("Array after sorting " + Arrays.toString(a));
        for(int i=0; i < arrSize; i++){
                for(int j= i+1; j <= arrSize; j++){ //(i+k+1)
                    System.out.println("K diff to be compared for " + a[i] + "," + a[j] );
                    difference = a[i] - a[j];
                    absolute_value = Math.abs(difference);
                    if(absolute_value == k){
                        paircounter ++;
                    }else if(absolute_value > k){
                        break;
                    }
                }
        }
        
        System.out.println("Total pair counter is " + paircounter);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] =  {74567345,43575,5685647,1253123,273655,56,3283467,60,7364,74,23792382,36476387,78} ;//{56,3,1,2,4} ; //{363374326,364147530, 61825163, 1073065718, 1281246024, 1399469912, 428047635, 491595254, 879792181, 1069262793};
        KDifference kDiff = new KDifference();
        //kDiff.checkDifferenceForUserInput();
        kDiff.checkDifference(a, 4);
        String s = "hello";
        char[] charArr = s.toCharArray();

    }
}
