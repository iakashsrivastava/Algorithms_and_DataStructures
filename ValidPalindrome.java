//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//
//        For example,
//        "A man, a plan, a canal: Panama" is a palindrome.
//        "race a car" is not a palindrome.

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i=0, l= s.length()-1; i<s.length()/2;i++,l--){
            if(!( s.charAt(i) == s.charAt(l)  ))
                return false;
        }
        return true;
    }

}
