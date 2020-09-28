import java.util.*;

public class Parenthesis {
    
    public static void main(String[] args){
        int n = 3;
        System.out.println(parens(n));
    }

    public static List<String> parens(int n){
        List<String> result = new ArrayList<>();
        buildParens("", 0, 0, n, result);
        return result;
    }

    public static void buildParens(String current, int open, int close, int max, List<String> result){
        if(current.length() == max * 2){
            result.add(current);
            return;
        }
        if(open < max){
            buildParens(current + "(", open + 1, close, max, result);
        }
        if(close < open){
            buildParens(current + ")", open, close + 1, max, result);
        }
    }
}
