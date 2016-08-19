package numbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
 Full question here :http://www.practice.geeksforgeeks.org/problem-page.php?pid=558
 */

public class CountInversions {
    long count = 0;

    public int[] sortAndCount(int[] arr){
        //get array length
        int length = arr.length; //System.out.println("Initial length " + length);

        // if length is 1, return array
        if(length < 2){
            return arr;
        }

        // get the array's size and halve it
        int splitSize = (int) Math.ceil(length/2);//System.out.println("Split size " + splitSize);

        //divide array into right and left half
        int[] leftArr = Arrays.copyOfRange(arr, 0, splitSize);
        int[] rightArr = Arrays.copyOfRange(arr, splitSize, length );//System.out.println("Split Array 1 is " + Arrays.toString(leftArr));System.out.println("Split Array 2 is" + Arrays.toString(rightArr));

        //send them for merging
        int[] firstArr = sortAndCount(leftArr);
        int[] secondArr = sortAndCount(rightArr);
        int fLength = firstArr.length;
        int sLength = secondArr.length;//System.out.println("First Array is " + Arrays.toString(firstArr));System.out.println("Second Array is" + Arrays.toString(secondArr));System.out.println("\n");

        // declare new variables
        int i = 0;
        int j  = 0;
        int[] sortedArr = new int[length];

        // now sort arrays and als count inversions
        for(int k=0; k< length; k++){ //System.out.println("New value of i is " + i);System.out.println("New value of j is " + j);System.out.println("Limit is " + splitSize);
            if(i < fLength && j < sLength){ //System.out.println("Value of i is  " + i + " and that of j " + j);
                if(firstArr[i] <= secondArr[j]){
                    sortedArr[k] = firstArr[i];
                    i++;
                }else if(secondArr[j] <= firstArr[i]){
                    count += fLength - i;
                    sortedArr[k] = secondArr[j];
                    j++;
                }
            }else if(i < fLength && j >= sLength){
                sortedArr[k] = firstArr[i];
                System.out.println();
                i++;
            }else if(j < sLength && i >= fLength){
                sortedArr[k] = secondArr[j];
                j++;
            }
        }

        //System.out.println("Sorted array after merge iteration" + Arrays.toString(sortedArr));
        return sortedArr;
    }


    public static void main(String[] args) {
        Scanner dataFile = null;
        try {
            dataFile = new Scanner(new File("merge_data.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++){
            arr[i] = dataFile.nextInt();
        }
        //int[] arr = {2,4,1,3,5};//{6,5,4,3,2,1};//{1,3,5,2,4,6}; //for quick test, uncomment this code and comment everything above
        CountInversions m = new CountInversions();
        System.out.println("Initial array " + Arrays.toString(arr));
        System.out.println("Sorted Array is " + Arrays.toString(m.sortAndCount(arr)));
        System.out.println("Inversion count is " + m.count);
    }
}
