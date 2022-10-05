import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] output = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>(); // <nums[i] ,i>
        
        for (int i = 0; i < nums.length; i++) {
            
            if (map.containsKey(target - nums[i])) {
                output[0] = map.get(target - nums[i]);
                output[1] = i;
            }

            map.put(nums[i],i);

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