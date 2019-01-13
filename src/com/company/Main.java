package com.company;

public class Main {

    public static void main(String[] args) {
        int[] testArr = SortingUtilis.randomIntArr(10);
        String[] list = SortingUtilis.randomStringArr(10, 3);
        double[] doubleArr = SortingUtilis.randomdoubleArr(10);
        //int array check
        System.out.print("Before: ");
        for (int num : testArr)
            System.out.print(num + " ");
        System.out.println();

        long time = System.nanoTime();
        int[] beforeint= SortingUtilis.copyArr(testArr);
        Sort.insertionSort(testArr);

        time = System.nanoTime() - time;

        System.out.print("After: ");
        for (int num : testArr)
            System.out.print(num + " ");
        System.out.println();
        System.out.println("Time taken: " + time);

        if (SortingUtilis.isSorted(testArr)) {
            System.out.println("Your list is sorted");
        } else
            {
            System.out.println("Your list is not sorted.");
        }
        System.out.println("Is the sum same before and after:"+SortingUtilis.checkSum(beforeint,testArr));
        // double array check
        for (double num : doubleArr)
            System.out.print(num + " ");
        System.out.println();

        long time2 = System.nanoTime();

        double[] beforedouble= SortingUtilis.copydoubleArr(doubleArr);
        Sort.SelectionSort(doubleArr);

        time2 = System.nanoTime() - time2;
        for (double num : doubleArr)
            System.out.print(num + " ");
        System.out.println();
        System.out.println("Time taken: " + time2);

        if (SortingUtilis.isSorted(doubleArr)) {
            System.out.println("Your list is sorted");
        } else
        {
            System.out.println("Your list is not sorted.");
        }
        System.out.println("Is the sum same before and after:"+SortingUtilis.checkSum(beforedouble,doubleArr));
        // string array check
        for (String num : list)
            System.out.print(num + " ");
        System.out.println();

        long time3 = System.nanoTime();


        Sort.bubbleSort(list);
        time3 = System.nanoTime() - time3;
        for (String num : list)
            System.out.print(num + " ");
        System.out.println();
        System.out.println("Time taken: " + time3);

        if (SortingUtilis.isSorted(list)) {
            System.out.println("Your list is sorted");
        } else
        {
            System.out.println("Your list is not sorted.");
        }

    }
}


