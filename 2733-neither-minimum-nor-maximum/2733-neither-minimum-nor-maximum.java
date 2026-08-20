class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n=nums.length;
        int temp=-1;
        Arrays.sort(nums);
        if (n<=2){
            temp=-1;
        }
        else{
            temp=nums[1];
        }
        return temp;
    }
}