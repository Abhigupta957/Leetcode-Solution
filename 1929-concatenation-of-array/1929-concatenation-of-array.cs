public class Solution {
    public int[] GetConcatenation(int[] nums) {

        int n = nums.Length;
        // create a new Array 
        int [] ans = new int [2*n]; // size = 2*n
        // loop 
        for(int i=0; i<n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}