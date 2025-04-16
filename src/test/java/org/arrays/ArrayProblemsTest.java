package org.arrays;

import java.util.Arrays;

/**
 * @author PenchalaSai.Kosuru
 *
 * Test class for ArrayProblems.
 * Each method is tested with sample inputs and outputs are printed for verification.
 */
public class ArrayProblemsTest {
    public static void main(String[] args) {
        ArrayProblems arrayProblems = new ArrayProblems();

        // ✅ Test 1: Check if array is sorted
        int[] sortedArr = {1, 2, 3, 4, 5};
        int[] unsortedArr = {1, 3, 2, 4};
        System.out.println("Is sortedArr sorted? " + arrayProblems.isSorted(sortedArr));  // true
        System.out.println("Is unsortedArr sorted? " + arrayProblems.isSorted(unsortedArr));  // false

        // ✅ Test 2: Check for duplicate digits
        int[] arrWithDuplicates = {1, 2, 3, 4, 2};
        int[] arrWithoutDuplicates = {1, 2, 3, 4, 5};
        System.out.println("Has duplicates? " + arrayProblems.isDuplicateDigits(arrWithDuplicates));  // true
        System.out.println("Has duplicates? " + arrayProblems.isDuplicateDigits(arrWithoutDuplicates));  // false

        // ✅ Test 3: Two sum (Brute force)
        int[] numsForTwoSum = {2, 7, 11, 15};
        int target = 9;
        int[] result = arrayProblems.twoSumBruteForce(numsForTwoSum, target);
        System.out.println("Two Sum Brute Force (target = 9): " + Arrays.toString(result));  // [0, 1]

        // ✅ Test 4: Move zeros to the end
        int[] numsWithZeros = {0, 1, 0, 3, 12};
        System.out.print("Before moving zeros: " + Arrays.toString(numsWithZeros) + " -> ");
        arrayProblems.moveZeros(numsWithZeros);  // Output printed inside method

        // ✅ Test 5: Unique length using HashMap
        int[] duplicateArray = {1, 2, 2, 3, 4, 4, 5};
        int uniqueLength = arrayProblems.uniqueLengthArray(duplicateArray);
        System.out.println("Unique Length using HashMap: " + uniqueLength);  // Expected: 5

        // ✅ Test 6: Unique length using HashSet
        int uniqueLengthSet = arrayProblems.uniqueLengthArrayHashSet(duplicateArray);
        System.out.println("Unique Length using HashSet: " + uniqueLengthSet);  // Expected: 5

        // ✅ Test 7: Unique length using sorting and two-pointers
        int[] unsortedWithDuplicates = {4, 1, 2, 2, 3, 1};
        int uniqueLengthTwoPointers = arrayProblems.uniqueLengthArraySortingTwoPointers(unsortedWithDuplicates);
        System.out.println("Unique Length using Sorting & Two Pointers: " + uniqueLengthTwoPointers);  // Expected: 4
    }
}

/**
 * Expected Output:
 *
 * Is sortedArr sorted? true
 * Is unsortedArr sorted? false
 * Has duplicates? true
 * Has duplicates? false
 * Two Sum Brute Force (target = 9): [0, 1]
 * Before moving zeros: [0, 1, 0, 3, 12] -> nums = [1, 0, 3, 0, 12]
 * Unique Length using HashMap: 5
 * Unique Length using HashSet: 5
 * Unique Length using Sorting & Two Pointers: 4
 */