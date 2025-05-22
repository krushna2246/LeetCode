class Solution {
    public char kthCharacter(int k) {
          String word = "a";

        while (word.length() < k) {
            StringBuilder nextWord = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch == 'z') {
                    nextWord.append('a');
                } else {
                    nextWord.append((char)(ch + 1));
                }
            }

            word += nextWord.toString();
        }
        return word.charAt(k - 1);
    }
}