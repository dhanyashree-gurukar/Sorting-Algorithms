// Picks an element and place in the right position in sorted part

import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int array[]) {
        for(int i=1; i<=array.length-1; i++) {
            int currentValue = array[i];
            int previous = i-1;
            while(previous >= 0 && array[previous] > currentValue) {
                array[previous+1] = array[previous];
                previous--;
            }
            array[previous+1] = currentValue;
        }
        System.out.println("Sorted array: ");
        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
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

        insertionSort(array);
    }
}

/*
  Time Complexity:
  Best case: O(n)
  Average case: O(n^2)
  Worst case: O(n^2)

  Space Complexity: O(1)
 */