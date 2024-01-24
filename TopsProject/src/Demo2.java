import java.util.*;

public class Demo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number A : ");
		int a = sc.nextInt();
		System.out.print("Enter number B : ");
		int b = sc.nextInt();
		System.out.print("Enter number C : ");
		int c = sc.nextInt();

		// if-else condition
//		if (a % 2 == 0) {
//			System.out.println("Number is even");
//		} else {
//			System.out.println("Number is odd");
//		}

//		if (a > b) {
//			System.out.println("A is Max number");
//		} else {
//			System.out.println("B is Max number");
//		}

		// Nested if-else condition
		if (a > b) {
			if (a > c) {
				System.out.println("A is Max number");
			} else {
				System.out.println("C is Max number");
			}
		} else if (b > c) {
			System.out.println("B is Max number");
		} else {
			System.out.println("C is Max number");
		}

	}

}
