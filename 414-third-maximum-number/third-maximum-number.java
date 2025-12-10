class Solution {
    public int thirdMax(int[] nums) {
//       Arrays.sort(nums);
// int d = 1;
//       for(int i = nums.length-2 ; i >= 0 ; i--){
//         if(nums[i] != nums[i+1]){
//             d++;
//             if(d== 3) return nums[i];
//         }
//       }  
//       return nums[nums.length - 1];



// Arrays.sort(nums);
// int d = 1;
// for(int i=0; i < nums.length ; i++){
//     if(nums[i] != nums[i-1]){
//         d++;
//     if(d == 3)return nums[i];
//     }
// }

// return nums[nums.length-1];

Arrays.sort(nums);
List<Integer> l = new ArrayList<>();
l.add(nums[0]);
for(int i=1 ; i < nums.length ; i++){
 if(nums[i-1] != nums[i]){
    l.add(nums[i]);

 }  
}

int listSize = l.size();
 if(listSize < 3){
    return l.get(listSize - 1);

 }
 return l.get(listSize - 3);

}
}