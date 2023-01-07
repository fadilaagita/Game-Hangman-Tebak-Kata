package hangman.code;

import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

/**
 * Abstract class for Categories
 * 
 * @author Hangman
 */
public abstract class Category {
    // declare variables
    protected final String CATEGORY;
    protected final List<Word> WORDS;
    protected List<Score> scores;

    /**
     * Constructor for Category
     * 
     * @param category category
     */
    public Category(String category) {
        this.CATEGORY = category;
        this.WORDS = new ArrayList<>();
        this.scores = new ArrayList<>();
    }

    /**
     * Get random words from category
     * 
     * @param count number of words
     * @return random words
     */
    public List<Word> getRandomWords(int count) {
        // check if count is greater than words
        if (count > WORDS.size()) {
            return WORDS;
        }

        // declare variables
        List<Word> output = new ArrayList<>();
        Random random = new Random();

        // loop through count, make sure to not add duplicate words, but dont change any
        // words
        for (int i = 0; i < count; i++) {
            // get random index
            int index = random.nextInt(WORDS.size());

            // get word
            Word word = WORDS.get(index);

            // check if word is already added
            if (output.contains(word)) {
                i--;
                continue;
            }

            // add word to output
            output.add(word);
        }

        // return output
        return output;
    }

    /**
     * Add word to category
     * 
     * @param word word
     * @param hint hint
     */
    public void seed(String word, String hint) {
        // add word to words
        WORDS.add(new Word(word, hint));
    }

    /**
     * Print scores
     */
    public void printScores() {
        // check if scores is empty
        if (scores.isEmpty()) {
            System.out.println("No scores yet");
            return;
        }

        // sort scores
        Collections.sort(scores);

        // print scores
        for (int i = 0; i < scores.size(); i++) {
            System.out.println((i + 1) + ". " + scores.get(i));
        }
    }

    /**
     * String representation of category
     * 
     * @return string representation of category
     */
    @Override
    public String toString() {
        return CATEGORY;
    }

    /**
     * Function to add score
     * 
     * @param score score
     */
    public void addScore(Score score) {
        // add score to scores
        scores.add(score);
    }
}
