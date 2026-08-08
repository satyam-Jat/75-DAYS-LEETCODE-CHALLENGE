class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
      ArrayList<Integer> al=new ArrayList<>();
      for(int ele:stones){
        al.add(ele);
      }
      while(al.size()>1){
        Collections.sort(al);
        int y=al.remove(al.size()-1);
        int x=al.remove(al.size()-1);
        if(y!=x) al.add(y-x);
        
      }  
      if(al.size()==0){
        return 0;
      }
      return al.get(0);
    }
}