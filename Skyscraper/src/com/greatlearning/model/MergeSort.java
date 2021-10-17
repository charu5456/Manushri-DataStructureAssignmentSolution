package com.greatlearning.model;

public class MergeSort {
    void merge(int arr[], int n, int mid, int m) {
        int left = mid - n + 1;
        int right = m - mid;

        int[] leftArray = new int[left];
        int[] rightArray = new int[right];

        for(int i = 0; i < left; ++i) {
            leftArray[i] = arr[n + i];
        }
        for(int j = 0; j < right; ++j) {
            rightArray[j] = arr[mid + j + 1];
        }
        int i = 0, j = 0;
        int k = n;
        while(i < left && j < right) {
            if(leftArray[i] > rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i < left) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j < right) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
    public void sortArr(int[] array, int n, int m) {
        if(n < m) {
            int mid = (n + m) / 2;
            sortArr(array, n, mid);
            sortArr(array,mid + 1, m);
            merge(array, n, mid, m);
        }
    }
}
