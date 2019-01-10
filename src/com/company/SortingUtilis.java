package com.company;

public class SortingUtilis {

        public static void swap(int[]testArr,int x,int y){
            int temp;
            temp = testArr[x];
            testArr[x]=testArr[y];
            testArr[y]=temp;
        }
    public static char[] randomStringArr(int count){
        char[] randomStringArr = new char[count];
        for(int n=0;n<count-1;n++){
            randomStringArr[n]=(char)((Math.random()*26)+97);
        }
        return randomStringArr;
    }

    public static int[] randomIntArr(int count){
        int[] randomIntArr = new int[count];
        for(int n=0;n<count-1;n++){
            randomIntArr[n]=(int)(Math.random()*1001);
        }
        return randomIntArr;
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
