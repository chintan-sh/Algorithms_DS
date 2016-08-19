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
public class MergeString {
    public String input = "masoom";
    public String s1 = "ms";
    public String s2 = "aoom";
    
    public int checkIfMergeable(){
        HashMap <Character,Integer> map = new HashMap <Character,Integer>();
        char[] c1 = input.toCharArray();
        char[] c2 = s1.toCharArray();
        char[] c3 = s2.toCharArray();
        
        for(int i=0; i< c1.length; i++){
            char singleCharacter = c1[i];
            if(map.containsKey(singleCharacter)){
                map.put(singleCharacter, map.get(singleCharacter)+1);
            }else{
                map.put(singleCharacter, 1);
            }
        }
        
        
        for(int i=0; i< c2.length; i++){
            char singleCharacter = c2[i];
            if(map.containsKey(singleCharacter)){
                if(map.get(singleCharacter) < 1){
                    return 0;
                }
                map.put(singleCharacter, map.get(singleCharacter)-1);
            }else{
                return 0;
            }
        }
        
        for(int i=0; i< c3.length; i++){
            char singleCharacter = c3[i];
            if(map.containsKey(singleCharacter)){
                if(map.get(singleCharacter) < 1){
                    return 0;
                }
                map.put(singleCharacter, map.get(singleCharacter)-1);
            }else{
                return 0;
            }
        }
        
        //iterating over keys only
        int max = 0;
        for (Character key : map.keySet()) {
            if(map.get(key) > 0){
                return 0;
            }
        }
        
    
        return 1;
    }
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */        
        MergeString ms = new MergeString();
        System.out.println("Kay re kartya, kiti chaaan jhala ahe nashta?! " + ms.checkIfMergeable());
    }
}


