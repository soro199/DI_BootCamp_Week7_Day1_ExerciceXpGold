package Exercise3;


/*
*@author SORO
*/

public class SinglePlayingCard {
    private int rank;
    private int suit;

    public SinglePlayingCard(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "SinglePlayingCard{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }
}
