

public class BaccaratCard extends Card{
     
    private Rank rank;
    private Suit suit;
    

    public BaccaratCard(Rank rank, Suit suit){
        super(rank, suit);        
        
    }

    public Rank getRank(){
        return super.getRank();
    }

    public Suit getSuit(){
        return super.getSuit();
    }

    public String toString(){
        return String.format("%c%c", rank.getSymbol(), suit.getSymbol());
    }
    
    public boolean equals(Object other){
        if (this == other) {
            return true;
        }
        if (other instanceof BaccaratCard) {
            BaccaratCard otherCard = (BaccaratCard) other;
            return rank == otherCard.rank && suit == otherCard.suit;
        }
        return false;
    }

    public int compareTo(BaccaratCard other){
        int difference = suit.compareTo(other.suit);

        if (difference == 0) {
          difference = rank.compareTo(other.rank);
        }
        return difference;
    }

    public int value(){
        return Math.min(rank.ordinal() + 1, 10);
    }
    
}