package hangman.code;

/**
 * Class for Hangman Score
 * 
 * @author Hangman
 */
public class Score implements Comparable<Score> {
    // declare variables
    public final String name;
    public final int score;

    /**
     * Constructor for Hangman Score
     * 
     * @param name  name
     * @param score score
     */
    public Score(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /**
     * Compare to score
     * 
     * @param score score
     * @return 0 if equal, 1 if greater, -1 if less
     */
    @Override
    public int compareTo(Score score) {
        return this.score - score.score;
    }

    /**
     * String representation of score
     * 
     * @return string representation of score
     */
    @Override
    public String toString() {
        return name + " - " + score;
    }
}