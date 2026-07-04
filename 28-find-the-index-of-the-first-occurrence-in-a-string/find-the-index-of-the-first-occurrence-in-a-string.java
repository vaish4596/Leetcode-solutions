class Solution {
    public int strStr(String haystack, String needle) {
        int s = needle.length(); int j = 0;
        for(int i = 0; i <= haystack.length()-s; i++){
            String t = "";
            for(j = i; j < i+s; j++){
                t += haystack.charAt(j);

            }
            if(t.equals(needle)){
                return i;
            }
        }
        return -1;
        
    }
}