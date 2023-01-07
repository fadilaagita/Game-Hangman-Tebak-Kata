// set package name
package hangman.code;

// import libraries
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Hangman Game With various categories
 * 
 * categories:
 * - Animals
 * - City
 * - Food
 * - Fruit
 *
 * Apply OOP concepts to create a Hangman game
 * Each item has word, and hint
 */

/**
 * Class for Hangman
 * 
 * @author Hangman
 */
public class App {
    // declare variables
    private static List<Category> categories = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    // constants
    private static final int COUNT = 3; // number of words to guess
    private static final int INITIAL = 500; // initial score
    private static final int PENALTY = 50; // penalty for wrong guess
    private static final int REWARD = 500; // reward for correct guess

    /**
     * Function to seed categories
     */
    private static void seed() {
        // add categories
        categories.add(new Animal());
        categories.add(new Food());
        categories.add(new City());
        categories.add(new Fruit());
    }

    /**
     * Function to display message
     * 
     * @param message message
     * @param any     any
     */
    public static void message(String message, Object any) {
        System.out.printf("%-30s: %s\n", message, any);
    }

    /**
     * Function to display prompt
     * 
     * @param string message
     */
    public static void message(String message) {
        System.out.printf("%-30s: ", message);
    }

    /**
     * Function to play game
     */
    private static void getcategories() {
        // loop control
        boolean loop = true;

        while (loop) {
            // print all categories
            System.out.println("List of Categories");

            // check if categories is empty
            if (categories.isEmpty()) {
                System.out.println("No categories");
                break;
            }

            // loop through categories
            int count = 1;
            for (Category category : categories) {
                System.out.println((count++) + ". " + category);
            }
            System.out.println((count++) + ". Random");
            System.out.println((count++) + ". Back");

            // get category
            message("Enter choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            // check if category is valid
            if (choice < 1 || choice > count) {
                System.out.println("Invalid choice\n");
                continue;
            }

            // check if back is selected
            if (choice == count - 1) {
                loop = false;
                continue;
            }

            // newline
            if (loop)
                System.out.println();

            // check if random is selected
            if (choice == count - 2) {
                // if categories only has one category
                if (categories.size() == 1) {
                    play(categories.get(0));
                    continue;
                }

                // get random category
                int index = random.nextInt(categories.size());
                play(categories.get(index));
                continue;
            }

            // play game
            play(categories.get(choice - 1));
        }
    }

    /**
     * Function to play game
     * 
     * @param category
     */
    private static void play(Category category) {
        // variable for score
        String name;
        int score = INITIAL;

        // get name
        message("Player Name");
        name = scanner.nextLine();

        // get words from category
        List<Word> words = category.getRandomWords(COUNT);
        Iterator<Word> iterator = words.iterator();

        // loop control variable
        boolean gameover = false;

        // stage
        int stage = 0;

        // newline
        System.out.println();

        // loop until loop is false
        while (!gameover) {
            // incement stage
            stage++;

            // get word
            Word word = iterator.next();

            // List of characters
            List<Character> guesses = new ArrayList<>();

            // boolean for if word is guessed
            boolean guessed = false;

            // loop until guessed is true
            while (!guessed) {
                // print word
                message("Category", category);
                message("Stage", stage);
                message("Hangman", word.getFormattedWord(guesses));
                message("Score", score);
                message("Hint", word.getHint());

                // get input
                message("Guess a character");
                String temp = scanner.nextLine();

                // newline
                System.out.println();

                // check if input is empty
                if (temp.isEmpty()) {
                    System.out.println("Please enter a character\n");
                    continue;
                }

                // get first character
                char input = temp.charAt(0);

                // uppercase input
                input = Character.toUpperCase(input);

                // check if input is valid
                if (guesses.contains(input)) {
                    System.out.println("You already guessed that character\n");
                    continue;
                }

                // add input to characters
                guesses.add(input);

                // check if input is in word
                if (word.isGuessed(guesses)) {
                    // word is guessed
                    guessed = true;
                    score += REWARD;
                    message("Correct Word", word.getWord());
                    System.out.println("Congratulations! You guessed the word!");

                    // check if there are more words
                    if (!iterator.hasNext()) {
                        // no more words
                        System.out.println();
                        gameover = true;
                        break;
                    }
                }

                // check if input is in word
                if (!word.contains(input)) {
                    // input is not in word
                    System.out.println("Sorry, that character is not in the word");
                    score -= PENALTY;
                }

                // if score below 0
                if (score <= 0) {
                    // game over
                    message("Correct Word", word.getWord());
                    System.out.println("Your score is " + score + "/n");
                    gameover = true;
                    break;
                }

                // newline
                System.out.println();
            }
        }

        // add score
        category.addScore(new Score(name, score));
    }

    /**
     * Function to print scores
     */
    private static void printScores() {
        // loop through categories
        for (Category category : categories) {
            // print category
            System.out.println(category);

            // print scores
            category.printScores();

            // newline if not last category
            if (categories.indexOf(category) != categories.size() - 1)
                System.out.println();
        }
    }

    public static void main(String[] args) {
        // seed categories
        seed();

        // variable loop control
        boolean loop = true;

        // loop until loop is false
        while (loop) {

            // print menu
            System.out.println("Welcome to Hangman!");
            System.out.println("1. Play");
            System.out.println("2. Scores");
            System.out.println("3. Exit");

            // get input
            message("Enter choice");
            int input = scanner.nextInt();
            scanner.nextLine();

            // if input valid and not 3, newline
            if (input >= 1 && input <= 3)
                System.out.println();

            // check input
            switch (input) {
                case 1:
                    // play game
                    getcategories();
                    break;
                case 2:
                    // print scores
                    printScores();
                    break;
                case 3:
                    // exit
                    System.out.println("Exiting Program...");
                    loop = false;
                    break;
                default:
                    // invalid input
                    System.out.println("Invalid input");
                    break;
            }

            if (loop) {
                // newline
                System.out.println();
            }
        }
    }
}