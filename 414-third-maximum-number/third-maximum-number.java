class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i : nums){
            set.add(i);
        }
        int ar[] = new int[set.size()];
        int j = 0;
        for(int i : set){
            ar[j++] = i;
        }
            if(ar.length >= 3){    
                     return ar[ar.length-3];  
            }
            else{
                return ar[ar.length-1];
            }
    }
}
