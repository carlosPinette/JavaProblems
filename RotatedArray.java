public class RotatedArray {
    public static void main(String[] args){
        int[] array1 = {4,5,6,7,0,1,2};
        int target = 3;
        System.out.println(search(array1, target));
    }

    //binary search
    public static int search(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;
        int midIndex;
        int midVal;
        while(start <= end){
            midIndex = start + ((end - start) / 2);
            midVal = nums[midIndex];
            if(midVal == target)
                return midIndex;
            if(midVal >= nums[start]){
                if(target >= nums[start] && target < midVal)
                    end = midIndex - 1;
                else
                    start = midIndex  + 1;
            }else{
                if(target > midVal && target <= nums[end])
                    start = midIndex + 1;
                else
                    end = midIndex - 1;
            }
        }
        return -1;
    }
}
