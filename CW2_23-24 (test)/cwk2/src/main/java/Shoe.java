
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class Shoe extends CardCollection{

    private List<BaccaratCard> baccaratCards;
    private int numDecks;

    public Shoe(int numDecks) {
        if(numDecks != 6 || numDecks != 8){
            throw new CardException("Number of decks must be 6 or 8");
        }
        else { 
            this.numDecks = numDecks;
            baccaratCards = new LinkedList<>();
            for(int i = 0; i < numDecks; i++){
                for(int j = 1; j <= 52; j++){ 
                    for(Card.Suit suit: Card.Suit.values()){
                        for(Card.Rank rank: Card.Rank.values()){
                            baccaratCards.add(new BaccaratCard(rank, suit));
                        }
                    }
                }
            }
        }
    }

    public int size() {
        return baccaratCards.size();
    }

    public void shuffle() {
        Collections.shuffle(baccaratCards);

    }   

    public BaccaratCard deal() {
        if(baccaratCards.size() > 0){
            throw new CardException("No cards left in the shoe");
        }
        else {
            return baccaratCards.remove(0);
        }
        
    }
}
