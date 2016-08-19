package sorting;

import java.util.Arrays;

public class MergeSort {

    public int[] merge(int[] arr){
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
        int[] firstArr = merge(leftArr);
        int[] secondArr = merge(rightArr);
        int fLength = firstArr.length;
        int sLength = secondArr.length;//System.out.println("First Array is " + Arrays.toString(firstArr));System.out.println("Second Array is" + Arrays.toString(secondArr));System.out.println("\n");

        // declare new variables
        int i = 0;
        int j  = 0;
        int[] sortedArr = new int[length];

        // now merge sorted arrays
        for(int k=0; k< length; k++){ //System.out.println("New value of i is " + i);System.out.println("New value of j is " + j);System.out.println("Limit is " + splitSize);
            if(i < fLength && j < sLength){ //System.out.println("Value of i is  " + i + " and that of j " + j);
                    if(firstArr[i] <= secondArr[j]){
                        sortedArr[k] = firstArr[i];
                        i++;
                    }else if(secondArr[j] <= firstArr[i]){
                        sortedArr[k] = secondArr[j];
                        j++;
                    }
            }else if(i < fLength && j >= sLength){
                sortedArr[k] = firstArr[i];
                i++;
            }else if(j < sLength && i >= fLength){
                sortedArr[k] = secondArr[j];
                j++;
            }
        }

        System.out.println("Sorted array after merge iteration" + Arrays.toString(sortedArr));
        return sortedArr;
    }


    public static void main(String[] args) {
        int[] arr = {1,3,6,4,5,2,7};
        MergeSort m = new MergeSort();
        System.out.println("Kya bhai, kaisa? \n");
        System.out.println("Initial array " +  Arrays.toString(arr));
        System.out.println("Sorted Array is " + Arrays.toString(m.merge(arr)));
    }
}
