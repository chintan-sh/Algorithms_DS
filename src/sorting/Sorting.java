/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author chintan
 */
public class Sorting {
    public int tmp;
    public char charTmp;
    public int[] numArr =  {8,7,6,5,4,9, 3,2,1, 10}; //{8,1,3,7,5,6,4,2};  //{-90, -91, 8,7,2, -11,-13,6,5,4,-3,3,2,1, -9, 2456, -1, -89}; 
    public int[] numArr1 = {20,6,9,9999,6754,75,45678,32,876,89,8975,76435,90000,34,23,736876834,2545,1212,343,57577,5767,2323};
    public char[] charArr = "EASYQUESTION".toCharArray();
    public int k = 0;
    public int m = k+1;
    public int count = 0;
    public int counter=0;
    public int swap=0;
    private int[] numbers = numArr1;
    private int number;
    public boolean flag;
    
    public void bubbleSort(){
        flag = false;
        System.out.println("Initial array : " +  Arrays.toString( numArr ) );
        
        for (int i=0; i< numArr.length;i++){
            for(int j = i+1; j < numArr.length; j++){
                if(numArr[i] > numArr[j]){ //System.out.println("Gone inside to see whats happening : " + numArr[i] + " is bloody greater than " + numArr[j]);
                    tmp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = tmp;
                    count++;
                    flag = true;
                    System.out.println("After " + count + " iteration : "+  Arrays.toString( numArr ) );
                }
            }
            
            if(!flag){ // if no swaps took place in first iteration, it means array is already sorted and hence break the loop
                break;
            }
        }
        System.out.println("Sorted array by Bubble Sort: " +  Arrays.toString( numArr ) );
    }
    
    public void selectionSort(){
        System.out.println("Initial array : " +  Arrays.toString( numArr ) );
        for (int i=0; i< numArr.length;i++){
            swap = i;
            for(int j=i+1; j < numArr.length; j++){
                if(numArr[swap] > numArr[j]){
                    System.out.println(numArr[swap] + " greater than " + numArr[j]);
                    swap = j; 
                }
                count++;
            }
            
            tmp = numArr[i];
            numArr[i] = numArr[swap];
            numArr[swap] = tmp;
            count++;
        }
        System.out.println("Total iterations " +  count);
        System.out.println("Sorted array by Selection Sort: " +  Arrays.toString( numArr ) );
    }
    
    /*public void insertionSort(){
        for (int i=0; i< (numArr.length-1);i++){
            System.out.println("\n");
            System.out.println("Initial array : " +  Arrays.toString( numArr ) );
            for(int j = i+1; j > 0 ; --j){
                System.out.println("Outer elemt selected " + numArr[j-1]);
                System.out.println("Inner elemnt selected " + numArr[j]);
                if(numArr[j-1] > numArr[j]){ 
                    System.out.println("Gone inside to see whats happening : " + numArr[j] + " is bloody smaller than " + numArr[j-1] + " so swapping");
                    tmp = numArr[j-1];
                    numArr[j-1] = numArr[j];
                    numArr[j] = tmp;
                }else{
                    break;
                }
                
                count++;
            }
            
            count++;
        }
        System.out.println("Total iteration count " + count);
        System.out.println("Sorted array by Insertion Sort: " +  Arrays.toString( numArr ) );
    }*/
    

    public void sort(int[] values) {
      // check for empty or null array
      if (values ==null || values.length==0){
        return;
      }
      this.numbers = values;
      number = values.length;
      quicksort(0, number - 1);
    }

    private void quicksort(int low, int high) {
      int i = low, j = high;
      int pivot = numbers[low + (high-low)/2];

      while (i <= j) {
        while (numbers[i] < pivot) {
          i++;
        }
        
        while (numbers[j] > pivot) {
          j--;
        }

        if (i <= j) {
          exchange(i, j);
          i++;
          j--;
        }
      }
      
      if (low < j)
        quicksort(low, j);
      if (i < high)
        quicksort(i, high);
    }

    private void exchange(int i, int j) {
      int temp = numbers[i];
      numbers[i] = numbers[j];
      numbers[j] = temp;
    }
    
