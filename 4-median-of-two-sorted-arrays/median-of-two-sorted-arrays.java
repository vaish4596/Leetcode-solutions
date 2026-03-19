class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] num3 = new int[nums1.length + nums2.length];
        int k = 0 ;

        for(int i = 0; i<nums1.length; i++){
            num3[k++] = nums1[i];
           // num3[k++];
        }

          for(int i = 0; i<nums2.length; i++){
            num3[k++] = nums2[i];
            //num3[k++];
        }

        Arrays.sort(num3);

        int total = num3.length;
       

       if (total % 2 == 1) {

        return num3[total / 2];
}     
       else {

        return (num3[total / 2 - 1] + num3[total / 2]) / 2.0;
}
    }
}