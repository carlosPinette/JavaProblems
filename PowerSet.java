import java.util.*;

public class PowerSet {

    public static void main(String[] args){

    }

    public static List<List<Integer>> getSubset(int[] array, int index){
        List<List<Integer>> all;
        if(index == array.length){
            all = new ArrayList<>();
            all.add(new ArrayList<>());
        }else{
            all = getSubset(array, index + 1);
            List<List<Integer>> more = new ArrayList<>();
            int item = array[index];
            for(List<Integer> sub : all){
                List<Integer> subset = new ArrayList<>();
                subset.addAll(sub);
                subset.add(item);
                more.add(subset);
            }
            all.addAll(more);
        }
        return all;
    }
    
}
