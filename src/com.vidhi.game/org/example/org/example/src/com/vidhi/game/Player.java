import java.util.HashSet;
import java.util.Set;

public class Player {

    private int id;
    // cards which players will be having in their hand.
    private Set<Card> cards = new HashSet<>();

    // Player constructor with passing as his id in parameter.
    public Player(int id) {
        this.id = id;
    }
    
    /*
     * this is for adding card to the player's
     * hand after if the card is not matched with the top of
     * discard pile or after any action card (Q,J) played by the
     * previous player.
     */
    public void addCard(Card card) {
        cards.add(card);
    }

    /*
     * This is to remove the card from the player's hand
     * when any of the player's card matches with the
     * top of the discard pile.
     */
    public boolean removeCard(Card card) {
        return cards.remove(card);
    }

    // to get the id of the player
    public int getId() {
        return id;
    }

    // to get the player's hands cards.
    public Set<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(" ");
        sb.append(cards.toString());
        return sb.toString();
    }
}
