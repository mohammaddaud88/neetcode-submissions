class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,ans,0,0,new ArrayList<>());
        return ans;
    }
    private void helper(int [] nums, int target, List<List<Integer>> ans, int sum, int i, List<Integer> list ){
        if(target == sum ){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int j=i;j<nums.length;j++){
            if(sum > target) return;
            if(j > i && nums[j] == nums[j-1]) continue;
            list.add(nums[j]);
            helper(nums,target,ans,sum + nums[j], j+1, list);
            list.remove(list.size()-1);
        }
    }
}
