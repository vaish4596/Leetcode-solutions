class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int i : nums1){
            map1.put(i, map1.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> li = new ArrayList<>();
        for(int i : nums2){
            if(map1.containsKey(i) && map1.get(i) > 0){
                li.add(i);
                map1.put(i, map1.get(i)-1);
            } 
        }
        int[] ar = new int[li.size()];
        int k = 0;
        for(int i : li){
            ar[k++] = i;
        }

        return ar;
    }
}