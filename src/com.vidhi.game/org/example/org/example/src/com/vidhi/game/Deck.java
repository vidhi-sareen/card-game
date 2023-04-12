import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private static Deck instance;
    private ArrayList<Card> deck;

    /*
     * Deck creation and shuffling will
     * be done simultaneously as we create the Deck
     * Object.
     */

    private Deck() {
        // creating the deck.
        deck = new ArrayList<>();
        for (Suits suits : Suits.values()) {

            for (int i = 1; i <= 13; i++) {
                deck.add(new Card(i, suits));
            }

        }
        // shuffling the deck as well
        Collections.shuffle(deck);

    }

    /*
     * Singleton pattern to ensure that only one
     * instance of the Deck object is created.
     */

    public static Deck getInstance() {
        if (instance == null) {
            instance = new Deck();
        }
        return instance;
    }

    /*
     * For getting the ArrayList of Deck.
     */

    public ArrayList<Card> getDeck() {
        return deck;
    }

}
