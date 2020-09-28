import java.util.*;

public class GroupAnagrams {
    

    public static List<List<String>> groupAnagrams(String[] words){
        Map<String, List<String>> map = new HashMap<>();
        for(String word : words){
            int[] array = new int[26];
            for(char c : word.toCharArray())
                array[c - 'a']++;
            StringBuilder sb = new StringBuilder();
            for(int n : array)
                sb.append(n + "-");
            if(!map.containsKey(sb.toString()))
                map.put(sb.toString(), new ArrayList<>());
            map.get(sb.toString()).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
