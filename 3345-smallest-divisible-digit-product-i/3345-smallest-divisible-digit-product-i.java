class Solution {
    public int productOfDigits(int  n){
        int ans = 1;
        while(n>0){
            int last = n%10;
            ans = ans*last;
            n/=10;
        }
        return ans;
    }
    public int smallestNumber(int n, int t) {
        boolean divisible = false;
        while(!divisible){
            int currProduct= productOfDigits(n);
            if(currProduct % t == 0){
                
                return n;
            }
            n++;
        }
        return 0;
    }
}