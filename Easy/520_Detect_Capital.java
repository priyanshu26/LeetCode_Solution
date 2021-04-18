class Solution {
    public boolean detectCapitalUse(String word) {
        int[] array = new int[26+26+6];
        for(int i = 0; i < word.length(); i++) {
            if(Character.isLowerCase(word.charAt(i))) {
                array[word.charAt(i)-'a']++;
            } else {
                array[word.charAt(i)-'A'+32]++;
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < 26; i++) {
            sum1 += array[i];
        }
        for(int i = 31; i < array.length; i++) {
            sum2 += array[i];
        }
        if(sum1 == word.length() || sum2 == word.length()) {
            return true;
        } else if(Character.isUpperCase(word.charAt(0)) && sum2 == 1 && sum1 == word.length()-1) {
            return true;
        }
        return false;
    }
}
