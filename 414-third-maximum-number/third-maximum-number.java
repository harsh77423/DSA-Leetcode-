class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : nums){
            if(!pq.contains(num)){
                if(pq.size() < 3){
                    pq.add(num);
                }else if(num > pq.peek()){
                    pq.poll();
                    pq.add(num);
                }
            }
        }
        if(pq.size() < 3){
            while(pq.size() > 1)pq.poll();
        }
        return pq.peek();
    }
}