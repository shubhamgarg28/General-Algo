package Sorting;

import utils.PrintingUtils;

public class InsertionSort {
	
	public static void insertionSort(int[] array) {
		
		
			for (int j = 1; j < array.length; j++) {
				int i = j -1;
				int key = array[j];
				while( i >=0 && array[i] > key) {
					array[i+1] = array[i];
					i = i -1;
				}
				array[i+1] = key;
			}
			
		
	}
	
	public static void main(String[] args) {
		int[] array = {2,3,1,4,5,7};
		InsertionSort.insertionSort(array);
		PrintingUtils.printArray(array, "Array is");
	}

}
