class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    arr[0]=j;
                    arr[1]=i;
                }
            }
        }
    
           return arr;  
        
    }
}