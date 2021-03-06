package MinimumMovesToEqualElements_453;

/**
 * Given a non-empty integer array of size n,
 * find the minimum number of moves required to make all array elements equal,
 * where a move is incrementing n - 1 elements by 1.
 *
 * Example:
 * Input:
 * [1,2,3]
 * Output:
 * 3
 *
 * Explanation:
 * Only three moves are needed (remember each move increments two elements):
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 */
public class Solution {
    // adding n-1 elements 1 is equals to minus one element 1.
    // so minus 1 element of one every time until all elements are the same.
    public int minMoves(int[] nums) {
        if(nums.length==1) return 0;
        int min = nums[0],rs = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>min) rs += nums[i]-min;
            else{
                rs += (min-nums[i])*i;
                min = nums[i];
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minMoves(new int[]{-100,0,100}));
    }
}
