class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < m; i++)
        list.add(nums1[i]);

    for (int i = 0; i < n; i++)
        list.add(nums2[i]);

    // Bubble Sort
    for (int i = 0; i < list.size() - 1; i++) {
        for (int j = 0; j < list.size() - i - 1; j++) {

            if (list.get(j) > list.get(j + 1)) {

                int temp = list.get(j);
                list.set(j, list.get(j + 1));
                list.set(j + 1, temp);
            }
        }
    }

    for (int i = 0; i < list.size(); i++)
        nums1[i] = list.get(i);
}
}