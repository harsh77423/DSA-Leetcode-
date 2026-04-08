class Solution {
    public int thirdMax(int[] nums) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();

        // for(int num : nums){
        //     if(!pq.contains(num)){
        //         if(pq.size() < 3){
        //             pq.add(num);
        //         }else if(num > pq.peek()){
        //             pq.poll();
        //             pq.add(num);
        //         }
        //     }
        // }
        // if(pq.size() < 3){
        //     while(pq.size() > 1)pq.poll();
        // }
        // return pq.peek();

int count = 0;
Arrays.sort(nums);
for(int i=nums.length -1 ; i> 0 ;i--){
    if(nums[i] != nums[i-1])count++;
if(count == 2)return nums[i-1];

}
return nums[nums.length - 1];

    }
}