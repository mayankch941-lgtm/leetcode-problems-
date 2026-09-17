class Solution {
    public int searchInsert(int[] nums, int target) {
       int in =Arrays.binarySearch(nums, target);
       if(in<0){
        in= -1 * in - 1;
       }
       return in;
    }
}