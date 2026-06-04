class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] arr = new int[m + n];
        int k = 0;

        
        for (int i = 0; i < m; i++) {
            arr[k++] = nums1[i];
        }

       
        for (int j = 0; j < n; j++) {
            arr[k++] = nums2[j];
        }

    
        for (int i = 0; i < m + n - 1; i++) {
            for (int j = i + 1; j < m + n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = arr[i];
        }
    }
}
