package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {

	public static void calculateLength() {

		// UC-1 Length calculation
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first (X1, y1) value: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter the second (X2, y2) value: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		double a = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);

		System.out.println("The length of the first line is: " + a);

		// UC-2 Checking Equality of two line
		System.out.println("Enter (X3, y3) value: ");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		System.out.println("Enter (X4, y4) value: ");
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();

		double b = (double) Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2) * 1.0);

		System.out.println("The length of the second line is: " + b);

		if (a == b) {
			System.out.println("Two lines are equal: \n a: " + a + " = b: " + b);
		} else {
			System.out.println("Two lines are not equal: \n a: " + a + " = b: " + b);
		}

		// UC-3 and 4 Length comparison between two lines

		System.out.println("\nLine comparison resilts is :");
		if (Double.compare(a, b) == 0) {
			System.out.println(("Both lines are equal"));
		} else if (Double.compare(a, b) < 0) {
			System.out.println(("Second line is greater then first line"));
		} else if (Double.compare(a, b) > 0) {
			System.out.println(("First line is greater than second line"));
		} else {
			System.out.println("Both are not equal");
		}
	}

	public static void main(String[] args) {
		System.out.println("<---------Welcome to Line Comparison------------->");
		calculateLength();
	}

}
