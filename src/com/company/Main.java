package com.company;

public class Main {

    public static void main(String[] args) {
        int[] testArr = SortingUtilis.randomIntArr(10);

        System.out.print("Before: ");
        for (int num : testArr)
            System.out.print(num + " ");
        System.out.println();

        long time = System.nanoTime();
        Sort.insertionSort(testArr);
        time = System.nanoTime() - time;

        System.out.print("After: ");
        for (int num : testArr)
            System.out.print(num + " ");
        System.out.println();
        System.out.println("Time taken: " + time);

        if(SortingUtilis.isSorted(testArr)){
            System.out.println("Your list is sorted");
        }
        else System.out.println("Your list is not sorted.");
    }
    }



