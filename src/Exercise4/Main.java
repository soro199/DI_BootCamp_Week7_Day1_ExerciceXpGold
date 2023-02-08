package Exercise4;


/*
*@author SORO
*/

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card card1 = new Card(Deck.SEVEN, Deck.DIAMONDS);
        Card card2 = new Card(Deck.THREE, Deck.CLUBS);
        Card card3 = new Card(Deck.KING, Deck.SPADES);

        deck.addCard(card1);
        deck.addCard(card2);
        deck.addCard(card3);

        deck.displayCards();
    }
}
