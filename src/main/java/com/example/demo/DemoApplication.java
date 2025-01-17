package com.example.demo;

public class DemoApplication {

	public static int Factorial(int n) {
		if (n == 0) return 1;
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	public static int Max(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}

	public static boolean LYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	public static String rString(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	public static boolean palindrome(String str) {
		String reversed = rString(str);
		return str.equals(reversed);
	}

	public static int rnumber(int min, int max) {
		return (int) (Math.random() * (max - min + 1)) + min;
	}

	public static void bubbleSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static int farray(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public static int fibonacci(int n) {
		if (n <= 1) return n;
		int a = 0, b = 1, sum;
		for (int i = 2; i <= n; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		return b;
	}

	public static String[] table(int number) {
		String[] table = new String[10];
		for (int i = 1; i <= 10; i++) {
			table[i - 1] = number + " x " + i + " = " + (number * i);
		}
		return table;
	}

	public static String toBinary(int number) {
		return Integer.toBinaryString(number);
	}

	public static double safeDivide(double numerator, double denominator) {
		return denominator == 0 ? Double.NaN : numerator / denominator;
	}
}
