import java.util.*;

public class Array2D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int array[][] = new int[3][3];

		System.out.println("Enter 2D array : ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print("Enter " + i + " Row & " + j + " Colomn : ");
				array[i][j] = sc.nextInt();
			}
		}

		System.out.println("2D array is : ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println("Array [" + i + "][" + j + "] = " + array[i][j]);
			}
		}

	}

}
