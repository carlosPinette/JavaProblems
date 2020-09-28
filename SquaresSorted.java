public class SquaresSorted {
    public static void main(String[] args){
        int[] array = {-7,-3,2,3,11};
        int[] result = sortedSquares(array);
        for(int n : result)
            System.out.print(n + " ");
    }
    
    public static int[] sortedSquares(int[] array){
        int pos = 0;
        while(pos < array.length && array[pos] < 0)
            pos++;
        int neg = pos - 1;
        int[] result = new int[array.length];
        int index = 0;
        while(pos < array.length && neg >= 0){
            if((array[neg] * array[neg]) > array[pos] * array[pos]){
                result[index++] = array[pos] * array[pos++];
            }else{
                result[index++] = array[neg] * array[neg--];
            }
        }
        while(pos < array.length){
            result[index++] = array[pos] * array[pos++];
        }
        while(neg >= 0){
            result[index++] = array[neg] * array[neg];
        }
        return result;
    }
}
