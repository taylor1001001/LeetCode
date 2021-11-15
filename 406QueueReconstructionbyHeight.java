class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new PeopleComparator());
        
        List<int[]> result = new ArrayList<>();
        for(int i=0; i<people.length; i++){
            result.add(people[i][1],people[i]);
        }
        
        return result.toArray(new int[people.length][2]);
    }
}

class PeopleComparator implements Comparator<int[]>{
        public int compare(int[] a, int[] b){
            if(a[0]==b[0])
                return a[1] - b[1];
            else 
                return b[0] - a[0];
        }
    }
