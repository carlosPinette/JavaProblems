
public class ConsecutiveOnes {
    public static void main(String[] args){
        int[] array = {1,0,1,1,0};
        System.out.println(maxConsecutiveOnes(array));
    }

    public static int maxConsecutiveOnes(int[] array){
        int zeroCount = 0;
        int oneCount = 0;
        int max = 0;
        for(int n : array){
            if(n == 1){
                zeroCount++;
                oneCount++;
            }else{
                oneCount = zeroCount + 1;
                zeroCount = 0;
            }
            max = Math.max(max, oneCount);
        }
        return max;
    }
}
