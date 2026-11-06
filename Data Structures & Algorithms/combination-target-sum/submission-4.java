class Solution {
    // Time	\(O(2^{N+T/M}\cdot T/M)\) loose upper bound
    // Auxiliary space	\(O(N+T/M)\)
    // Output space	\(O(K\cdot T/M)\)
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();
        backTrack(nums, target, currList, 0);
        return res;
    }
    public void backTrack(int[] nums, int target, List<Integer> currList, int i) {
        if (target == 0) {
            res.add(new ArrayList(currList));
            return;
        }
        if (target < 0 || i >= nums.length) {
            return;
        }
        currList.add(nums[i]);
        backTrack(nums, target - nums[i], currList, i);
        currList.remove(currList.size() - 1);
        backTrack(nums, target, currList, i + 1);
    }
}
