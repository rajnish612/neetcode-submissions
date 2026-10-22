class Solution {

    //Time complexity O(n) space complexity O(1)
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        int l = 0;

        for (int r = s1.length(); r < s2.length(); r++) {
            if (Arrays.equals(s1Count, s2Count)) {
                return true;
            }

            // Add the incoming character
            s2Count[s2.charAt(r) - 'a']++;

            // Remove the outgoing character
            s2Count[s2.charAt(l) - 'a']--;

            l++;
        }

        return Arrays.equals(s1Count, s2Count);
    }
}
