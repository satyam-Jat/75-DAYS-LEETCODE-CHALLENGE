class Solution {
    public int characterReplacement(String s, int k) {
       int n=s.length();
       int i=0; int j=0;
       int max=Integer.MIN_VALUE;
       int maxfreq=-1;
       HashMap<Character,Integer>map=new HashMap<>();
       while(j<n){
        char ch=s.charAt(j);
        if(!map.containsKey(ch)){
        map.put(ch,1);}
        else {map.put(ch,map.get(ch)+1);}
        maxfreq=Math.max(maxfreq,map.get(ch)); 
        while(((j-i+1)-maxfreq)>k){ //window len-maxfreq ele=remaining we have to change
            char a=s.charAt(i); //then shrink the window, k ya uske km hoga to chlega,atmost h
            map.put(a,map.get(a)-1);
            i++;
        }
        max=j-i+1; //condition koi si bhi to ye to chlna hi h
        j++; //while me at last pointer chlta hai, andr hi
       }
       if(max==Integer.MIN_VALUE) return 0; //if no value updated
       else return max;
    }
}