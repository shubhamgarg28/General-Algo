package Sorting;

import utils.GeneratorUtils;

public class InsertionAndMergeComperison {
	
	public static void main(String[] args) {
		
		int[] array1 = GeneratorUtils.generateArray(1000000);
		int[] array2 = GeneratorUtils.copyArray(array1);
		long start1 = System.nanoTime();
		
		MergeSort.mergeSort(array1, 0, array1.length -1);
		System.out.println("Merge solving time => " + (System.nanoTime() -start1));
		
		long start2 = System.nanoTime();
		InsertionSort.insertionSort(array2);
		System.out.println("Insertion solving time => " + (System.nanoTime() -start2));
	}

}
