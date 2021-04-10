class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int res=0;
        int y=x;
        int lastdigit;
        while(x!=0){
            lastdigit=x%10;
            x/=10;
            res=res*10+lastdigit;
        }
        return res==y;
    }
}
