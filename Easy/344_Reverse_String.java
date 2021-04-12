class Solution {
    public void reverseString(char[] s) {
        int f_array = 0;
        int l_array = s.length-1;
        
        while (f_array <= l_array) {
            char res = s[f_array];
            s[f_array] = s[l_array];
            s[l_array] = res;
            f_array += 1;
            l_array -= 1;
        }
    }
}
