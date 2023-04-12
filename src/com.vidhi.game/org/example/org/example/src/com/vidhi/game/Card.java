public class Card {

    private int number;
    private Suits suit;
    private String color;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public Suits getSuit() {
        return suit;
    }

    public String getColor() {
        return color;
    }

    Card() {

    }

    public Card(int num, Suits s, String c) {
        number = num;
        suit = s;
        color = c;
    }

    public String toString() {
        return number + " " + suit + " " + color;
    }

}
