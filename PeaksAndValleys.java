
public class PeaksAndValleys {
    
    public static void main(String[] args){
        int[] array = {1,64,6,2,1,7,9};
        sortPeakValley(array);
        for(int n : array){
            System.out.print(n + " ");
        }
    }

    public static void sortPeakValley(int[] array){
        for(int i = 1; i < array.length; i++){
            int bigIndex = bigger(array, i - 1, i, i + 1);
            if(bigIndex != i)
                swap(array, i, bigIndex);
        }
    }

     public static void swap(int[] array, int a, int b){
         int aux = array[a];
         array[a] = array[b];
         array[b] = aux;
     }

    public static int bigger(int[] array, int a, int b, int c){
        int len = array.length;
        int aVal = a >= 0 && a < len ? array[a] : Integer.MIN_VALUE;
        int bVal = b >= 0 && b < len ? array[b] : Integer.MIN_VALUE;
        int cVal = c >= 0 && c < len ? array[c] : Integer.MIN_VALUE;
        int max = Math.max(aVal, Math.max(bVal, cVal));
        if(max == aVal)
            return a;
        else if(max == bVal)
            return b;
        else
            return c;
    }
}
