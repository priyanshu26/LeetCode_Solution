class Solution {
    public int lengthOfLastWord(String s) {
        int last = s.length();
        int result = 0;
        while (last > 0){
            if (s.charAt(--last) != ' ') {
                result ++;
            }
            else if (result > 0){
                return result;
            }
        }
        return result;
    }
}
