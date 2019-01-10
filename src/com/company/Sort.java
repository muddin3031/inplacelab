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
            int lowest=0;
            for(int count = 0; count < testArr.length; count++) {
                lowest=count;
                for (int n = 0; n < testArr.length; n++) {
                    if(testArr[lowest]<testArr[n])
                    {
                        lowest=n;
                    }
                    SortingUtilis.swap(testArr,lowest,count);
                }

            }
            return testArr;
        }


}
