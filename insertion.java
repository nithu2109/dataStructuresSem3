package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class insertion {
    public static void insertionSort(int[] array) {
        for(int i=1;i< array.length;i++){
            int key=array[i];
            int j=i-1;
            while(j>=0 && array[j]>key){
                array[j+1]=array[j];
                j=j-1;
            };
            array[j+1]=key;
        }
    }

    public static void main(String[] args) {
        System.out.println("----------Insertion Sort------------");
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        n=sc.nextInt();
        int[] array= new int[n];
        System.out.println("Enter "+n+" elements for your array: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array Before Sorting : "+ Arrays.toString(array));
        insertionSort(array);
        System.out.println("Array After Sorting :"+Arrays.toString(array));

    }


}
