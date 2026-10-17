class Solution {
    //Time complexity O(n)
//Space complexity O(n) , because in the worst case set can store all unique elements
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums); // O(n log n)
        Set<Integer> set = new HashSet<>();
        for (int num : nums) { // O(n)
            if (set.contains(num)) { // O(1)
                return true;
            }
            set.add(num); // O(1)
        }
        return false;
    }
}