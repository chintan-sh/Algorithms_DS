/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author chintan
 */
public class StringManipulation {
  
   public void Palindrome(String s){
       System.out.println("Initial : " + s);
       s =  s.replaceAll("[^a-zA-Z]+",""); //s.replace("?,", ""); 
       System.out.println("After filter : " + s);
       char[] arr = s.toLowerCase().toCharArray(); //convert string to char
       int lastElem = arr.length-1; //last element
       boolean flag = true;
       
       for(int i = lastElem; i >= (arr.length/2); i--){
           char otherChar = arr[lastElem-i]; 
           System.out.println("Current char : " + arr[i]);
           System.out.println("Other char : " + otherChar);
           if(arr[i] != otherChar){
               flag = false;
               break;
           }
       }
       
       if(flag){
           System.out.println("Given String : " + s + "  is a palindrome " );
       }else{
           System.out.println("Given String : " + s + "  is NOT a palindrome " );
       }
   
   }
   
   
   public void Factorial(int number){
       number = 32;
       int factorial = 1;
       
       if(number > 0){
            for(int i = number; i > 1 ; i--){
                factorial *= i;
            }
       }
       
       System.out.println("Factorial for " + number + " is " + factorial + " \n");
       
   }

   
   public static void main(String[] args) {
        StringManipulation sm = new StringManipulation();
        //sm.Palindrome("N12N MNn?123 ,");
        sm.Factorial(7);
      
       
        /*String s = "Java is java again java again";
        char c = 'a';
        int count = s.length() - s.replace("a", "").length();
        System.out.println("Number of occurances of 'a' in "+s+" = "+count);   

        String[] arr = new String[99999];
        for(int i=0; i< 99999; i ++){
            arr[i] = "a";
            System.out.print(i + "\n");
        }


        long startTime = System.currentTimeMillis();
        String result = "";
        for (String s : arr) {
            result = result + s;
        }
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Time taken to using concatenation : " + totalTime + " ms");

        long startTime1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        long endTime1   = System.currentTimeMillis();
        long totalTime1 = endTime1 - startTime1;
        System.out.println("Time taken to using builder : " + totalTime1 + " ms");

        result = sb.toString();

       /*StringBuilder str = new StringBuilder("India ");
       System.out.println("string = " + str);

       // append character to the StringBuilder
       str.append('!');
       // convert to string object and print it
       System.out.println("After append = " + str);

       str = new StringBuilder("Hi "); 
       System.out.println("string = " + str);
       // append integer to the StringBuilder
       str.append(123);
       // convert to string object and print it
       System.out.println("After append = " + str);*/
   }
   
}