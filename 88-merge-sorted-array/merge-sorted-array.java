class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> set = new ArrayList<>();
       for(int i =0; i < m;i++){
        set.add(nums1[i]);
       } 
        for(int i =0; i < n;i++){
        set.add(nums2[i]);
       }
       Collections.sort(set);
      
         for (int i = 0; i < set.size(); i++) {
            nums1[i] = set.get(i); 
    }
    }
}