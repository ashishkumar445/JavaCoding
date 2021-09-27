package com.array.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateArrayTest {
public static void main(String[]args)
{
    DuplicateArray d=new DuplicateArray();
    int arr[]= {4,3,3,5,6};
    int result=d.getDuplicateintArray(arr);
    System.out.println(result);
}
}