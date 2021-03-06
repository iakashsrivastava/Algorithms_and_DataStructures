//Given two strings s and t, write a function to determine if t is an anagram of s.
//
//        For example,
//        s = "anagram", t = "nagaram", return true.
//        s = "rat", t = "car", return false.
//
//        Note:
//        You may assume the string contains only lowercase alphabets.

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length() || s == null || t == null)
            return false;

        int alphabets[] = new int[26];

        for(int i=0; i<s.length(); i++){
            alphabets[ s.charAt(i) - 'a' ] +=1;
            alphabets[ t.charAt(i) - 'a' ] -=1;
        }

        for(int i=0; i<26;i++)
            if(alphabets[i] > 0)
                return false;

        return true;

    }
}
