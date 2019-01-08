package com.company;

public class SelectionSort {


    public static int[] bubbleSort(int[] testArr){
        for(int count = 0; count < testArr.length; count++) {
            for (int n = 0; n < testArr.length - 1; n++) {
                if (testArr[n] > testArr[n + 1]) {
                    SortingUtilis.swap(testArr, n, n + 1);
                }
            }
        }
        return testArr;
    }

    public static int[] SelectionSort(int[] testArr){
        int val=0;
        for(int count = 0; count < testArr.length; count++) {
            for (int n = 0; n < testArr.length - 1; n++) {
                if (val > testArr[n + 1]) {
                    SortingUtilis.swap(testArr, n, n + 1);
                }
            }
        }
        return testArr;
    }
}
