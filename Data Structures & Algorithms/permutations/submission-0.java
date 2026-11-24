class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
            // list.add(nums[i]);
            helper(nums,0,ans,list);
        // }
        return ans;
    }
    private void helper(int [] nums, int i, List<List<Integer>> ans, List<Integer> list){
        if(list.size() == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(i > nums.length) return;

        for(int j=0;j<nums.length;j++){
            if(list.contains(nums[j])) continue;
            list.add(nums[j]);
            helper(nums,i+1,ans,list);
            list.remove(list.size()-1);
        }
    }
}
