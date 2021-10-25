package assignment3;

import java.util.Arrays;

//Explanation
// this algorithm's time complexity is O(n) because first for loop runs on O(n) to find number of zeros, ones and twos
// Second for loop runs on O(n) that stores respective numbers of zeros, ones and twos in an array.
// So, overall complexity of this algorithm = O(n) + O(n) = O(n)
public class Problem4ZerosOnesTwos {

    public static void main(String[] args) {
        int[] array = { 1, 0, 2, 0, 1, 0, 1, 2, 1, 0 };
        System.out.println(Arrays.toString(Problem4ZerosOnesTwos.sort(array)));
    }

    public static int[] sort(int array[]){
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] == 0)
                zeroCount++;
            else if(array[i] == 1)
                oneCount++;
            else
                twoCount++;
        }
        int[] sortedArr = new int[array.length];
        for(int i = 0; i < sortedArr.length; i++){
            if(i < zeroCount)
                sortedArr[i] = 0;
            else if(i >= zeroCount && i < zeroCount+oneCount)
                sortedArr[i] = 1;
            else
                sortedArr[i] = 2;
        }
        return sortedArr;
    }

}
