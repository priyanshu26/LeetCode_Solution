// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
class Solution {
    public int reverse(int x) {
        
        int reverced = 0;
        int pop;
        
        while(x != 0){
            pop = x % 10;
            x /= 10;
            
            if(reverced > Integer.MAX_VALUE/10 || reverced == Integer.MAX_VALUE/10 && pop > 7)return 0;
            if(reverced < Integer.MIN_VALUE/10 || reverced == Integer.MIN_VALUE/10 && pop < -8)return 0;
            
            reverced = (reverced * 10) + pop;
        
        }
        return reverced;
    }
}
