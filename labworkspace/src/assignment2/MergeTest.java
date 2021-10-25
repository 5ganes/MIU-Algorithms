package assignment2;

import java.util.Arrays;

public class MergeTest {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1, 4, 5, 8, 17}, new int[]{2, 4, 8, 11, 13, 21, 23, 25})));
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] resArr = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j])
                resArr[k++] = arr1[i++];
            else
                resArr[k++] = arr2[j++];
        }
        while (i < arr1.length)
            resArr[k++] = arr1[i++];
        while (j < arr2.length)
            resArr[k++] = arr2[j++];
        return resArr;
    }

}
