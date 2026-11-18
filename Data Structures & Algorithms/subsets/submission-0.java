class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        return helper(nums,ans,new ArrayList<>(),0);
    }

    private List<List<Integer>> helper(int [] nums,List<List<Integer>> ans, List<Integer> list, int i ){
        if(i == nums.length){
            ans.add(new ArrayList<>(list));
            return ans;
        }
        list.add(nums[i]);
        List<List<Integer>> pick = helper(nums,ans,list,i+1);
        list.remove(list.size()-1);
        List<List<Integer>> notPick = helper(nums,ans,list,i+1);
        return ans;
    }
}
