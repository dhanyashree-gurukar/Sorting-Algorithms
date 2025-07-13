// Pick the smallest element and puts it at the beginning

import java.util.Scanner;

class SelectionSort {

    public static void selectionSort(int array[]) {
        for(int i=0; i<array.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j<array.length; j++) {
                if(array[minPos] > array[j])
                    minPos = j;
            }
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
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

        selectionSort(array);
    }
}

/*
  Time complexity:
  Best case = Average case = Worst case: O(n^2)
  
  Space complexity: O(1)
 */