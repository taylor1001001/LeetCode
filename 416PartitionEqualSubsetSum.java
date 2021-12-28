class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for(int i=0; i<nums.length; i++){
            total+=nums[i];
        }
        
        if(total%2==1){
            return false;
        }
        
        int subsum = total/2;
        Boolean[][] temp = new Boolean[nums.length+1][subsum+1];
        return helper(nums, nums.length-1, subsum, temp);
    }
    
    public boolean helper(int[] nums, int n, int subsum, Boolean temp[][]){
        if(subsum == 0)
            return true;
        else if(n==0 || subsum<0)
            return false;
        else if(temp[n][subsum] != null)
            return temp[n][subsum];
        boolean result = helper(nums, n-1, subsum - nums[n-1], temp) || helper(nums, n-1, subsum, temp);
        temp[n][subsum] = result;
        return result;
    }
}
