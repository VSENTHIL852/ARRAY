class MergeSortedArray{
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] temp = new int[m + n];   // temporary merged array
        
        int i = 0;   // pointer for nums1
        int j = 0;   // pointer 
        int k = 0;   // pointer for temp

        // merge from the FRONT
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                temp[k] = nums1[i];
                i++;
            } else {
                temp[k] = nums2[j];
                j++;
            }
            k++;
        }   // remaining elements of nums1
        while (i < m) {
            temp[k] = nums1[i];
            i++;
            k++;
        }

        // remaining elements of nums2
        while (j < n) {
            temp[k] = nums2[j];
            j++;
            k++;
        }      // copy temp back to nums1
        for (int x = 0; x < m + n; x++) {
            nums1[x] = temp[x];
        }
    }
}
