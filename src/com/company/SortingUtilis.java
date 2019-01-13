package com.company;

public class SortingUtilis {
//swaps
        public static void swap(int[]testArr,int x,int y){
            int temp;
            temp = testArr[x];
            testArr[x]=testArr[y];
            testArr[y]=temp;
        }
    public static void swap(String[] list, int x, int y) {
        String temp = list[x];
        list[x] = list[y];
        list[y] = temp;
    }

    public static void swap(double[] doubleArr, int i, int j) {
        double temp = doubleArr[i];
        doubleArr[i] = doubleArr[j];
        doubleArr[j] = temp;
    }
    // random generators-------------------------------------------
    public static String[] randomStringArr(int count, int letters) {
        String[] randomStringArr = new String[count];
        while (count > 0) {
            String x = "";
            for (int i = 0; i < letters; i++) {             //amount of letters for each word are given here
                char y = (char) ((Math.random() * 26) + 97);
                x = x + y;
            }
            count--;
            randomStringArr[count] = x;
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
    public static double[] randomdoubleArr(int count){
        double[] randomdoubleArr = new double[count];
        for(int n=0;n<count-1;n++){
            randomdoubleArr[n]=(int)(Math.random()*1001);
        }
        return randomdoubleArr;
    }


//Checking for sorts------------------------------------------------------
        public static boolean isSorted(int[]testArr)
        {
            for (int n = 0; n < testArr.length - 1; n++) {
                if (testArr[n] > testArr[n + 1]) {
                    SortingUtilis.swap(testArr, n, n + 1);
                }
            }
            return true;
        }
    public static boolean isSorted(double[] doubleArr)
    {
        for (int n = 0; n < doubleArr.length - 1; n++) {
            if (doubleArr[n] > doubleArr[n + 1]) {
                SortingUtilis.swap(doubleArr, n, n + 1);
            }
        }
        return true;
    }
    public static boolean isSorted(String[] list)
    {
        for (int n = 0; n < list.length - 1; n++) {
            if (0 > list[n+1].compareTo(list[n])) {    //condition to check ascii of strings
                SortingUtilis.swap(list, n, n + 1);
            }
        }
        return true;
    }

// copying arrays--------------------------------------------------
    public static int[] copyArr(int[] testArr)
    {
        int[] copytestArr=new int[10];
        for (int n = 0; n < testArr.length ; n++) {
            copytestArr[n]= testArr[n];
        }
        return copytestArr;
    }
    public static String[] copylist(String[] list)
    {
        String[] copylist=new String[10];
        for (int n = 0; n < list.length ; n++) {
            copylist[n]=list[n];
        }
        return copylist;
    }
    public static double[] copydoubleArr(double[] doubleArr)
    {
        double[] copydoubleArr=new double[10];
        for (int n = 0; n < doubleArr.length ; n++) {
            copydoubleArr[n]= doubleArr[n];
        }
        return copydoubleArr;
    }
    // checking sums-------------------------------------------------------
    public static boolean checkSum(double[] before, double[] after) {
        double beforesum = 0;
        double aftersum = 0;
        for (int b = 0; b < before.length; b++) {
            beforesum = beforesum + before[b];
        }
        for (int a = 0; a < after.length; a++) {
            aftersum = aftersum + after[a];
        }
        if (aftersum == beforesum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean checkSum(int[] before, int[] after) {
        int beforesum = 0;
        int aftersum = 0;
        for (int b = 0; b < before.length; b++) {
            beforesum = beforesum + before[b];
        }
        for (int a = 0; a < after.length; a++) {
            aftersum = aftersum + after[a];
        }
        if (aftersum == beforesum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}
