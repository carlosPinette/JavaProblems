import java.util.*;

class Main{
    public static void main(String[] args){
        int n = 3;
        System.out.println(generateParentheses(n));
    }

    public static List<String> generateParentheses(int n){
        if(n == 0)
            return new ArrayList<>();
        List<String> result = new ArrayList<>();
        generate("", 0, 0, n, result);
        return result;
    }

    public static void generate(String current, int open, int close, int max, List<String> result){
        if(current.length() == max * 2){
            result.add(current);
            return;
        }
        if(open < max)
            generate(current + "(", open + 1, close, max, result);
        if(close < open)
            generate(current + ")", open, close + 1, max, result);
    }
}