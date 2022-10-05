class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] output = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

            if (nums[i] + nums[j] == target && i != j) {
                    output[0] = i;
                    output[1] = j;
                }
            }
        }
        
        return output;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {3,2,4};
        int[] output = s.twoSum(nums, 6);

        for (int x : output) {
            System.out.println(x);
        }
    }
}