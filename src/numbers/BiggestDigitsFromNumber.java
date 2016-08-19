package numbers;

public class BiggestDigitsFromNumber {
	public String number = "8912"; // "8912"; //"89912"
	public int truncateCount = 2;
	public int counter = 0;
	public int start = 0;
	public int minimum = 0;
	public int visited = 0;
	
	public void findSmallest(){
		char[] numberArr = number.toCharArray();
		int numCount = numberArr.length - truncateCount;//System.out.println("Number count to be kept " + numCount);
		int[] reqArr = new int[numCount];
		minimum = 10;//System.out.println("Array length is " + numberArr.length);
		
		for(int i = 0; i < numCount; i++){
			int limit = counter + (numberArr.length-numCount);
			System.out.println("Limit is " + limit);
			
			for(int j = start; j <= limit; j++){
				int currentElem = Character.getNumericValue(numberArr[j]); //System.out.println("Current element is " + currentElem);
				if(currentElem < minimum){
					minimum = currentElem;
					visited = j;
					//System.out.println("Lesser than min found " + currentElem);//System.out.println("Visited index " + visited);
				}
			}
			
			reqArr[counter] = minimum; 
			start = visited + 1;
			minimum = 10;
			counter++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < reqArr.length; i++){
				sb.append(reqArr[i]);
		}
		System.out.println("Least number found " + sb);
	}
	
	
	public static void main(String[] args) {
		BiggestDigitsFromNumber m = new BiggestDigitsFromNumber();
		m.findSmallest();
	}
  
}
