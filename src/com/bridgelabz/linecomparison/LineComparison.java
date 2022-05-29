package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {

	public static void calculateLength() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X1 value: ");
		int x1 = sc.nextInt();
		System.out.println("Enter Y1 value: ");
		int y1 = sc.nextInt();
		System.out.println("Enter X2 value: ");
		int x2 = sc.nextInt();
		System.out.println("Enter Y2 value: ");
		int y2 = sc.nextInt();
		System.out.println("Enter X3 value: ");
		int x3 = sc.nextInt();
		System.out.println("Enter Y3 value: ");
		int y3 = sc.nextInt();
		System.out.println("Enter X4 value: ");
		int x4 = sc.nextInt();
		System.out.println("Enter Y4 value: ");
		int y4 = sc.nextInt();

		double a = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
		double b = (double) Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2) * 1.0);

		if (a == b) {
			System.out.println("Two lines are equal: \n a: " + a + " = b: " + b);
		} else {
			System.out.println("Two lines are not equal: \n a: " + a + " = b: " + b);
		}

		if (Double.compare(a, b) == 0) {
			System.out.println(("Both lines are equal"));
		} else if (Double.compare(a, b) < 0) {
			System.out.println(("Both lines are less"));
		} else if (Double.compare(a, b) > 0) {
			System.out.println(("Both lines are greater"));
		} else {
			System.out.println("Both are not equal");
		}
	}

	public static void main(String[] args) {
		System.out.println("<---------Welcome to Line Comparison------------->");
		calculateLength();
	}

}
