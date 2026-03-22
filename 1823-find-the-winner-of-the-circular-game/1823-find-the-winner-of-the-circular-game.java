class Solution { //josefus problem 
    int solve(ArrayList<Integer>v,int k,int index){
        if(v.size()==1){ //base case
            return v.get(0); //ek bcha to vo hi alive
        }
        index=(index+k)%v.size(); //agla jisko vo goli marega
        v.remove(index); //mod taki index outofbound nhi ho
        return solve(v,k,index); //recursive call
    }
    public int findTheWinner(int n, int k) { 
        ArrayList<Integer>v=new ArrayList<>();
        for(int i=1;i<=n;i++){
            v.add(i);
        }
        return solve(v,k-1,0);
    }
}