package com.udemy.sortings;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = new Random().ints(15, -100, 100).toArray();
        System.out.println(Arrays.toString(intArray));
        int[] sortedArray = getSortArray(intArray, 0 , intArray.length - 1, intArray.length);
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] getSortArray(int[] intArray, int indexStart, int indexEnd, int length) {
        if (length != 1) {
            int middle = (indexStart + indexEnd) / 2;
            int newLength = length / 2;
            return merge(
                    getSortArray(intArray, indexStart, middle, length % 2 != 0 ? newLength + 1 : newLength),
                    getSortArray(intArray, middle + 1, indexEnd, newLength));
        } else {
            return new int[]{intArray[indexStart]};
        }
    }

    private static int[] merge(int[] arrayLeft, int[] arrayRight) {
        int[] mergedArray = new int[arrayLeft.length + arrayRight.length];
        for (int i = 0, j = 0, k = 0; k < mergedArray.length; k++) {
            if (j == arrayRight.length) {
                mergedArray[k] = arrayLeft[i];
                i++;
                continue;
            }
            if (i == arrayLeft.length) {
                mergedArray[k] = arrayRight[j];
                j++;
                continue;
            }
            if (arrayLeft[i] > arrayRight[j]) {
                mergedArray[k] = arrayRight[j];
                j++;
            } else {
                mergedArray[k] = arrayLeft[i];
                i++;
            }
        }
        return mergedArray;
    }
}
