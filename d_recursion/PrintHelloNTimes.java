package d_recursion;
import java.util.Scanner;

public class PrintHelloNTimes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		printMessage(num);
		
		scanner.close();
	}

	private static void printMessage(int num) {
		// base case
		if(num <= 0) return;
		
		System.out.println("Hello");
		
		// recursive call
		printMessage(num - 1);
	}
}
