package prractise;

import java.util.Arrays;
import java.util.Iterator;

public class MissingIntegerFind {


	public static void main(String[] args) {



		int array[] = { 1, 4, 5, 2, 3, 7, 6, 10 };
		// int array[] = {1,4,3,2,8,6,7};
		Arrays.sort(array);
		System.out.println("Sorted Array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}

		for (int i = 0; i < array.length - 1; i++) {
			int num1 = array[i];
			int num2 = array[i + 1];
			int diff = num2 - num1;
			if (diff > 1) {
				int missingElement = ++num1;
				System.out.println("\n" + "Missing Elements in given Array: " + missingElement);
				continue;
			}}}}
		
		








