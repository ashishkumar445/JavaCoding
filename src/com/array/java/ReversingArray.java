package com.array.java;

public class ReversingArray {
    public static void main(String[]args)
    {
        int[] arr = new int[]{1,2,3,4,5,8};
        System.out.print("Reverse array is ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
