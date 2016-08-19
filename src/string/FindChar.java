/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.HashSet;

/**
 *
 * @author chintan
 */
public class FindChar {
    public HashSet<Character> charSet = new HashSet<Character>();
    public String s = "dafbhdsbkfhbs";
    public char[] charArr = s.toCharArray();
    public String search = "chintan";
    public char[] searchChar = search.toCharArray();
    
    
    public String find(){
        /*for(int i = 0 ; i < charArr.length; i++){
            if(!charSet.contains(charArr[i])){
                charSet.add(charArr[i]);
            }
            
            //Assuming string only contains alphanumerics
            if(charSet.size() == 36){
                System.out.println("Search charachters found");
                return null;
            }
        }*/
        System.out.println("Original string " + s);
        System.out.println("Search string " + search + "\n");
        
        for(int j=0 ; j < searchChar.length; j++ ){
            if(!s.contains(Character.toString(searchChar[j]))){
                System.out.println("Charachters not found");
                return null;
            }
            /*if(!charSet.contains(searchChar[j])){
                System.out.println("Search charachters not found");
                return null;
            }*/
        }
        
        System.out.println("Charachters found");
        return null;
    }
    
    public static void main(String[] args) {
        FindChar f = new FindChar();
        f.find();
    }
}

/*"Upcasting and downcasting are important part of Java, which allow us to build complicated programs using simple syntax, and gives us great "
                + "advantages, like Polymorphism or grouping different objects. Java permits an object of a subclass type to be treated as an object of any "
                + "superclass type. This is called upcasting. Upcasting is done automatically, "
                + "while downcasting must be manually done by the programmer, and i'm going to give my best to explain why is that so.\n" +
                "\n" +
                "Upcasting and downcasting are NOT like casting primitives from one to other, and i believe that's what causes a lot of confusion, when programmer starts to learn casting objects.\n" +
                "\n" +
                "Polymorphism: All methods in java are virtual by default. That means that any method can be overridden when used in inheritance, unless that method is declared as final or static.\n" +
                "\n" +
                "You can see the example below how getType(); works according to the object(Dog,Pet,Police Dog) type.\n" +
                "\n" +
                "Assume you have three dogs ";*/