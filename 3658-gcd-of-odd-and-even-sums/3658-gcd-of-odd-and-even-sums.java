class Solution {
    public int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int sumOfEven = 0;
        int sumOfOdd = 0;
        n = n*2;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sumOfEven++;
            }else{
                sumOfOdd++;
            }
        }
        return gcd(sumOfOdd, sumOfEven);
    }
}