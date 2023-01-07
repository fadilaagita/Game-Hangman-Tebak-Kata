package hangman.code;

/**
 * Class for Fruit Category
 * 
 * @author Hangman
 */
class Fruit extends Category {
	/**
	 * Constructor for Fruit Category
	 */
	public Fruit() {
		super("Fruits");

		String words[] = {
				"Apple", "Orange", "Dragon fruit", "Mango", "Watermelon", "Pineapple", "Durian",
				"Jackfruit", "Grappe", "Strawberry", "Blueberry", "Raspberry", "Lychee", "Kiwi fruit",
				"Plum", "Peach", "Papaya", "Lemon", "Guava", "Banana", "Coconut",
		};

		String hints[] = {
				 
				"A fruit of various citrus species in the family rutaceae",
				"Is the fruit of several different cactus species indigenous to the americas.",
				"An edible stone fruit produced by the tropical tree mangifera indica. it is believed to have originated between northwestern myanmar, bangladesh, and northeastern india.",
				"A flowering plant species of the cucurbitaceae family and the name of its edible fruit. has green skin and red inside",
				"A tropical plant with an edible fruit, the most economically significant plant in the family bromeliaceae. has like spike in the skin",
				"Is a popular fruit, thanks to its unique shape and distinctive aroma, and prickly",
				"Is a species of tree in the fig, mulberry, and breadfruit family. ",
				"Is a fruit, botanically a berry, of the deciduous woody vines of the flowering plant genus vitis.",
				"Is actually a multiple fruit which consists of many tiny individual fruits embedded in a fleshy receptacle.",
				"Are a widely distributed and widespread group of perennial flowering plants with blue or purple berries. they are classified in the section cyanococcus within the genus vaccinium.",
				"Is an aggregate fruit, meaning it has many parts joined together. it is similar to a blackberry, but the fruit is hollow on the inside.",
				"Is a monotypic taxon and the sole member in the genus litchi in the soapberry family, sapindaceae.",
				"Is the edible berry of several species of woody vines in the genus actinidia.",
				"Is a fruit of some species in prunus subg. prunus",
				"Is a deciduous tree first domesticated and cultivated in zhejiang province of eastern china.",
				"Is the plant species carica papaya, one of the 21 accepted species in the genus carica of the family caricaceae.",
				"Is a yellow citrus fruit. it is related to the orange.",
				"Is a common tropical fruit cultivated in many tropical and subtropical regions",
				"Is an elongated, edible fruit-botanically a berry-produced by several kinds of large herbaceous flowering plants in the genus musa.",
				"Is a fibrous one-seeded drupe, also known as a dry drupe.",
		};

		for (int i = 0; i < words.length; i++) {
			seed(words[i], hints[i]);
		}
	}
}
