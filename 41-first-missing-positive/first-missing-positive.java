class Solution {
    public int firstMissingPositive(int[] nums) {
        int missingnumber = 1;
        Arrays.sort(nums);
        for(int numbers: nums)
        {
           if(numbers >0){
            if(numbers == missingnumber)
            {
                missingnumber++;
            }
            else if(missingnumber< numbers)
               break;
            
           }
        }
        return missingnumber;
    }
}