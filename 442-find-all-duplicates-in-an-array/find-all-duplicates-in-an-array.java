class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        HashSet<Integer> hm = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(Integer i : nums){
            if(hm.contains(i)){
                al.add(i);
            }else{
                hm.add(i);
            }
        }
return al;

    }
}