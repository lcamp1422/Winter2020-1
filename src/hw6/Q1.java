package hw6;

public class Q1 {

	public static void main(String[] args) {
		// how to sort an array without using any built-in functions.
		
		int[] numbers = {5,55,98,101,1,56,5};
		//				1,5,5,55,56,98,101
		
		
		int temp;
		
		for(int i=0; i<numbers.length ;i++){
			for(int j=i+1; j<numbers.length ;j++){
				if(numbers[i] > numbers[j]){
					temp = numbers[i];
					numbers[i]= numbers[j];
					numbers[j]=temp;
				}
			}
		}
		
		for(int item:numbers){
			System.out.println(item);
		}

	}

}
