package com.array.java;
public class DuplicateArray {
    /**
     *
     * @param inputArray The array for which the duplicate number needs to be found
     * @return The duplicate number in the array
     */
    int getDuplicateintArray(int[] inputArray) {
        int duplicate = inputArray[0];
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]);

            }
        }
        return duplicate;
    }
    }