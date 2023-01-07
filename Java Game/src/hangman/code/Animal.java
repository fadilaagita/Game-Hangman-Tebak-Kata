package hangman.code;

/**
 * Class for Animal Category
 * 
 * @author Hangman
 */
class Animal extends Category {
	/**
	 * Constructor for Animal Category
	 */
	public Animal() {
		super("Animals");

		String words[] = {
				"Elephant", "Tiger", "Orangutan", "Komodo dragon", "Proboscis monkey", "Binturong",
				"Clouded leopard", "Sun bear", "Javan rhinoceros", "Anoa", "Banteng", "Siamang", "Dhole",
				"Javan lutung", "Sunda colugo", "Bactrian camel", "Gaur", "Javan muntjac", "Sambar deer",
				"Asian golden cat",
		};

		String hints[] = {
				"A large herbivorous mammal with a trunk and large ears, native to parts of Africa and Asia including Indonesia",
				"A large carnivorous feline found in a variety of habitats in Asia, including the rainforests of Indonesia",
				"An ape found in the rainforests of Borneo and Sumatra, known for their intelligence and close genetic relationship to humans",
				"A large reptile native to the Indonesian island of Komodo and several nearby islands, known for their venomous bite",
				"A type of monkey found on the island of Borneo, known for their distinctive large noses and long tails",
				"A carnivorous mammal found in the rainforests of Southeast Asia, also known as the bearcat",
				"A small wild cat found in the forests of Southeast Asia, including Indonesia",
				"A small bear native to the rainforests of Southeast Asia, including parts of Indonesia",
				"A critically endangered species of rhinoceros found in the rainforests of Java, Indonesia",
				"A species of buffalo found on the islands of Sulawesi and Buton in Indonesia",
				"A species of wild cattle found in the grasslands and forests of Southeast Asia, including parts of Indonesia",
				"A type of gibbon found in the rainforests of Sumatra and Malaysia",
				"A pack-hunting carnivorous mammal found in Central and South Asia, as well as parts of Indonesia",
				"A type of primate found in the rainforests of Java and Bali, also known as the Javan langur",
				"A nocturnal arboreal mammal found in the rainforests of Southeast Asia, including parts of Indonesia",
				"A type of camel found in the deserts and steppes of Central Asia, introduced to parts of Indonesia in the 19th century",
				"A large wild cattle species found in the grasslands and forests of South and Southeast Asia, including parts of Indonesia",
				"A species of deer found in the forests of Java and Bali, Indonesia",
				"A species of deer found in the forests of Southeast and South Asia, including parts of Indonesia",
				"A small wild cat found in the forests of Central and Southeast Asia, including parts of Indonesia",
		};

		// seed words
		for (int i = 0; i < words.length; i++) {
			seed(words[i], hints[i]);
		}
	}
}
