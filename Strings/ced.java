class Solution {
    public int balancedStringSplit(String s) {
        int lcount=0;
        int rcount=0;
       
        int ans=0;
        for(int i=0;i<s.length();i++){
            char currentchr=s.charAt(i);
        if(currentchr=='L'){
            lcount++;
        }
        else if(currentchr=='R'){
            rcount++;
        }
       if(lcount==rcount){
        ans++;
        }
        }
        
    return ans;
    }
}