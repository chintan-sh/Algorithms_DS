package matrix;

// Multilplication algorithm to multiple 2 numbers (Keep in mind, this ONLY works to multiple "2" numbers!)
public class KaratsubaMultiplication {
	public String number1 = "5678";
	public String number2 = "1234";
	public int[] sum = new int[3];
	public int count = 0;
	public int[] numArr  = new int[6];
	public int splitSize;
	
	public void init(){
		int totalLength = number1.length();
		splitSize = totalLength/2;
		numArr[0] = Integer.parseInt(number1.substring(0, 2));
		numArr[1] = Integer.parseInt(number1.substring(2, 4));
		numArr[2] = numArr[0] + numArr[1];
		numArr[3] = Integer.parseInt(number2.substring(0, 2));
		numArr[4] = Integer.parseInt(number2.substring(2, 4));
		numArr[5] = numArr[3] + numArr[4];
		for(int i=0; i < numArr.length; i++){
			System.out.println("Nummber " + i + " is : " + numArr[i]);
		}
		multiply();
		int step4 = sum[2] - sum[1] - sum[0];
		double product = Math.pow((double)10, (double)totalLength) * sum[0] +  Math.pow((double)10, (double)splitSize) * step4 +  sum[1] ;
		System.out.println("Normal multplication product " + Integer.parseInt(number1)*Integer.parseInt(number2));
		System.out.println("Final result using karatsuba is " + product);
	}
	
	
	public void multiply(){
		if(count <= splitSize) {
			sum[count] = numArr[count] * numArr[count+3];
			count++;
			multiply();
		}
	}
	

	public static void main(String[] args) {
		KaratsubaMultiplication km = new KaratsubaMultiplication();
		km.init();
	}
  
}
