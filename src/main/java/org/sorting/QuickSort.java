package org.sorting;

/**
 * @author PenchalaSai.Kosuru
 * @date 4/15/2025
 *
 * Quick sort implementation provided in CLRS book and slides from MIT OCW presented by L
 */

public class QuickSort {

    //Input Array with starting and ending indexes
    public static void quickSort(int[] A, int p, int q) {
        if (p < q) {
            int pivotIndex = partition(A, p, q);
            quickSort(A, p, pivotIndex - 1);
            quickSort(A, pivotIndex + 1, q);
        }
    }

    public static int partition(int[] A, int p, int q) {
        int pivot = A[p]; //Choosing Pivot as a first element in the array
        int i = p;

        for (int j = p + 1; j <= q; j++) {
            if (A[j] <= pivot) {
                i++;
                swap(A, i, j);
            }
        }

        swap(A, p, i);  // Place pivot in the correct position
        return i;
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        int[] A = {5, 3, 8, 4, 2, 7, 1, 0, 1};
        quickSort(A, 0, A.length - 1);

        System.out.print("Sorted array: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}

