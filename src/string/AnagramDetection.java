/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.*;
/**
 *
 * @author chintan
 */
public class AnagramDetection {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int inputCount = input.nextInt();
        input.nextLine();
        String current;
        int missHit = 0;
        for(int i=0; i < inputCount; i++){
             current = "xulkowreuowzxgnhmiqekxhzistdocbnyozmnqthhpievvlj" ;// input.nextLine();
             if((current.length())% 2 != 0 ){
                 System.out.println("-1");
             }else{
                 int strSize = (current.toCharArray().length);
                 System.out.println("String size " +  strSize) ;
                 int halfCount = strSize/2;
                 char[] strArr1 = Arrays.copyOf(current.toCharArray(), (strSize/2));
                 char[] strArr2 = Arrays.copyOfRange(current.toCharArray(),(strSize/2),strSize);
                 
                 HashMap<Character, Integer> letterCount = new HashMap<Character, Integer>();
                 for (Character c : strArr1){
                        if(letterCount.containsKey(c)) {
                            letterCount.put(c, letterCount.get(c)+1);
                        }else {
                            letterCount.put(c, 1);
                        }
                }
                 
                System.out.println("Size batao thoda : " + letterCount.size());
                System.out.println("Size strArr2 ka batao : " + strArr2.length);
                 
                for (int j=0; j < strArr2.length; j++){
                    System.out.println("Pehla value mila : " + strArr2[j]);
                    System.out.println("Value mila hai hash se : " + letterCount.get(strArr2[j]));
                    if(letterCount.get(strArr2[j]) == null || letterCount.get(strArr2[j]) < 1){
                       missHit++;
                    }else{
                       letterCount.put(strArr2[j], letterCount.get(strArr2[j])-1);
                    }
                }
                 
                 System.out.println(missHit);
             }
        }
    }
}



/* Version 1 

public class AnagramDetection {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputCount = input.nextInt();
        input.nextLine();
        String current;
        int missHit = 0;
        for(int i=0; i < inputCount; i++){
             current = "hhpddlnnsjfoyxpciioigvjqzfbpllssuj" ;// input.nextLine();
             if((current.length())% 2 != 0 ){
                 System.out.println("-1");
             }else{
                 int strSize = (current.toCharArray().length);
                 System.out.println("String size " +  strSize) ;
                 int halfCount = strSize/2;
                 char[] strArr1 = Arrays.copyOf(current.toCharArray(), (strSize/2));
                 char[] strArr2 = Arrays.copyOfRange(current.toCharArray(),(strSize/2),strSize);
                 Arrays.sort(strArr1);
                 Arrays.sort(strArr2);
                 missHit=0;
                 
                 System.out.println("Arr1 size " +  strArr1.length) ;
                 System.out.println("Arr2 size " +  strArr2.length) ;
                 for(int j=0 ; j < halfCount; j++){
                     System.out.println("Value for j " + j + " is " +  strArr1[j] + " and " + strArr2[j]);
                     if(strArr1[j] != strArr2[j]){
                        missHit++;
                     }
                 }
                 
                 System.out.println(missHit);
             }
        }
    }
}

*/