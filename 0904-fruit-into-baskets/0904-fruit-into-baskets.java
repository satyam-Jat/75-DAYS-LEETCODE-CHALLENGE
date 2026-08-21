class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        Map<Integer,Integer>map=new HashMap<>();
        int i=0,j=0; int maxlen=Integer.MIN_VALUE; int length=0;
        while(j<n){
             map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            if(map.size()>2){ //jb 2 se bdha hoga to hi to apn ko condition lgani hai . brna add krte jao jb tk apni condition break ni hori.
                map.put(fruits[i],map.get(fruits[i])-1);
                if(map.get(fruits[i])==0){
                    map.remove(fruits[i]);
                }
                i++;
            }
            length=j-i+1;
            j++;
            if(maxlen<length){
                maxlen=length;
            }
    }
 return maxlen;   
}
}























/*class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length; int maxlen=0;
        int i=0; int j=0; 
        HashMap<Integer,Integer>map=new HashMap();
        while(j<n){ //sliding window
            if(map.containsKey(fruits[j])){ //arr[j] freq add krne ka kaam krra
                map.put(fruits[j],map.get(fruits[j])+1);
            }
            else{
                map.put(fruits[j],1); 
            }
           while(map.size()>2){ //arr[i] aage se elemts htane ka kaam krra
            int freq=map.get(fruits[i]);
            if(freq==1){
                map.remove(fruits[i]);
            }
            else {
                map.put(fruits[i],freq-1);
            }
            i++;
           }
            int len=j-i+1;
            maxlen=Math.max(maxlen,len);
            j++;
           }
        return maxlen;
    }
}
*/