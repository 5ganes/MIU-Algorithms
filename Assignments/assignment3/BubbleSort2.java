package assignment3;

import java.util.Arrays;

public class BubbleSort2 {

    public static void main(String[] args) {
        int[] array = { 2,15, 7, 11, 20, 5, 12, 2 };
        System.out.println(Arrays.toString(BubbleSort2.bubbleSort(array)));
    }

    public static int[] bubbleSort(int array[]){
        boolean swappedOnPrevRun = true;
        int len = array.length;
        int j = 1;
        while(swappedOnPrevRun){
            swappedOnPrevRun = false;
            for(int i = 0; i < len-j; i++)	{
                if(array[i] > array[i + 1])	{
                    swappedOnPrevRun = true;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            j++;
        }
        return array;
    }

}
