class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
     
        for(String c : strs){
            char[] ar = c.toCharArray();
            Arrays.sort(ar);
            String t = new String(ar);

            if(!map.containsKey(t)){
                map.put(t, new ArrayList<>());
            }
            map.get(t).add(c);
           
        }
        return new ArrayList<>(map.values());
      
      

        
    }
}