class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null){
            return "";
        }
        String lcp = strs[0];
        for(int i=1; i<strs.length;i++){
            int j = 0;
            String currStr = strs[i];
            while(j < lcp.length() && j < currStr.length() && lcp.charAt(j) == currStr.charAt(j)){
                j++;
            }
            if(j == 0){
                return "";
            }
            lcp = lcp.substring(0,j);
        }
        return lcp;
    }
}
