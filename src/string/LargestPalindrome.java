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
public class LargestPalindrome {
   public static int count = 0;
   public int j = 0;
   public boolean flag = true;
   
   public void findPalindrome(String word){
        System.out.print("\n String received " + word);
        while( word.length() > 1){
            String newWord = word ;
            newWord = newWord.replaceAll("[^a-zA-Z]+","");
            char[] arr = newWord.toLowerCase().toCharArray();
            int lastElem = arr.length-1;
            boolean flag = true;

            for(int i =  lastElem; i >= (arr.length/2); i--){
                char otherChar = arr[lastElem-i];
                if(arr[i] != otherChar){
                    newWord = newWord.substring(0, newWord.length()-1);
                    findPalindrome(newWord);
                    flag = false;
                    break;
                }else if( i == (arr.length/2)){
                    flag = true;
                }
            }
            
            if(flag){
                System.out.print("\n Final " + newWord);
                count = newWord.length();
            }
            
            break;
        }
   }


   
   public static void main(String[] args) {
        LargestPalindrome lp = new LargestPalindrome();
        lp.findPalindrome("kkkkkkkoooooooooooooooooookk");
        System.out.print("\n Max count for palindrome is " + count);
   }
   
}


/*   
   if(!flag){
               System.out.println("String kya hai : " + word.substring(0, word.length()-1));
               newWord = word.substring(0, newWord.length()-1);
               findPalindrome(newWord);
            }else{
                flag = true;
                count = newWord.length();
                break;
            }*/