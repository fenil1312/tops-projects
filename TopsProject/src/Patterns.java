import java.util.*;

public class Patterns {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		System.out.println();

		// For diamond
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n - 1 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		for (int i = n - 2; i >= 0; i--) {
			for (int k = 0; k < n - 1 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		// For butterfly
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					System.out.print("  ");
				}
				System.out.print("*");
			}
			for (int k = 0; k < (n - (i + 1)) * 2; k++) {
				System.out.print(" ");
			}
			for (int m = 0; m <= i; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					System.out.print("  ");
				}
				System.out.print("*");
			}
			for (int k = 0; k < (n - (i + 1)) * 2; k++) {
				System.out.print(" ");
			}
			for (int m = 0; m <= i; m++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// For holo square
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" ");
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();

		// For holo rectangle
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0) {
					System.out.print("      ");
				}
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
