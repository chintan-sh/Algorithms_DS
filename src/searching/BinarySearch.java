/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author chintan
 */
public class BinarySearch {
    
    int a[] =  {7,8,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6}; // ;{11,12,13,14,15,7,8,9,10}; //
    int a1[] =  {7,8,9,10,11,12,13,14,15};
    
    /*Find an element inside arr, if found, print iteration count - should be within log n*/
    public void search(int n){
        int arr[] = a1;
        int start = 0;
        int end = a1.length-1;
        int iteration = 0;
        boolean flag = false;
        System.out.println("Element to be searched " + n);
        
        if(n >= arr[start] && n <= arr[end]){
            /*Loop through arra*/
            for(int i=0; i < arr.length; i++ ){
                iteration++;
                int absolute = Math.abs(end + start);
                int mid = (int) (Math.ceil(absolute/2));
                System.out.println("Mid elemnt for iteration " + iteration + "  is : " + arr[mid]);

                /*If mid element is equal to n, print and break since elem found*/
                if(arr[mid] == n){
                     //System.out.println("Search element " + arr[mid]);
                     flag = true;
                     break;
                }

                /*If mid element is greater than, move 'end' to previous element of mid and keep 'start' as same */
                if(arr[mid] > n){
                    end = mid-1;
                    //System.out.println("New end " + arr[end]);
                }

                /*If mid element is lesser than, move 'start' to next element of mid and keep 'end' as same */
                if(arr[mid] < n){
                    start = mid+1;
                    //System.out.println("New start " + arr[start]);
                }

                //System.out.println("start  : " + start);
                //System.out.println("end : " + end);
                //System.out.println("\n");
            }
            
            System.out.println("Iteration count " +  arr.length + " is : " + iteration);
        }else{
            System.out.println("Element to be searched is out of range ");
        }
        System.out.println("Did we find element " + flag);
    }
    
    public void minFromRotated(){
        int start = 0;
        int end = a.length-1;
        int iteration = 0;
        System.out.println("Length " + a.length);
        for(int i=0; i < a.length; i++ ){
             iteration++;
            int absolute = Math.abs(end + start);
            int mid = (int) (Math.ceil(absolute/2));
            //System.out.println("Act value " + mid);
            System.out.println("Mid number " + a[mid]);
            
            if(start == end){
                 System.out.println("Min number " + a[start]);
                 break;
            }
            
            if(a[mid] > a[end]){
                if(start!=mid){
                    start = mid;
                }else{
                    start = mid+1;
                }
                //System.out.println("New start " + a[start]);
            }
            
            
            if(a[mid] < a[end]){
                if(end!=mid){
                    end = mid;
                }else{
                    end = mid-1;
                }
                //System.out.println("New end " + a[end]);
            }
            
            //System.out.println("start  : " + start);
            //System.out.println("end : " + end);
            //System.out.println("\n");
        }
        
        System.out.println("Iteration count " + iteration);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        BinarySearch b = new BinarySearch();
        b.search(9);System.out.println("\n");
        b.minFromRotated();

    }
}
