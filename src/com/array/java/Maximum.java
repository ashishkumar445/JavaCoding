package com.array.java;

public class Maximum {
    /**
     *
     * @param inputArray The array for which the maximum value needs to be found
     * @return The Maximum value in the array
     */
    int getMaxintArray(int[] inputArray) {
        int max = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (max < inputArray[i]) {
                max = inputArray[i];

            }

        }
        return max;
    }

}

