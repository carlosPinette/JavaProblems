import java.util.*;

public class DissapearedNums {
    public static void main(String[] args){
        int[] array = {4,3,2,7,8,2,3,1};
        System.out.println(findNums(array));
    }
    
    public static List<Integer> findNums(int[] array){
        for(int i = 0; i < array.length; i++){
            int newIndex = Math.abs(array[i]) - 1;
            if(array[newIndex] > 0)
                array[newIndex] *= -1;
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i <= array.length; i++){
            if(array[i - 1] > 0)
                result.add(i);
        } 
        return result;
    }
}
