class Solution {
    public int reverseBits(int n) {
        int i=0,j=31;
       boolean ion;
       boolean jon;
        while(i<j){
            int imask=1<<i;
            int jmask=1<<j;
            if((n&imask)!=0) ion=true;
            else ion =false;
             if((n&jmask)!=0) jon=true;
             else jon=false;
             if(ion!=jon) {
                n^=imask;
                n^=jmask;
             }
             i++;
             j--;
        }
        return n;
    }
}