class Solution {
    public void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int findDuplicate(int[] nums) {
        while(true){ //continue loop till arr ele==ele na mil jae
            int ele =nums[0]; //element dal lia
            if(nums[ele]==ele) return ele; //element ko index ke roop me use krlia
            swap(0,ele,nums); 
        }
    }
}