    public Boolean bubbleSortByRecursion(){
        if( m == 1){
            System.out.println("Initial array : " +  Arrays.toString( numArr1 ) );
        }
        
        if(numArr1[k] > numArr1[m]){
            System.out.println("Gone inside to see whats happening : " + numArr1[k] + " is bloody greater than " + numArr1[m] + " and counter is " + counter);
            int tmp = numArr1[k];
            numArr1[k] = numArr1[m];
            numArr1[m] = tmp;
        }        
        
        if(m == (numArr1.length-1)){
            k = k + 1;//new value
            if( k < (numArr1.length-1)){
                m = k+1; //new value + 1  
            }else{                
                System.out.println("Recursively Sorted array : " +  Arrays.toString( numArr1 ) );
                return false;
                //System.exit(0);
            }
        }else{
             m++;
        }
        counter++;
        bubbleSortByRecursion();
        return false;
    }
    
    
    public void findMaxNumber(){
        int maxElem = numArr[0];
        for(int i=0; i< numArr.length; i++ ){
            if(numArr[i] > maxElem){
                maxElem = numArr[i];
                
            }
        }
        System.out.println("\n " );
        System.out.println("Overall max number is " + maxElem);
        System.out.println("\n " );
    }
    
        
    public int[] divider(int number, int divisions){
        Random rand = new Random();
        int[] container = new int[divisions];

        System.out.print(number + "->");
        while (number > 0){
            container[rand.nextInt(divisions)]++;
            number--;
        }
        
        //create array of size 4
        int[] timeArray = new int[4];
        
        //randomize next two values
        for (int i=0; i < container.length; i++){
            timeArray[i+1]=container[i];
        }
        
        System.out.print("Heres array " + Arrays.toString(timeArray));
        return timeArray;
    }
    
    public void generateNumbers(){
        int max  = 100;
        for(int j=1; j< 800; j++){
            if(j%50==0){
            System.out.print(j + "\n");
            }
            /*int[] randomNumbers = new int[j];
            Random random = new Random();
            for (int i = 0; i < randomNumbers.length; i++) {
                randomNumbers[i] = random.nextInt((300 - 2) + 1) + 2;
            }  
            System.out.print(Arrays.toString(randomNumbers) + "|1\n");*/
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sorting s = new Sorting();
        
        // TODO code application logic here
        long startTime = System.currentTimeMillis();

       
        //s.divider(10, 3);
        s.bubbleSort();
        //s.findMaxNumber();
        //s.bubbleSortByRecursion();
        //s.selectionSort();
        //s.insertionSort();
        //s.generateNumbers();
        //s.quicksort( 0, (s.numArr1.length-1));
        //System.out.println("Sorted array by Qucik Sort: " +  Arrays.toString( s.numArr1 ) );
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Time taken to sort : " + totalTime + " ms");
    }
    
}


/*

        Alternate solution for bubble sort
        
        for (int i=0; i< numArr.length-1;i++){
            for(int j = 1; j < (numArr.length - i); j++){
                if(numArr[j-1] > numArr[j]){ //System.out.println("Gone inside to see whats happening : " + numArr[i] + " is bloody greater than " + numArr[j]);
                    int tmp = numArr[j-1];
                    numArr[j-1] = numArr[j];
                    numArr[j] = tmp;
                    count++;
                    System.out.println("After " + count + " iteration : "+  Arrays.toString( numArr ) );
                }
            }
        }




            
    public void quickSort(int a[], int p, int r){
        if(p<r){
            int q=partition(a,p,r);
            quickSort(a,p,q);
            quickSort(a,q+1,r);
        }
    }

    private int partition(int[] a, int p, int r) {
        int x = a[p];
        int i = p-1 ;
        int j = r+1 ;

        while (true) {
            i++;
            while ( i< r && a[i] < x)
                i++;
            j--;
            while (j>p && a[j] > x)
                j--;

            if (i < j)
                swap(a, i, j);
            else
                return j;
        }
    }

    private void swap(int[] a, int i, int j) {
        // TODO Auto-generated method stub
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


*/