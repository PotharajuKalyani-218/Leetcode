class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;
        String [] words=text.split(" ");
        for (String word : words) {
            boolean isBroken = false;
            for (char brokenChar : brokenLetters.toCharArray()) {
                if (word.contains(String.valueOf(brokenChar))) {
                    isBroken = true;
                    break;
                }
            }
            if (!isBroken) {
                count++;
            }
        }
        return count;
    }
}
