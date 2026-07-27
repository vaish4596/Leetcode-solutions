class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();

        if (s.length() < p.length()) {
            return list;
        }

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

    
        for (char ch : p.toCharArray()) {
            pFreq[ch - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < s.length(); i++) {

            
            windowFreq[s.charAt(i) - 'a']++;

         
            if (i >= k) {
                windowFreq[s.charAt(i - k) - 'a']--;
            }
            if (Arrays.equals(pFreq, windowFreq)) {
                list.add(i - k + 1);
            }
        }

        return list;
    }
}