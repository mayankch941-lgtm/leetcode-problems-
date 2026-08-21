class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int x=nums1.length;
      int y=nums2.length;
      int n= x+y;
      int k=0;
      double med=0;
      int arr []=new int[n];
      for (int i = 0; i < n; i++) {
            if (i < x) {
                arr[k] = nums1[i];
            } else {
                arr[k] = nums2[i - x];
            }
            k++;
        }
        Arrays.sort(arr);
        if (n%2!=0){
            med=arr[n/2];
        }
        else{
            med=(arr[n/2]+arr[(n/2)-1])/2.0;
        }

      
      return med; 
    }
}