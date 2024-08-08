public class MergeSortedArray{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=m-1;
        int q=n-1;
        int index = m + n - 1; 
        while(p >= 0 && q >= 0){
            if(nums1[p]>nums2[q]){
                nums1[index--]=nums1[p];
                p--;
            }
            else{
                nums1[index--]=nums2[q];
                q--;
            }
        }
        while(q >= 0){
            nums1[index--]=nums2[q];
            q--;
        }
    }
    public static void main(String[] args) {
        MergeSortedArray solution = new MergeSortedArray();
        
        // Test case
        int[] nums1 = new int[6]; // Make sure nums1 has enough space
        int[] nums2 = {1, 2, 3};
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        nums1[3] = 0;
        nums1[4] = 0;
        nums1[5] = 0;
        solution.merge(nums1, 3, nums2, 3);
        // nums1 should be [1, 1, 2, 2, 3, 3]
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}