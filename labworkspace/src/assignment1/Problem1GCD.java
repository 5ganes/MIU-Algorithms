package assignment1;

public class Problem1GCD {

    public static void main(String[] args) {
        int m = 12;
        int n = 18;
        System.out.println("GCD of " + m + " and " + n + " = " + gcd(12, 18));
    }

    public static int gcd(int m, int n) {
        int gcd = 1;
        int min = m < n ? m : n;
        for (int i = 2; i <= min; i++){
            if(m % i == 0 && n % i == 0)
                gcd = i;
        }
        return gcd;
    }

}
