class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n,0,0,ans,"");
        return ans;
    }
    private void helper(int n, int oc, int cc, List<String> ans, String str){
        if(oc == n && cc == n){
            ans.add(str);
        }
        if(cc > n || oc > n || cc > oc) return;
        helper(n,oc+1,cc,ans,str+"(");
        helper(n,oc,cc+1,ans,str+")");
    }
}
