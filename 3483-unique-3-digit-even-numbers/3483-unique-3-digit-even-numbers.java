class Solution {
    public int totalNumbers(int[] digits) {
        int freq[] = new int[10];
        for(int i=0;i<digits.length;i++){
            freq[digits[i]]++;
        }

        int count = 0;

        for(int hundred=1; hundred<=9; hundred++){
            for(int ten=0; ten<=9; ten++){
                for(int one=0; one<=8; one+=2){
                    int used[] = new int[10];
                    used[hundred]++;
                    used[ten]++;
                    used[one]++;

                    boolean possible = true;

                    for(int i=0;i<=9;i++){
                        if(used[i]>freq[i]){
                            possible = false;
                            break;
                        }
                    }

                    if(possible){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}