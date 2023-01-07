package hangman.code;

/**
 * Class for City Category
 * 
 * @author Hangman
 */
class City extends Category {
	/**
	 * Constructor for City Category
	 */
	public City() {
		super("Cities");

		// seed words
		seed("Kediri",
				"Indonesian city, located near the Brantas River in the province of East Java on the island of Java, The oldest city in Indonesia");
		seed("Jakarta", "The capital and largest city of Indonesia, located on the northwest coast of Java island");
		seed("Medan", "The largest city on the island of Sumatra, known for its diverse culture and history");
		seed("Surabaya",
				"The second largest city in Indonesia and the capital of East Java province, known for its close proximity to Mount Bromo and the Ijen volcano");
		seed("Malang",
				"A city in East Java known for its cooler temperatures and many educational institutions, including the University of Muhammadiyah Malang");
		seed("Yogyakarta",
				"A city in Central Java known for its ancient Javanese culture and historical sites, such as the temple complex of Borobudur");
		seed("Bandung",
				"A city in West Java known for its cooler temperatures and many universities, including the Bandung Institute of Technology");
		seed("Semarang",
				"A city in Central Java known for its Dutch colonial architecture and the Sam Poo Kong temple");
		seed("Palembang", "The capital city of South Sumatra province, located on the Musi River");
		seed("Makassar",
				"The capital city of South Sulawesi province, known for its cultural diversity and Makassar Strait");
		seed("Denpasar",
				"The capital of the province of Bali, known for its beautiful beaches and cultural attractions");
		seed("Pekanbaru", "The capital of Riau province, located on the eastern coast of Sumatra");
		seed("Manado",
				"The capital of North Sulawesi province, known for its dive sites and Bunaken National Marine Park");
		seed("Balikpapan", "A city in East Kalimantan known for its oil and natural gas industries");
		seed("Banjarmasin", "The capital of South Kalimantan province, located on the Barito River");
		seed("Ambon", "The capital of Maluku province, known for its history as a major spice trading port");
		seed("Mataram", "The capital of the province of Lombok, known for its beaches and Mount Rinjani national park");
		seed("Sorong",
				"The capital of the province of West Papua, located on the northwest coast of the island of New Guinea");
		seed("Tarakan", "A city in East Kalimantan known for its oil and natural gas industries");
		seed("Ternate",
				"A small island in the Maluku Islands, known for its historic role as a major spice trading port");
		seed("Toraja", "This place has the statue of yesus the most biggest in world");
	}
}
