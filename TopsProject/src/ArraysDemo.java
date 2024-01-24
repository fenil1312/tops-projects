import java.util.*;

public class ArraysDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int sum = 0;

		System.out.println();
		System.out.println("Enter Array element ");
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter " + (i + 1) + " element : ");
			a[i] = sc.nextInt();
			sum += a[i];
		}
		System.out.println("Sum = " + sum);

		System.out.println();
		System.out.println("Array elements are");
		for (int i = 0; i < a.length; i++) {
			System.out.println("A[" + i + "] = " + a[i]);
		}

		// Ascending order
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("Array elements are in ascending order");
		for (int i = 0; i < a.length; i++) {
			System.out.println("A[" + i + "] = " + a[i]);
		}
		
		// Descending order
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("Array elements are in descending order");
		for (int i = 0; i < a.length; i++) {
			System.out.println("A[" + i + "] = " + a[i]);
		}

	}

}
