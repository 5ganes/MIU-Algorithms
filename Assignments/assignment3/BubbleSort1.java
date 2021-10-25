package assignment3;

import java.util.Arrays;

//Explanation
// My solution works because when an array is already sorted, inside first for loop, value of variable alreadySorted
// will be true all the time then block of code inside if condition will not execute for bubble sort.
// So, in best case(array already sorted), this algorithm runs first loop whose time complexity is O(n).

public class BubbleSort1 {
    public static void main(String[] args) {
        int[] array = { 2,15, 7, 11, 20, 5, 12, 2 };
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    public static int[] bubbleSort(int[] arr){
        boolean alreadySorted = true;
        for (int i = 0; i < arr.length-1; i++){ // check whether an array is already sorted
            if(arr[i] > arr[i+1])
                alreadySorted = false;
        }
        if(alreadySorted == false){ // if array is not already sorted, then sort the array using bubble sort.
            for (int i = 0; i < arr.length-1; i++){
                for (int j = 0; j < arr.length-i-1; j++){
                    if(arr[j] > arr[j+1]){ // swap values of two indexes of array without using third variable
                        arr[j] = arr[j] + arr[j+1];
                        arr[j+1] = arr[j] - arr[j+1];
                        arr[j] = arr[j] - arr[j+1];
                    }
                }
            }
        }
        return arr;
    }
}
