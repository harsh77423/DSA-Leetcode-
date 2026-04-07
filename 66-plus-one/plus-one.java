class Solution {
    public int[] plusOne(int[] digits) {

    // int carry = 1;
    // for(int i = digits.length-1 ; i>=0; i--){
    //     digits[i] = digits[i] + carry;

    //     if(digits[i] == 10){
    //         digits[i] =0;
    //         carry =1;
    //     }else{
    //         carry =0;
    //         break;
    //     }
    // }
    // if(carry ==1){
    //     int[] newDigits = new int[digits.length +1];
    //     newDigits[0] = 1;
    //     return newDigits;

    // }
    // return digits;

    for(int i=digits.length -1 ;i>=0 ; i--){
        if(digits[i]<9){
            digits[i]++;
            return digits;
        }
        digits[i] = 0;

    }
    int[] newDigits = new int[digits.length +1];
    newDigits[0] =1;
    return newDigits;

    }

}
