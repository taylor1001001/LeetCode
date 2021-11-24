class Solution {
    public String minWindow(String s, String t) {
        int[] freqT = new int[256];
        int[] freqS = new int[256];
        
        for(int i=0; i<t.length(); i++){
            freqT[t.charAt(i)]++;
        }
        
        int lo = 0;
        int hi = 0;
        String res = "";
        int min = Integer.MAX_VALUE;
        
        while(hi < s.length()){
            freqS[s.charAt(hi)]++;
            hi++;
            
            while(moreThanEnough(freqT, freqS)){
                freqS[s.charAt(lo)]--;
                lo++;
                if(hi-lo<min){
                    res = s.substring(lo-1,hi);
                    min = hi - lo;
                }
            }
        }
        return res;
    }
    
    boolean moreThanEnough(int[] freqT, int[] freqS){
        for(int i=0; i<freqS.length; i++){
            if(freqS[i]<freqT[i]){
                return false;
            }
        }
        return true;
    }
}
