class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int j=0; 
        for(int i=0;i<n;i++)
        {
            int compare = nums[i];
            if(j<n-1 && compare ==nums[i+1])
            {
                return true;
            }
            j++;
        }
        return false;
    }
}