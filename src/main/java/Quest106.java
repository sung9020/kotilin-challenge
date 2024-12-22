import java.util.Arrays;

/*
 *
 * @author snow
 * @since 2024/07/20
 */
public class Quest106 {
    public static void main(String[] args) {

        System.out.println(pivotIndex(new int[]{1,2,3}));
    }

    public static int pivotIndex(int[] nums) {

        int[] prefixSum = new int[nums.length];
        int[] reverseSum = new int[nums.length];
        int acc = 0;

        // 누적합을 미리 구해놓음.
        for(int j = 0; j < nums.length; j++){
            acc += nums[j];
            prefixSum[j] = acc;
        }

        acc = 0;
        for(int i = nums.length - 1; i >= 0; i--){
            acc += nums[i];
            reverseSum[i] = acc;
        }

        int pivot = -1;
        for(int i = 0; i < nums.length; i++){

            // prefix(pivot - 1) reverse( pivot + 1 )
            int left = i == 0 ? 0 : prefixSum[i - 1];
            int right = i == nums.length - 1 ? 0 : reverseSum[i +1];
            if(left == right){
                pivot = i;
                break;
            }
        }

        return pivot;
    }
}
