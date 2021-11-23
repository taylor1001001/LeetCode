class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        int pointer1 = 0;
        int pointer2 = 0;
        if(m==0 && n==0){
            return;
        }else if(m==0){
            result = nums2;
        }else if(n==0){
            result = nums1;
        }else {
            for(int i=0; i< result.length; i++){
                if(pointer2==n || (pointer1<m && nums1[pointer1]<nums2[pointer2])){
                    result[i]=nums1[pointer1];
                    pointer1++;
                }else{
                    result[i]=nums2[pointer2];
                    pointer2++;
                }
            }
        }
        
        for(int i=0; i<result.length; i++){
            nums1[i] = result[i];
        }
    }
}
