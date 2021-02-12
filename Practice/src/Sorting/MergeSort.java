package Sorting;

import static utils.PrintingUtils.*;

public class MergeSort {
	
	static int[] array = {9,8,1,3,5,4,6,2};
	
	public static int[] mergeSort(int[] array, int p, int r) {
		
		if (p<r) {
			int q = (int) Math.floor((r+p)/2);
			mergeSort(array, p, q);
			mergeSort(array, q + 1, r);
			merge(array, p, q, r);
		}
		return array;
	}
	
	public static int[] merge(int[] array, int p, int q, int r) {
		
		int n1 = q-p + 1;
		int n2 = r - q;
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for (int i = 0 ; i < n1 ; i++) {
			left[i] = array[p + i];
		}
		for (int j = 0 ; j < n2 ; j++) {
			right[j] = array[q + j + 1];
		}
		int i = 0;
		int j = 0;
		printArray(left, "Left Array");
		printArray(right, "Right Array");
		int k = 0;
		for ( k = p ; k < r ; k++) {
			if (i < n1 && j < n2) {
				if (left[i] < right[j]) {
					array[k] = left[i];
					i++;
				} else {
					array[k] = right[j];
					j++;
				}	
				
			} else {
				break;
			}
			
		}
		
		
		while (i < n1) {
			array[k] = left[i];
			 i++;
			 k++;
		}
		while (j < n2) {
			array[k] = right[j];
			j++;
			k++;
		}
		printArray(array, "Main Array");
		
		return array;
	}

	public static void main(String[] args) {			

		
		array = mergeSort(array, 0, array.length-1);
		printArray(array, "Final Array");
	}

}
