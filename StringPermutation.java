import java.util.*;

public class StringPermutation {

    public static void main(String[] args){
        String word = "abcde";
        List<String> result = new ArrayList<>();
        getPerms("", word, result);
        System.out.println(result);
    }
    
    public static void getPerms(String pre, String remaining, List<String> result){
        if(remaining.length() == 0){
            result.add(pre);
            return;
        }
        int len = remaining.length();
        for(int i = 0; i < len; i++){
            String before = remaining.substring(0, i);
            String after = remaining.substring(i + 1, len);
            char c = remaining.charAt(i);
            getPerms(pre + c, before + after, result);
        }
    }
}
