class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
       int[] ar = new int[n];

       ar[0] = 1;

       for(int i = 1; i < n; i++){
        ar[i] = ar[i-1] * nums[i-1];
       }

       int right = 1;
       for(int i = n-1; i >= 0; i--){
        ar[i] *= right;
        right *= nums[i];
       }
      return ar;
    }
}