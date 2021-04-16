class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('a');
        vowels.add('E');
        vowels.add('e');
        vowels.add('I');
        vowels.add('i');
        vowels.add('O');
        vowels.add('o');
        vowels.add('U');
        vowels.add('u');
        char[] charactor = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            while(i<j && !vowels.contains(charactor[i])){
              i++;  
            }
            while(i<j && !vowels.contains(charactor[j])){
                j--;
            }
            char temp = charactor[i];
            charactor[i++] = charactor[j];
            charactor[j--] = temp;
        }
        return new String(charactor);
    }
}
