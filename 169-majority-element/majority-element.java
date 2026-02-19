class Solution {
    public int majorityElement(int[] nums) {
        // Base case...
        if (nums.length == 1) {
		    return nums[0];
	    }
        Arrays.sort(nums);
       
        
	    return nums[nums.length / 2];
    }
}