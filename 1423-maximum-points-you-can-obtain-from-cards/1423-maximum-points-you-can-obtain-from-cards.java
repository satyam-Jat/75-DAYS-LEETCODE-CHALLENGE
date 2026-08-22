class Solution { //logic is super easy , left window bnalo , shrink is trh se krna hai , window ke last se element htate jane hai or array ke last se values add krte jana hai or check krte jaenge maxsum ko.
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int sum=0;
        int maxlen=-1;
        for(int i=0;i<=k-1;i++){
            sum+=cardPoints[i];
        }
        maxlen=sum;
        int mxdx=n-1;
        int lsum=sum,rsum=0;
        for(int j=k-1;j>=0;j--){
            lsum-=cardPoints[j];
            rsum+=cardPoints[mxdx];
            maxlen=Math.max(maxlen,lsum+rsum);
            mxdx--;
        }
        
        return maxlen;
    }
}