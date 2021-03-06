package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String x : array) {
            if (x.equals(value)) {return true;}
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        for (int i = 0; i < array.length/2; i++) {
            String x = array[i];
            array[i] = array[array.length - 1 -i];
            array[array.length - 1 - i] = x;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean isPalindromic = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(array[array.length-1-i])) {
                isPalindromic = true;
            }
        }
        return isPalindromic;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean isPangramic = false;
        int i = 0;
        String [] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
        String combinedString = String.join("", array).replaceAll("\\s+","").toLowerCase();
        for (String s: alphabet
        ) {
            if (combinedString.contains(s)) {
                i++;
            }
        }
        if (i == 26) {
            isPangramic = true;
        }
        return isPangramic;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (String s:array
             ) {
            if (s.equals(value)) {
                counter++;
            }
        }
        return counter;
    }
    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String output = "";
        int i = 0;
        for (String s : array
             ) {
            if (!s.equals(valueToRemove)) {
                output += s + " ";
                i++;
            }
        }
        String [] arr = output.split(" ");
        return arr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String output = "";

        for (int i = 0; i < array.length -1 ; i++) {
            if (!array[i].equals(array[i+1])) {
                output += array[i] + " ";
            }
        }
        output += array[array.length - 1];
        String [] arr = output.split(" ");

        return arr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        String output = "";

        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[i-1])) {
                output += array[i-1];
            }
            else {
                output += array [i-1] + " ";
            }

        }
        output += array[array.length - 1];
        String [] arr = output.split(" ");
        return arr;


    }


}
