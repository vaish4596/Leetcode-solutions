class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ls = new ArrayList<>();
        if(nums.length==0){
            return ls;
        }
        int i = 0;
        while(i<nums.length){
            int start = nums[i];
            while(i < nums.length-1 && nums[i] +1 == nums[i+1]){
                i++;
            }
            int end = nums[i];

            if(start==end){
                ls.add(String.valueOf(start));
            }
            else{
                ls.add(start+"->"+end);
            }
            i++;
        }
        return ls;
        
    }
}