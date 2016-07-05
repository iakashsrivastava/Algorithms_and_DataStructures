//Determine whether an integer is a palindrome. Do this without extra space.
public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        int y =x;
        int nx=0;
        int factor =10;
        while(y!=0){
            nx= nx*factor + y%10;

            y=y/10;
        }
        if(nx == Math.abs(x))
            return true;
        return false;

    }

}
