import java.util.*;

public class bubblesort {
    public static void bubble_sort_optimised(int arr[]) {
        int swap = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap++;
                }
            }
        }
        if (swap != 0) {
            bubble_sort(arr);
        }
        else{
            System.out.println("array is already sorted! ");
        }
    }

    public static void bubble_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {1,2,67,89,3,4,6,7,8,9 };
        bubble_sort_optimised(arr);
    }
}