class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

//Time and space complexity is O(n)
        //Store the product of everything of the current index
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int postFix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= postFix;
            postFix = nums[i] * postFix;
        }
        return res;
    }
}
