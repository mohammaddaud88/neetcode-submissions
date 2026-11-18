class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,target,ans, new ArrayList<>(),0,0);
        return ans;
    }

    private void helper(int [] nums, int target, List<List<Integer>> ans,List<Integer> list, int i, int sum){
        if(sum == target){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(i == nums.length || sum > target) return;
        
        list.add(nums[i]);
        helper(nums,target,ans,list,i,sum + nums[i]);

        list.remove(list.size()-1);
        helper(nums,target,ans,list,i+1,sum);

    }

}
