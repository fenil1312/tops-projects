import java.util.*;

public class LedderIf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rno, s1, s2, s3, total;
		double per;
		String name;

		System.out.print("Enter Strdent name : ");
		name = sc.next();
		System.out.print("Enter marks of subject 1 : ");
		s1 = sc.nextInt();
		System.out.print("Enter marks of subject 2 : ");
		s2 = sc.nextInt();
		System.out.print("Enter marks of subject 3 : ");
		s3 = sc.nextInt();

		total = s1 + s2 + s3;
		per = total / 3;
		System.out.println();
		System.out.println("Student name : " + name);
		System.out.println("Student subject1 marks : " + s1);
		System.out.println("Student subject2 marks : " + s2);
		System.out.println("Student subject2 marks : " + s2);
		System.out.println("Total marks : " + total);
		System.out.println("Percentage : " + per);
		System.out.println();

		if (per >= 70) {
			System.out.println("Disgasting");
		} else if (per >= 60) {
			System.out.println("First class");
		} else if (per >= 50) {
			System.out.println("Second class");
		} else if (per >= 40) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
