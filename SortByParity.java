public class SortByParity {
    public static void main(String[] args){
        int[] array = {13,12,14,7,41,6,4};
        sortParity(array);
        for(int n : array)
            System.out.print(n + " ");
    }

    public static void sortParity(int[] array){
        int start = 0;
        int end = array.length - 1;
        while(start < end){
            if(array[start] % 2 > array[end] % 2){
                swap(array, start, end);
            }
            if(array[start] % 2 == 0)
                start++;
            if(array[end] % 2 == 1)
                end--;
        }
    }

    public static void swap(int[] array, int a, int b){
        int aux = array[a];
        array[a] = array[b];
        array[b] = aux;
    }
}
