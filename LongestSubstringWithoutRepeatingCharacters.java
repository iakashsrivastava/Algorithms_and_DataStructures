//Given a string, find the length of the longest substring without repeating characters.
//
//        Examples:
//
//        Given "abcabcbb", the answer is "abc", which the length is 3.
//
//        Given "bbbbb", the answer is "b", with the length of 1.
//
//        Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        int max =0;
        int sub =0;
        for(int i=0; i< s.length();i++){
            if (hm.containsKey(s.charAt(i)))
                sub = Math.max(sub, hm.get(s.charAt(i))+1);
            hm.put(s.charAt(i), i);
            max = Math.max(max, i-sub+1);
        }
        return max;
    }
}
