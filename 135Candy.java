class Solution {
    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        Arrays.fill(candies,1);
        
        boolean change = true;
        while(change){
            change = false;
            
            for(int i=0; i<ratings.length; i++){
                if(i>0 && ratings[i]>ratings[i-1] && candies[i]<=candies[i-1]){
                    candies[i] = candies[i-1] + 1;
                    change = true;
                }
                
                if(i<ratings.length-1 && ratings[i]>ratings[i+1] && candies[i]<=candies[i+1]){
                    candies[i] = candies[i+1] +1;
                    change = true;
                }
            }
        }
        
        int numCandy = 0;
        for(int i=0; i<candies.length; i++){
            numCandy += candies[i];
        }
        
        return numCandy;
    }
}
