package com.array.java;
import java.util.Scanner;

public class MaxNo {
    public static void main(String[] args) {
        int no[],size,max;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter no of array");
        size = r.nextInt();
        no = new int[size];
        System.out.println("enter element of array");
        for (int i = 0; i < no.length; i++) {
            no[i] = r.nextInt();
        }
        max=no[0];
        for (int i = 1; i < no.length; i++)
        {
            if (max<no[i])
            {
                max=no[i];
            }

        }

        System.out.println("maximum no is " +max);

    }
}
