class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();
row1.add(1);
ans.add(row1);

List<Integer> row2 = new ArrayList<>();
row2.add(1);
row2.add(1);
ans.add(row2);

for(int i=2 ; i <= rowIndex ; i++){
List<Integer> curr = new ArrayList<>();
curr.add(1);

List<Integer> curr2 = ans.get(i-1);

for(int j=1 ; j < i ; j++){
    int sum = curr2.get(j) + curr2.get(j-1) ;
    curr.add(sum);

}

curr.add(1);
ans.add(curr);
}
return ans.get(rowIndex);

    }
}