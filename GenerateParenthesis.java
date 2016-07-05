//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//
//        For example, given n = 3, a solution set is:
//
//        [
//        "((()))",
//        "(()())",
//        "(())()",
//        "()(())",
//        "()()()"
//        ]

public class GenerateParenthesis {

    List<String> list = new ArrayList<>();

    public List<String> generateParenthesis(int n) {

        addString("(",1,0,1,n);
        return list;

    }

    public void addString(String str,int open,int close, int depth, int n){
        //if(depth > 2*n || close > open)
        if(close > open)
            return;

        if(depth == 2*n){
            if(open == close)
                list.add(str);
            return;
        }
        //else {
        addString(str+"(", open + 1, close, depth+1, n);
        addString(str+")", open, close +1, depth+1, n);
        //}
    }

}
