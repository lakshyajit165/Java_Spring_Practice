package com.spring.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm bubbleSortAlgorithm;


    public int binarySearch(int[] numbers, int numberToSearchFor){
        // Sorted array
        // Search the array
        // Return the result
        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        System.out.println(bubbleSortAlgorithm);
        return 3;
    }


}
