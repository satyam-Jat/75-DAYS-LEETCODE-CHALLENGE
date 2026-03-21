class Solution {
    public List<String> generateParenthesis(int n) {
        List <String> result= new ArrayList<>();
        solve(result,"",n,n);
        return result;
    }
    public void solve(List<String>result,String op,int open,int close)
    {
        if(open==0 && close==0)
        {
            result.add(op);
            return ;
        }
        if(open>0) {
            
            solve(result,op+"(",open-1,close);
        }
        if(close>open){
           
            solve(result,op+")",open,close-1);
        }
    }
}