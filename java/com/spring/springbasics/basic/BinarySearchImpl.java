package com.spring.springbasics.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;


    public int binarySearch(int[] numbers, int numberToSearchFor){
        // Sorted array
        // Search the array
        // Return the result
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    }


}
