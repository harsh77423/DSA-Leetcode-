class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        //1st row ke liye
        List<Integer> temp = new ArrayList<>();

        temp.add(1);
        ans.add(temp);

      if(numRows == 1){
        return ans;
      }

//2nd row ke liye
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        prev.add(1);
        ans.add(prev);
    

        for(int i=2; i < numRows ; i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);//har ek row ka start 1

            List<Integer> curr2 = ans.get(i-1); // pehli row lelenge

          
            //middle elements ke liye
            for(int j=1 ; j < i; j++){
                int sum = curr2.get(j) + curr2.get(j-1) ;
                curr.add(sum);

            }
curr.add(1); // har ek row ka last 1
ans.add(curr);  // naya row add krdenege

        }
        return ans;
    }
}