class Solution {
    public String majorityFrequencyGroup(String s) {
      HashMap<Character,Integer>map=new HashMap<>();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }
        else{
            map.put(ch,1);
        }
      }
      HashMap<Integer,String>gr=new HashMap<>();
 
     for(char ch:map.keySet()){
      int freq=map.get(ch);
      if(gr.containsKey(freq)){
        gr.put(freq,gr.get(freq)+ch);
      }else{
        gr.put(freq,""+ch);
      }
     }
    int max=0;
    int bst=0;
    String ans="";
    for(int freq:gr.keySet()){
        String str=gr.get(freq);
        int size=str.length();
        if(size>max || size==max && freq>bst){
            max=size;
            bst=freq;
            ans=str;
        }
    }return ans;


    }
}