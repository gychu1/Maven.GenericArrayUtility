package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<SomeType>  {

    public SomeType[] inputArray;

    public ArrayUtility(SomeType[] array) {
        this.inputArray = array;
    }

    public Integer countDuplicatesInMerge(SomeType[] arrayToMerge, SomeType valueToEvaluate) {
        ArrayList<SomeType> list = new ArrayList<>(Arrays.asList(inputArray));
        list.addAll(Arrays.asList(arrayToMerge));

        Integer count = 0;
        for (SomeType value : list) {
            if (value.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }

    public SomeType getMostCommonFromMerge(SomeType[] arrayToMerge){
        ArrayList<SomeType> list = new ArrayList<>(Arrays.asList(inputArray));
        list.addAll(Arrays.asList(arrayToMerge));

        SomeType mostCommonValue = null;
        int counter = 0;

        for (int i = 0; i < list.size(); i++) {
            int tempCounter = 0;
            SomeType tempMostCommonValue = list.get(i);
            for (SomeType someType : list) {
                if (list.get(i) == someType) {
                    tempCounter++;
                }
            }
            if (tempCounter > counter){
                counter = tempCounter;
                mostCommonValue = tempMostCommonValue;
            }
        }
        return mostCommonValue;
    }

    public Integer getNumberOfOccurrences( SomeType valueToEvaluate){
        ArrayList<SomeType> list = new ArrayList<>(Arrays.asList(inputArray));

        Integer count = 0;
        for (SomeType value : list) {
            if (value.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }

    public SomeType[] removeValue( SomeType valueToRemove){
        ArrayList<SomeType> list = new ArrayList<>(Arrays.asList(inputArray));

        for (int i = 0; i < list.size(); i++){
            if (valueToRemove.equals(list.get(i))) {
                list.remove(list.get(i));
            }
        }
        SomeType[] newArray = Arrays.copyOf(inputArray, list.size());

        for(int i = 0; i < list.size(); i++) {
            newArray[i] = list.get(i);
        }
        return newArray;
    }
}
