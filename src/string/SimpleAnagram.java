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
public class SimpleAnagram {
  
   public void findAnny(String s1, String s2){
       s1 = s1.replaceAll("[^A-Za-z0-9]+", "");
       s2 = s2.replaceAll("[^A-Za-z0-9]+", "");
       
       HashMap<Character,Integer> map = new HashMap<Character,Integer>();
       for(char c : s1.toCharArray()){
           if(map.containsKey(c)){
               map.put(c, map.get(c)+1);
           }else{
               map.put(c, 1);
           }
       }
       
       
       for(char c : s2.toCharArray()){
           if(map.containsKey(c)){
               if(map.get(c) >= 1){
                    map.put(c, map.get(c)-1);
               }else{
                   System.out.println("No means no!");
                   break;
               }
           }else{
               System.out.println("Not anagram!");
               break;
           }
       }
       
       System.out.println("Anagram wala!");
   }

   
   public static void main(String[] args) {
        SimpleAnagram sm = new SimpleAnagram();
        //sm.Palindrome("N12N MNn?123 ,");
        sm.findAnny("ayechodu","choddayeu");
   }
   
}