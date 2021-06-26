package utils;

import java.util.concurrent.ThreadLocalRandom;

public class GeneratorUtils {
	
	public static int[] generateArray(int size) {
		int[] array = new int[size];
		
		for (int i =0 ; i  < size ; i++) {
			array[i] = ThreadLocalRandom.current().nextInt();
		}
		return array;
		
	}
	
	public static int[] generateArraySorted(int size) {
		int[] array = new int[size];
		
		for (int i =0 ; i  < size ; i++) {
			array[i] = i+1;
		}
		return array;
		
	}
	
	public static int[] copyArray(int[] array) {
		int[] array2 = new int[array.length];
		for (int i = 0 ; i< array.length ; i++) {
			array2[i] = array[i];
		}
		return array2;
	}
	

}
