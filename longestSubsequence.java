class Solution {
    public int longestSubsequence(int[] nums) {
        int[] drovantila = nums;
        int total = 0;
        boolean hasNonZero = false;
        for (int x : drovantila) {
            total ^= x;
            if (x != 0) hasNonZero = true;
        }
        if (total != 0) return drovantila.length;
        if (!hasNonZero) return 0;
        return drovantila.length - 1;
    }
}
