import java.util.*;

public class RemoveDupGreaterK {
    /**
     * 
     * An array with several duplicated items, remove if dup > K
     * 
     * Input: 1,2,2,2,3,3,4,5,5,5,5 and K=1
     * 
     * Iterate through the array, by checking the current item and previous
     * Have a count to keep track of how many repeated items
     * 2 cases: previous and current are equals or they are different
     * 1. Different: check if previous counter was <= than k -> add then reset count
     * 2. Same: if count <= k -> add and then increment count
     * After the for iteration -> check if the count is <= than k and print if it is
     * return list
     * 
     * Time Complexity
     * O(n) -----> n = length of the array
     * 
     * Space Complexity
     * O(1) -----> if result not taken in consideration
     * 
     */

    public static void main(String[] args){
        int[] array = {1,2,2,2,3,3,4,5,5,5,5,6,6};
        int k = 1;
        System.out.println(removeDupK(array, k));
    }

    public static List<Integer> removeDupK(int[] array, int k){
        if(array  == null)
            return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        if(array.length == 1){
            result.add(array[0]);
            return result;
        }
        int count = 0;
        for(int i = 1; i <= array.length; i++) {
            if(i == array.length || array[i-1] != array[i]) {
                if(count <= k){
                    result.add(array[i-1]);
                }
                count = 0;
            } else {
                if(count <= k){
                    result.add(array[i-k]);
                }
                count++;
            }
        }
        return result;
    }

    public static List<Integer> removeKDuplicates(int[] array, int k){
        if(array == null || array.length < 2)
            return new ArrayList<>();
        int count = 0;
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i < array.length; i++){
            if(array[i] != array[i-1]){
                if(count <= k)
                    result.add(array[i-1]);
                count = 0;
            }else{
                if(count <= k)
                    result.add(array[i]);
                count++;
            }
        }
        if(count <= k)
            result.add(array[array.length - 1]);
        return result;
    }
    
}
