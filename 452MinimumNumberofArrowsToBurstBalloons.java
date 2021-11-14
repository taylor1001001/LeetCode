class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0){
            return 0;
        }
        
        int count = 1;
        
        Arrays.sort(points, new IntervalComparator());
        
        int end = points[0][1];
        for(int i=0; i<points.length; i++){
            if(points[i][0] > end){
                count++;
                end = points[i][1];
            }
        }
        
        return count;
    }
}

 class IntervalComparator implements Comparator<int[]>{
        public int compare(int[] a, int[] b){
            if(a[1] == b[1])
                return 0;
            else if(a[1] < b[1])
                return -1;
            else
                return 1;
        }
    }
