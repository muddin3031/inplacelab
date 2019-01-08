package com.company;

public class SortingUtilis {

        public static void swap(int[]testArr,int x,int y){
            int temp;
            temp = testArr[x];
            testArr[x]=testArr[y];
            testArr[y]=temp;
        }
        public static randomarray(int[] arr) {

        }
        public static boolean isSorted(int[]Arr)
        {
            for (int n = 0; n < Arr.length - 1; n++) {
                if (Arr[n] > Arr[n + 1]) {
                    SortingUtilis.swap(Arr, n, n + 1);
                }
            }
            return true;
        }


}
