package hangman.code;

/**
 * Class for Food Category
 * 
 * @author Hangman
 */
class Food extends Category {
	/**
	 * Constructor for Food Category
	 */
	public Food() {
		super("Foods");

		String words[] = {
				"Nasi goreng", "Gado gado", "Satay", "Bakso", "Mie goreng", "Rendang", "Sate",
				"Oxtail soup", "Nasi kuning", "Nasi campur", "Soto", "Ayam goreng", "Tempeh", "Tahu", "Martabak",
				"Kue lapis", "Kue putu", "Kue cubit", "Kue pukis", "Kue nastar",
		};

		String hints[] = {
				"A popular Indonesian rice dish made with fried rice, vegetables, and protein, often served with a fried egg and chili sauce on top",
				"An Indonesian salad made with boiled vegetables and rice, served with a peanut sauce dressing",
				"Skewers of marinated meat, grilled and served with a spicy peanut sauce",
				"Indonesian meatball soup, often made with beef or chicken and served with noodles and vegetables",
				"A type of fried noodle dish popular in Indonesia, made with thin egg noodles, vegetables, and protein",
				"A spicy meat dish, typically made with beef and cooked in coconut milk and a mixture of ground spices",
				"Grilled meat skewers, often served with a spicy peanut sauce and rice cakes",
				"A rich and flavorful soup made with oxtail, vegetables, and spices, popular in Indonesia and other Southeast Asian countries",
				"A type of yellow rice often flavored with turmeric and coconut milk, served with various side dishes",
				"A mixed rice dish with a variety of side dishes, including meat, vegetables, and eggs",
				"A type of Indonesian soup made with meat and vegetables, often served with noodles",
				"Fried chicken, a popular dish in Indonesia and many other countries",
				"A protein-rich food made from fermented soybeans, popular in Indonesian cuisine",
				"Fried tofu, a popular protein source in Indonesian and many other Asian cuisines",
				"A type of sweet or savory pastry made with thin layers of dough, popular in Indonesia and other parts of Southeast Asia",
				"A type of multi-layered Indonesian cake, made with a variety of ingredients including coconut and spices",
				"A type of Indonesian steamed cake made with rice flour and coconut milk",
				"A small, deep-fried Indonesian pastry filled with a variety of sweet or savory fillings",
				"A type of small, round Indonesian cake made with flour, coconut milk, and a variety of fillings",
				"A type of Indonesian cookie filled with a pineapple jam filling, often served during holidays",
		};

		for (int i = 0; i < words.length; i++) {
			seed(words[i], hints[i]);
		}
	}
}
