package Sorting;

import static utils.PrintingUtils.*;
public class QuickSort {
	
	public static int[] quickSort(int[] array, int p, int r) {
		if (p<r) {
			int q = partition(array, p, r);
			quickSort(array, p, q);
			quickSort(array, q+1, r);
		}
		return array;
	}
	
	public static int partition(int[] array, int p, int r) {
		
		int pivot = array[r];
		int slow = p;
		for (int fast = p+1 ; fast <= r ; fast++) {
			if (array[fast] < pivot) {
				int temp  = array[slow];
				array[slow] = array[fast];
				array[fast] = temp;
				slow++;
			}
		}
		if (array[slow] > pivot) {
			int temp = array[r];
			array[r] = array[slow];
			array[slow] = temp;	
		}
		
		return slow;
	}

	public static void main(String[] args) {

		int[] array = {5,5,5,5,5,5,4,4,4,4,4,4,4};
		printArray(quickSort(array,  0, array.length-1), "Sorted Array");
		
	}

}
