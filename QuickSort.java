// Quick Sort is a divide-and-conquer sorting algorithm that recursively partitions the array around a pivot element, placing smaller elements to the left and larger to the right.

import java.util.Scanner;

public class QuickSort {

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei)
            return;

        int partitionIndex = partition(arr, si, ei);
        quickSort(arr, si, partitionIndex-1);
        quickSort(arr, partitionIndex+1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si; j<ei; j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total number of elements: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the elements to be sorted: ");
        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }

        quickSort(array, 0, n-1);

        System.out.println("Sorted array: ");
        for(int i=0; i<n; i++) {
            System.out.println(array[i]);
        }
    }
    
}

/*
 Time Complexity:
 Best case: O(n logn)
 Average case: O(n logn)
 Worst case: O(n^2)

 Space Complexity: Quick sort is an inplace algorithm but space complexity here is due to call stacks
 Best/Average case: O(log n)
 Worst case: O(n)
 */