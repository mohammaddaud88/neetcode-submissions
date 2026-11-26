class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0,ans,new ArrayList<>());
        return ans;
    }
    private void helper(int [] nums,int i, List<List<Integer>> ans, List<Integer> list){
        ans.add(new ArrayList<>(list));
        for(int j=i;j<nums.length;j++){
            if(j > i && nums[j] == nums[j-1])continue;
            list.add(nums[j]);
            helper(nums,j+1,ans,list);
            list.remove(list.size()-1);
        }
    }
}
