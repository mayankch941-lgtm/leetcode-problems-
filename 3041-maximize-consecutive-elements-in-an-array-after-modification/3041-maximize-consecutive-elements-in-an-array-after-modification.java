import java.util.*;

class Solution {
    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> dp = new HashMap<>();
        int ans = 0;

        for (int num : nums) {
            int extendAsIncremented = dp.getOrDefault(num, 0) + 1;
            int extendAsOriginal = dp.getOrDefault(num - 1, 0) + 1;

            dp.put(num + 1, extendAsIncremented);
            dp.put(num, extendAsOriginal);

            ans = Math.max(ans, Math.max(extendAsIncremented, extendAsOriginal));
        }

        return ans;}}