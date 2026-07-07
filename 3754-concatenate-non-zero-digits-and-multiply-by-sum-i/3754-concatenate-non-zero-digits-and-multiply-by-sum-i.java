class Solution {
    public int reverse(int n){
        int temp = n;
        int rev = 0;
        while(temp>0){
            int last = temp%10;
            rev = rev * 10 + last;
            temp /= 10;
        }
        return rev;
    }
    public long sumAndMultiply(int n) {
        int sum = 0;
        int res = 0;
        while(n>0){
            int last = n%10;
            if(last!=0){
                sum+=last;
                res = res * 10 + last;
            }
            n/=10;
        }

        int nonz = reverse(res);

        return (long)nonz*sum;
    }
}