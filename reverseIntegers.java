//Reverse digits of an integer.
//
//        Example1: x = 123, return 321
//        Example2: x = -123, return -321
public class reverseIntegers {

    public int reverse(int x) {
        boolean flag=true;
        long rev=0;

        if(x<0)
            flag = true;

        while(x != 0){
            rev = rev*10;
            rev += x%10;
            x/=10;
        }

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            return 0;

        if(flag)
            return (int)rev;
        else
            return (int)rev*-1;

    }


}
