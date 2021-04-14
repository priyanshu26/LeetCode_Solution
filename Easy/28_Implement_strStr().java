class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        
        int n = needle.length();
        int h = haystack.length();
        if (h < n)return -1;
        for(int i = 0; i <= h - n; i++){
            int j;
            for(j = 0 ; j < n; j++){
                if (haystack.charAt(i + j) != needle.charAt(j)){
                    break;
                }
            }
            if(j == n)return i;
        }
        return -1;
    }
}
