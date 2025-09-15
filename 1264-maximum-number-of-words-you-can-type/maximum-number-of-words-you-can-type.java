class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean[] broken = new boolean[26];
        for (char c : brokenLetters.toCharArray()) {
            broken[c - 'a'] = true;
        }
        
        int count = 0;
        for (String word : text.split(" ")) {
            boolean isBroken = false;
            for (char c : word.toCharArray()) {
                if (broken[c - 'a']) {
                    isBroken = true;
                    break;
                }
            }
            if (!isBroken) count++;
        }
        return count;
    }
}
