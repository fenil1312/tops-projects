import java.util.*;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int i = sc.nextInt();
		int sum = 0;

//		while (i > 0) {
//			sum += i;
//			i--;
//		}

		do {
			sum += i;
			i--;
		} while (i > 0); 
		
		System.out.println("Sum = " + sum);

	}

}
