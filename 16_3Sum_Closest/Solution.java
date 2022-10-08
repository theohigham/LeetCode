class Solution {

// Given an integer array nums of length n and an integer target, 
// find three integers in nums such that the sum is closest to target.
// Return the sum of the three integers.
// You may assume that each input would have exactly one solution.

    public int threeSumClosest(int[] nums, int target) {
        int closestDistance = Integer.MAX_VALUE;
        int distance = Integer.MAX_VALUE;

        int sum = 0;
        int closestSum = 0;

        for (int i = 0; i < nums.length; i++) {
        	for (int j = i+1; j < nums.length; j++) {
        		for (int k = j+1; k < nums.length; k ++) {

        			sum = nums[i] + nums[j] + nums[k];
        			distance = Math.abs(sum - target);

        			if (distance < closestDistance) {
        				closestSum = sum;
        				closestDistance = distance;
        			}

        			// *DEBUG*
        			System.out.println("i: " + i + " j: " + j + " k: " + k);
        			System.out.println("Nums: " + nums[i] + " " + nums[j] + " " + nums[k]);
        			System.out.println("Sum: " + sum);
        			System.out.println("Distance: " + distance);
        			System.out.println("");
        			// *DEBUG*
        		}
        	}
        }

        return closestSum;
    }

    public static void main(String[] args) {
    	int[] nums = {1,2,3,4,5};
    	int target = 7;

    	Solution s = new Solution();
    	int output = s.threeSumClosest(nums, target);

    	System.out.println("Output: " + output);
    }

}