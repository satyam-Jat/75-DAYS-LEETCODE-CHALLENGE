class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int count=0;
        int m=1;
        while(n>0){
           if(n>8){
              n -=8;
              count +=8*m;
              m++;
           } 
           else{
            count +=n*m;
            m++;
            n=0;
           }
        }
        // if(n<=8) count +=n;
        // else if(n<=16){
        //     count=8;
        //     n -=8;
        //     count +=n*2;
        // }
        // else if(n<=24){
        //     count=24;
        //     n -=18;
        //     count +=n*3;
        // }
        // else{
        //     count=48;
        //     n -=24;
        //     count +=n*4;
        // }
        return count;
    }
}