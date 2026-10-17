class Solution {
    //     int[] freq = new int[26] → \(O(1)\), because the array always has 26 elements.

    // Arrays.toString(freq) → \(O(1)\) space per key, because the array has a fixed size of 26.

    // HashMap and grouped lists → \(O(nk)\) space in total, where \(n\) is the number of strings
    // and \(k\) is their maximum length. This includes the stored keys and references to the
    // original strings.

    // s.toCharArray() → \(O(k)\) temporary space for the current string.
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
