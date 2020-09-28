
public class MoveZeroes {
    public static void main(String[] args){
        int[] array = {1,0,54,5,0,6};
        moveZeroes(array);
        for(int n : array)
            System.out.print(n);
    }

    public static void moveZeroes(int[] array){
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
