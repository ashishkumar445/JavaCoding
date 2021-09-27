package com.array.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReversingArrayTest {
    public static void main(String[]args){
        ReversingArray r=new ReversingArray();
        int[]rev=new int[]{4,5,7,7,8};
        int result=r.getrevintArray(rev);
        System.out.println(rev[result]);
    }
}
