class Solution {
    public int mySqrt(int x) {
        int i =1 ;
        int j = x;
        int mid = -1;
        while(i <= j){
            mid = i + (j - i) / 2;

            if((long)mid * (long)mid > x){
                j = mid - 1;
            }else if(mid * mid == x){
                // i = mid + 1;
                return mid;
            }else{
                i = mid + 1;

            }
        }
    return j;
    }}