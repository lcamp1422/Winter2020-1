package hw6;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;

		swap(a,b);
		
	}
	
	public static void swap(int a, int b){
		int temp;
		temp =a;
		a = b;
		b = temp;
	}
	public static void levi() {
		System.out.println("levi");
	}
}
