class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      Set<Integer>al=new TreeSet<>();
      ArrayList<Integer>am=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
         al.add(nums[i]);
        }
        for(int i=1;i<=n;i++)
        {
        if(!al.contains(i))
         am.add(i);
        }
        return am;
    }
}