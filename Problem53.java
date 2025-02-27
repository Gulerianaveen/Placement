public class Problem53 {

    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        Problem53 solution = new Problem53();

        // Test cases
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(solution.maxSubArray(nums1)); // Output: 6

        int[] nums2 = {1};
        System.out.println(solution.maxSubArray(nums2)); // Output: 1

        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println(solution.maxSubArray(nums3)); // Output: 23
    }
}