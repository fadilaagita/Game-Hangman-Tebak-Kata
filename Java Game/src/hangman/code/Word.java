package hangman.code;

import java.util.List;

/**
 * Class for Word and Hint
 *
 * @author Hangman
 */
public class Word {
    // declare variables
    private String word;
    private String hint;

    /**
     * Constructor for Word and Hint
     * 
     * @param word word
     * @param hint hint
     */
    public Word(String word, String hint) {
        this.word = word.toUpperCase();
        this.hint = hint;
    }

    /**
     * Get word
     * 
     * @return word
     */
    public String getWord() {
        return word;
    }

    /**
     * Get hint
     * 
     * @return hint
     */
    public String getHint() {
        return hint;
    }

    /**
     * Get formatted word
     * 
     * @param guessed guessed letters
     * @return formatted word
     * @example Hello -> _ _ _ _ _
     */
    public String getFormattedWord(List<Character> guessed) {
        // declare variables
        StringBuilder output = new StringBuilder();

        // loop through word, handle space
        for (int i = 0; i < word.length(); i++) {
            // handle space
            if (word.charAt(i) == ' ') {
                output.append("  ");
                continue;
            }

            // get character
            char letter = Character.toUpperCase(word.charAt(i));

            // check if character is guessed
            if (guessed.contains(letter))
                output.append(letter);
            else
                output.append("_");

            // add space
            output.append(" ");
        }

        // return output
        return output.toString();
    }

    /**
     * Check if word is guessed
     * 
     * @param guessed guessed letters
     * @return true if word is guessed
     */
    public boolean isGuessed(List<Character> guessed) {
        // loop through word
        for (int i = 0; i < word.length(); i++) {
            // skip space
            if (word.charAt(i) == ' ') {
                continue;
            }

            // get character
            char c = Character.toUpperCase(word.charAt(i));

            // check if character is guessed
            if (!guessed.contains(c)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Check if word contains character
     * 
     * @param c character
     * @return true if word contains character
     */
    public boolean contains(char c) {
        return word.contains(Character.toString(c));
    }
}
