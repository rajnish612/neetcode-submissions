class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        // Time and space complexity O(n)
        for (int num : nums) {
            set.add(num);
        }
        int longestStreak = 0;
        for (int num : nums) {
            int currStreak = 1;
            if (!set.contains(num - 1)) {
                int i = num;
                while (set.contains(i + 1)) {
                    i++;
                    currStreak++;
                }
            }
            longestStreak = Math.max(currStreak, longestStreak);
        }
        return longestStreak;
    }
}
