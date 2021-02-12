package utils;

public class PrintingUtils {
	
public static void printArray(int[] array, String message) {
		
		System.out.print(message + ": ");
		for (int a : array) {
			System.out.print(a + "=>");
		}
		System.out.println("");
	}

}
