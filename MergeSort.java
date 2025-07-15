// Divide-and-conquer algorithm that recursively splits the array and merges sorted halves.

import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int array[], int si, int ei) {
        if (si >= ei) 
            return;

        int mid = si + (ei-si) / 2;  //(si+ei) / 2
        mergeSort(array, si, mid);
        mergeSort(array, mid+1, ei);
        merge(array, si, mid, ei);
    }

    public static void merge(int array[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si;
        int j= mid+1;
        int k=0;

        while(i<=mid && j<=ei) {
            if(array[i] <= array[j]) {
                temp[k++] = array[i++];
            }else{
                temp[k++] = array[j++];
            }
        }
        while(i <= mid) 
            temp[k++] = array[i++];
        while(j <= ei)
            temp[k++] = array[j++];

        for(k=0, i=si; k<temp.length; k++, i++)
            array[i] = temp[k];
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

        mergeSort(array, 0, n-1);

        System.out.println("Sorted array: ");
        for(int i=0; i<n; i++) {
            System.err.println(array[i]);
        }
    }
}

/*
 Time Complexity:
 Best case = Average case = Worst case = O(n logn)

 Space Complexity: O(n)
 */
