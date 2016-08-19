/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author chintan
 */
public class Summation {
    int iterator = 0;
    int holder = 0;
    int tmp=0 ;

    int[] arr = {2,3,-2,-4,3,3};
    int max = arr[arr.length-1];
    int min = arr[0];
    
    public void max(){
        for (int i=0; i < arr.length; i++){
            tmp  =  i; 
            holder = 0 ; 
            iterator = i;
            while (iterator != arr.length){
                holder = holder + arr[tmp];
                tmp = tmp +1;
                
                if( holder > max ){
                    max = holder;
                }
                
                iterator++;
            }
        }
        
        System.out.println ("Max value possible for continuous subsets summation " + max);
    }
    
    public void maxSum(){ 
          // Stores maximum sum 
          int maxSum = 0; 

          // Stores sum computed so far 
          int currentSum = 0; 

          for(int i = 0; i < arr.length; i++) {
                   currentSum += arr[i]; 
                   if(currentSum > maxSum) { 
                          maxSum = currentSum; 
                   } 
                   // If current sum becomes negative set it to 0 
                   //For above example, currentSum will be set to 0 after 2,3,-2,-4 

                   if(currentSum < 0) { 
                          currentSum = 0; 
                   } 
          }

      System.out.println ("Max value possible for continuous subsets using ankit algo " + maxSum); 
   }
    
   
    
   public void minSum(){ 
          // Stores maximum sum 
          int minSum = arr[0]; 

          // Stores sum computed so far 
          int currentSum = 0; 

          for(int i = 0; i < arr.length; i++) {
                   currentSum -= arr[i]; 
                   if(currentSum < minSum) { 
                          minSum = currentSum; 
                   } 

                   if(currentSum > arr[i]) { 
                          currentSum = arr[i]; 
                   } 
          }

      System.out.println ("Min value possible for continuous subsets using your modified version " + minSum); 
   }
   
    public void minSum1(){ 
	 int minSumSum = 0; 
	 int currentSum = 0; 
	 for(int i = 0; i < arr.length; i++) { 
		 currentSum += arr[i]; 
		 if(currentSum < minSumSum) { 
		 	minSumSum = currentSum; 
		 } 
		 if(currentSum > 0) { 
		 	currentSum = 0; 
		 } 
	 } 
	System.out.println ("Mix value possible for continuous subsets using ankit algo " + minSumSum);  
    }
    
   public void min(){
        for (int i=0; i < arr.length; i++){
            holder = arr[i];
            tmp  =  i+1;
            iterator = i;
            while (iterator != arr.length){
                    if(iterator!=i){
                        holder = holder - arr[tmp];
                        tmp = tmp +1;
                    }
                    
                    if( holder < min ){
                        min = holder;
                    }
                iterator++;
            }
        }
        
        System.out.println ("Min value possible for continuous subsets subtraction " + min);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Summation s = new Summation();
        //s.maxSum();
        //s.max();
        s.minSum1();
        s.minSum();
        s.min();

    }

}
