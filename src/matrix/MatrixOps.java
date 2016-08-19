/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chintan
 */
public class MatrixOps {
    int matrixArrFirst[][];
    int matrixArrSecond[][];
    int sumMatrixArr[][];
    int subMatrixArr[][];
    int mulMatrixArr[][];
    int matrixSize;
    int numRange;
    
    public void init(){
        /*Take user input and create uniformed 2-dim array*/
        Scanner arrSize = new Scanner(System.in);
        System.out.println("Please enter matrix dimensions, they need to be uniform");
        matrixSize = arrSize.nextInt();
        
        
        /*Take user input and create a range with inputted number as maximum*/
        Scanner numSize = new Scanner(System.in);
        System.out.println("Please enter max number for element");
        numRange = numSize.nextInt();
        
        /*Init declared array with user inputted size*/
        matrixArrFirst = new int[matrixSize][matrixSize];
        matrixArrSecond = new int[matrixSize][matrixSize];
        sumMatrixArr = new int[matrixSize][matrixSize];
        subMatrixArr = new int[matrixSize][matrixSize];
        mulMatrixArr = new int[matrixSize][matrixSize];
        System.out.println("Matrix A & B have now been initialized with dimensions : " + matrixSize + "x" + matrixSize );
    }
    
    public void setup(){
        Random randNum = new Random();
        for(int i = 0; i < matrixSize; i++){
            for(int j = 0; j < matrixSize; j++){
                matrixArrFirst[i][j] = randNum.nextInt(numRange);
                matrixArrSecond[i][j] = randNum.nextInt(numRange);
             }
        }
        
        /*for (int[] arr : matrixArrFirst) {
            System.out.print("Initial array A " + Arrays.toString(arr) + "\n");
        }
        
        for (int[] arr : matrixArrSecond) {
            System.out.print("Initial array B " + Arrays.toString(arr) + "\n");
        }*/
    }
    
    public void addition(){
        int operationCount = 0;
        long startTime = System.nanoTime(); //System.currentTimeMillis();
        for(int i = 0; i < matrixSize; i++){
            operationCount++;
            for(int j = 0; j < matrixSize; j++){
                sumMatrixArr[i][j] = matrixArrFirst[i][j] + matrixArrSecond[i][j];
                operationCount = operationCount + 2;
            }
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("\n \n Time taken to add matrix of size : " + matrixSize +" is " + totalTime + " ns \n \n");
        System.out.println("Operation count for addition is : " + operationCount );
        /*for (int[] arr : sumMatrixArr) {
            System.out.print("New array after add " + Arrays.toString(arr) + "\n");
        }*/
    }
    
    public void subtraction(){
        int operationCount = 0;
        long startTime = System.nanoTime(); //System.currentTimeMillis();
        for(int i = 0; i < matrixSize; i++){
            operationCount++;
            for(int j = 0; j < matrixSize; j++){
                subMatrixArr[i][j] = matrixArrFirst[i][j] - matrixArrSecond[i][j];
                operationCount = operationCount + 2;
            }
        }
        long endTime   = System.nanoTime(); //System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(" \n \n Time taken to subtract matrix of size : " + matrixSize +" is " + totalTime + " ns \n \n");
        System.out.println("Operation count for subtraction is : " + operationCount );
        /*for (int[] arr : subMatrixArr) {
            System.out.print("New array after sub " + Arrays.toString(arr) + "\n");
        }*/
    }
    
    public void multiplication(){
        int operationCount = 0;
        long startTime = System.nanoTime(); //System.currentTimeMillis();
             
        for(int i = 0; i < matrixSize; i++){
            operationCount++;
            for(int j = 0; j < matrixSize; j++){
                operationCount++;
                for(int k=0; k < matrixSize; k++){
                    mulMatrixArr[i][j] += matrixArrFirst[i][k] * matrixArrSecond[k][j];
                    operationCount = operationCount + 2;
                }
            }
        }
        long endTime   = System.nanoTime(); //System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(" \n \n Time taken to multiply matrix of size : " + matrixSize +" is " + totalTime + " ns \n \n");
        System.out.println("Operation count for multiplication is : " + operationCount );
        /*for (int[] arr : mulMatrixArr) {
            System.out.print("New array after mul " + Arrays.toString(arr) + "\n");
        }*/
    }
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatrixOps mat = new MatrixOps();
        mat.init();
        mat.setup();
        mat.addition();
        mat.subtraction();
        mat.multiplication();
    }
    
}


