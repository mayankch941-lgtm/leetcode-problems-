class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int x=nums1.length;
        int k=0;
        int n;
        int y=nums2.length;
        n=y;
        if (x>y){
            n=x;
        }
        int ans[]=new int[n];
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                if (nums1[i]==nums2[j]){
                    ans[k]=nums2[j];
                    k++;
                    nums2[j]=-1;
                    break;
                }
            }
        }
    return java.util.Arrays.copyOf(ans,k);

    }
}