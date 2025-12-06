class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int dupe = -1, miss = -1;

for(int i=0 ; i < n ; i++){
    int count = 0;
    for(int j=0 ; j < n ; j++){
        if(nums[j] == nums[i])count++;

    }
    if(count == 2){
        dupe = nums[i];
        break;
    }

}

for(int k=1; k <= n ; k++){
    boolean present = false;
    for(int j=0 ; j < n ; j++){
        if(nums[j] == k){
            present = true;
            break;
        }
    }
    if(!present){
        miss = k;
        break;
    }
}
return new int[]{dupe , miss};

    }
}