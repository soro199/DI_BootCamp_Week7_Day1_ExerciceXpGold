import Exercice1.Rectangle;
import Exercice1.Shape;
import Exercice1.Square;
import Exercise2.Deck;
import Exercise3.SinglePlayingCard;

import static Exercise3.Deck.CLUBS;
import static Exercise3.Deck.FIVE;


/*
*@author Konate-MK
*/

public class Main {
    //Exercice1
    public static void main(String[] args) {
        Shape rectangle1 = new Rectangle(10,24);
        System.out.println("La surface du rextangle est: " + rectangle1.getArea());

        Shape square1 = new Square(20);
        System.out.println("La surface du carré est: " + square1.getArea());

        //Exercice2
        Deck deck =  new Deck();
        System.out.println(deck.cards.toString());

        //Exercice3
        SinglePlayingCard card = new SinglePlayingCard(FIVE, CLUBS);
        System.out.println(card.toString());
    }
}
