class Solution {
    // Time complexity O(m+n)
    // Space complexity O(m+n)
    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String str : strs) {
            res.append(str.length() + "#" + str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '#') {
                int length = Integer.parseInt(str.substring(i, j));
                i = j + 1;
                res.add(str.substring(i, length + i));
                i = i + length;
                j = i - 1;
            }
        }
        return res;
    }
}
