package com.searching;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
     int n;
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter size of array: ");
     n=sc.nextInt();
     int[] array=new int[n];
      System.out.println("Enter "+n+" elements for your array: ");
      for(int i=0;i< array.length;i++){
          array[i]=sc.nextInt();
      }
        System.out.println(Arrays.toString(array));
        System.out.println("Enter element for searching : ");
        int x=sc.nextInt();
        int result=binary_search(array,0,array.length-1,x);
        if(result==-1){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println("Element Found At Position "+ result);
        }

    }

    public static int binary_search(int[] array, int left, int right, int x) {

        if(right>=left){
            int mid=left+(right-left)/2;
            if(array[mid]==x){
                return mid;
            }
            if(array[mid]>x){
                return binary_search(array,left,mid-1,x);
            }
            return binary_search(array,mid+1,right,x);
        }
        return -1;
    }
}
