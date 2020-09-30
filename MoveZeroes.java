
public class MoveZeroes {

/**
 * Have a pointer starting at 0
 * Iterate the array
 *      if item is diff from 0 -> swap with pointer and pointer++
 * So all that are diff from 0 will be allocated in order from the pointer
 * 
 * Time Complexity
 * O(n) ----> n = length of the array
 * 
 * Space Complexity
 * O(1) ----> constant
 */

    public static void main(String[] args){
        int[] array = {1,0,54,5,0,6};
        moveZeroes(array);
        for(int n : array)
            System.out.print(n);
    }

    public static void moveZeroes(int[] array){
        if(array == null || array.length == 1)
            return;
        int zeroIndex = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != 0)
                swap(array, i, zeroIndex++);
        }
    }

    public static void swap(int[] array, int a, int b){
        int aux = array[a];
        array[a] = array[b];
        array[b] = aux;
    }
}
