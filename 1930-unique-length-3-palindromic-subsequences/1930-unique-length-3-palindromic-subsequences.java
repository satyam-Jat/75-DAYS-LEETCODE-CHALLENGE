class Solution {
    public int countPalindromicSubsequence(String s) {
        int idx1=0,idx2=0;
        Map<Character,Integer>map1=new HashMap<>(); //store 1st ch 
        Map<Character,Integer>map2=new HashMap<>(); //store last ch
        for(int i=0;i<s.length();i++){ 
            char ch=s.charAt(i);
            if(!map1.containsKey(ch)) map1.put(ch,i); //initail indx hi lenge
            map2.put(ch,i); //override krdegi last wali frq jisse lastidx pta chlega.
        }
        int count=0;
       for(char ch:map1.keySet()){ //technique to take a freq araay of map
        idx1=map1.get(ch);
        idx2=map2.get(ch);
       Set<Character>set=new HashSet<>();
       for(int i=idx1+1;i<=idx2-1;i++){ //traverse between the two char of a set , beacuse we need unique charcter count between two char
        set.add(s.charAt(i)); 
       }
       count+=set.size();
       
        }
         return count;

    }
}