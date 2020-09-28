public class Magicindex {
    public static void main(String[] args){
        
    }

    public static int findIndex(int[] array){
        for(int i = 0; i < array.length; i++){
            if(i == array[i])
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int start, int end){
        int midIndex = start + ((end - start) / 2);
        int midVal = array[midIndex];
        if(midIndex == midVal)
            return midVal;
        int leftIndex = Math.min(midVal, midIndex - 1);
        int left = binarySearch(array, start, leftIndex);
        if(left >= 0)
            return left;
        int rightIndex = Math.max(midVal, midIndex + 1);
        return binarySearch(array, rightIndex, end);
    }
}
