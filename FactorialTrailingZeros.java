//Given an integer n, return the number of trailing zeroes in n!.
//
//        Note: Your solution should be in logarithmic time complexity.
public class FactorialTrailingZeros {

    public int trailingZeroes(int n) {
        int zeros=0;
        while(n/5>0){
            zeros += n/5;
            n = n/5;
        }

        return zeros;
    }

}
