package com.array.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumTest {

  public static void main(String[] args){
      Maximum m=new Maximum();
      int arr[]={3,5,4};
     int result= m.getMaxintArray(arr);
     System.out.println(result);
  }
}