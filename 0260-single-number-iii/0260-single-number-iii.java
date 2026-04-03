class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int arr[]=new int[2];
        int idx=0;
        for(int i=0;i<n;i++){
            if(map.get(nums[i])==1)
            arr[idx++]=nums[i];
        }
        return arr;
    }
}