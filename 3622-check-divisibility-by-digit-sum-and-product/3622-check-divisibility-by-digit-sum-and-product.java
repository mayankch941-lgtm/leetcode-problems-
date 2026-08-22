class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int mul=1;
        int z=n;
        while (n!=0){
            int y=n%10;
            sum=sum+y;
            mul=mul*y;
            n=n/10;
        }
        int x= sum+mul;
        return z%x==0;
    }
}