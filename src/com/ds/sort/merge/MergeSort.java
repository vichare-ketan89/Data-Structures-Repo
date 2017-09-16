package com.ds.sort.merge;

public class MergeSort {

	/**
	 * 
	 * @param arr Array to be sorted
	 * @return sorted Array
	 */
	public int[] mergeSort(int[] arr) {

		if(arr.length < 2) {
			return arr;
		}

		int length = arr.length;

		int m = length/2;

		int[] subArr1 = new int[m];
		int[] subArr2 = new int[length -m];

		int i = 0, j = 0, k=0;

		while(i < m) {
			subArr1[i] = arr[k];
			i++;
			k++;
		}

		while(j < (length - m)) {
			subArr2[j] = arr[k];
			j++;
			k++;
		}

		//Divide into subArrays
		mergeSort(subArr1);
		mergeSort(subArr2);

		//Sort & Merge
		return merge(subArr1, subArr2, arr);
	}

	private int[] merge(int[] subArr1, int[] subArr2, int[] arr) {

		int i=0, j=0, k=0;
		while(i < subArr1.length && j < subArr2.length) {
			//System.out.println(i + " " + j + " " + " " + k);
			if(subArr1[i] < subArr2[j]) {
				arr[k] = subArr1[i];
				i++;
			}else {
				arr[k] = subArr2[j];
				j++;
			}
			k++;
		}

		//Add remaining elements into final array
		while(i < subArr1.length) {
			arr[k] = subArr1[i];
			i++;
			k++;
		}
		while(j < subArr2.length) {
			arr[k] = subArr2[j];
			j++;
			k++;
		}

		return arr;
	}

}
