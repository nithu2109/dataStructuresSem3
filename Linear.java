package com.searching;

import java.util.Arrays;
import java.util.Scanner;

public class Linear {
    public static void linear_search(int[] array, int search_ele) {
        int top=-1;
        for(int i=0;i< array.length;i++){
            if(array[i]==search_ele){
                top=0;
                System.out.println("Element Found at position : "+i);
            }
        }
        if(top==-1){
            System.out.println("Element Not Found");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        n=sc.nextInt();
        int[] array= new int[n];
        System.out.println("Enter "+n+" elements for your array: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Enter an element for searching :");
        int search_ele=sc.nextInt();
        linear_search(array,search_ele);

    }


}

