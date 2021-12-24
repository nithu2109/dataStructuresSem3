package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {

    public static void bubbleSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j< array.length-i-1;j++){
                if (array[j] > array[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("-------Bubble Sort-------");
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        n=sc.nextInt();
        int[] array= new int[n];
        System.out.println("Enter "+n+" elements for your array: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array Before Sorting : "+Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Array After Sorting :"+Arrays.toString(array));
    }
}
