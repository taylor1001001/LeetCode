class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        
        Arrays.sort(intervals, new IntervalComparator());
        
        int prev = 0;
        for(int i=1; i<intervals.length; i++){
            if(intervals[prev][1]>intervals[i][0]){
                count++;
                if(intervals[prev][1]>intervals[i][1])
                    prev = i;
            }else{
                prev = i;
            }
        }
        
        return count;
    }
}

    class IntervalComparator implements Comparator<int[]>{
        public int compare(int[] a, int[] b){
            return a[1]-b[1];
        }
    }
