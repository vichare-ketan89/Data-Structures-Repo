package com.sort.merge;

public class TestMergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {23,12,565,347, 5,7,8};
		
		MergeSort mergeSort = new MergeSort();
		int[] sortedArr = mergeSort.mergeSort(arr);
		
		for (int i : sortedArr) {
			System.out.print(i + " ");
		}
	}

}
