package Sorting;

import utils.PrintingUtils;

public class InsertionSortRecusion {
	
	public  static void insertionSort(int[] array, int index) {
		
		if (index == 0) {
			return;
		} else {
			insertionSort(array, index -1 );
			int i = index -1;
			int key = array[index];
			while( i >=0 && array[i] > key) {
				array[i+1] = array[i];
				i = i -1;
			}
			array[i+1] = key;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {4,3,2,1,5,6,8,7,4,3,2,1,5,6,8,7,4,3,2,1,5,6,8,7,4,3,2,1,5,6,8,7,4,3,2,1,5,6,8,74,3,2,1,5,6,8,7};
		System.out.println(System.currentTimeMillis());
		insertionSort(array, array.length -1);
		System.out.println(System.currentTimeMillis());
		PrintingUtils.printArray(array, "Sorted Array is");
		
		
	}

}
