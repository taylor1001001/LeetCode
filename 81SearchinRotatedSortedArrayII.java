class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

		while(start<=end){
			int mid = start + (end-start)/2;
            System.out.println(mid);
			if(nums[mid] == target) 
                return true;
            else if(nums[mid]==nums[start]){
                start++;
            }
			else if (nums[mid]>nums[start]){
				if(nums[mid]>target && nums[start]<=target){
					end = mid-1;
				}else{
					start = mid+1;
				}

			}else {
				if(nums[mid]<target && nums[start]>target){
					start = mid+1;
				}else{
					end = mid-1;
				}
			}
		}

		return false;
	}
}    
