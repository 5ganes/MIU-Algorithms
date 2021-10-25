package assignment1;

public class Problem2SubsetSumBruteForce {

    public static void main(String[] args) {
        int[] set = new int[]{2, 7, 4, 6};
        System.out.println(subsetSum(set, set.length, 8));
    }

    public static boolean subsetSum(int set[], int n, int sum){
        // Base Cases
        if (sum == 0)
            return true;
        if (n == 0 && sum != 0)
            return false;

        // induction steps
        if (set[n - 1] > sum)
            return subsetSum(set, n - 1, sum);

        return subsetSum(set, n - 1, sum) || subsetSum(set, n - 1, sum - set[n - 1]);
    }

}
