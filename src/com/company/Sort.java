package com.company;

public class Sort {



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
            int lowest = 0;
        for(int i=0; i<testArr.length-1;i++){
            lowest = i;
            for(int j=1; j<testArr.length-i;j++){
                if(testArr[lowest]>testArr[i+j]){
                    lowest = i+j;
                }
            }
            SortingUtilis.swap(testArr,i,lowest);
        }
    return testArr;

        }
}
