//Large element come to the end of the array by swapping with adjacent elements

import java.util.Scanner;

class BubbleSort {

    public static void bubbleSort(int array[]){
        for (int i=0; i<array.length-1; i++) {
            boolean swap = false;
            for (int j=0; j<array.length-i-1; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap = true;
                }
            }
            if (!swap)
                break;
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

        bubbleSort(array);
    }
}

/*
Time complexity:
Best case: O(n)
Average case: O(n^2)
Worst case: O(n^2)

Space complexity: O(1)
*/