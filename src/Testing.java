import java.util.Scanner;

public class Testing {
	
	public static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
	
		
		int arr[] = {1,2,3,4};
		int n = arr.length;
		
		for (int i = n-1; i >= 0 ; i--) {
			System.out.print(arr[i]);
		}
	}
}
