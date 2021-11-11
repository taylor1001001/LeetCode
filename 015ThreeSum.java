class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                break;
            }
            if(i == 0 || nums[i-1] != nums[i]){
                int low = i+1;
                int high = nums.length - 1;
                while(low < high){
                    int sum = nums[i] + nums[low] + nums[high];
                    if(sum == 0){
                        result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        low++;
                        high--;
                        while(nums[low]==nums[low-1] && low<high){
                            low++;
                        }
                    }else if(sum < 0){
                        low++;
                    }else{
                        high--;
                    }
                }
            }
        }
        
        return result;
    }
}
