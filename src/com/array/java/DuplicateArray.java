package com.array.java;

public class DuplicateArray {
    public static void main(String[]args)
    {
        int[]a={2,3,5,3,7,6};
        System.out.println("False");
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if (a[i]==a[j])
                {
                    System.out.println(a[j]+" ");
                }
            }
        }
    }
}
