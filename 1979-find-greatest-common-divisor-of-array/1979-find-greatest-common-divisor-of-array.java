class Solution {
    public int findGCD(int[] nums) {
        int n= nums .length;
        Arrays.sort(nums);
        int x=nums[0];
        int y=nums[n-1];
        int div=0;
        for (int i=x;i>=1;i-- ){
            int z=x%i;
            int m=y%i;
            if (m==0 && z ==0){
                div=i;
                break;
            }
        }
        return div;
    }
}