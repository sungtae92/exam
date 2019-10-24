package com.sungtae.exam;

public class ArrayTest {
	public static void main(String[] args) {
		int[] array = { 4, 5, 10, 22, 80, 11 };
		// String str = "하나";
		printArrayValue(array);
		printArrayValue(array);

	}

	public static void printArrayValue(String[] a) {
		for (String str : a) {
			System.out.println(str);
		}
	}

	public static void printArrayValue(int[] a) {
		int sum = 0;
		/*
		 * for(int i = 0; i < a.length; i++) { System.out.println(a[i]); sum = sum +
		 * a[i]; }
		 */
		for (int aaa : a) {
			System.out.println(aaa);
			sum = sum + aaa;
		}

		System.out.println("합계 : " + sum);
	}
}
