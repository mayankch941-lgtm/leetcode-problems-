class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums .length;
        int count=0;
        int pro=1; 
    for (int i=0;i<n;i++){
        for (int j=i;j<n;j++){
           pro= pro* nums [j];
           if (pro<k){
            count ++;

           }
           else{
            break;
           } 
        }
    pro=1;
    } 
    return count;  
    }
}