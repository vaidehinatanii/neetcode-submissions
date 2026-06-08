class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0; i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
        // Time: O(n) because we traverse the input array once.
        // Space: O(n) because we create an additional array of size 2n.
        
    }
}