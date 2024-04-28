
import java.util.Collections;


public class Shoe extends CardCollection{
    private int numOfDecks;
    public Shoe (int numDecks){
        super();
        this.numOfDecks = numDecks;
        if (numDecks == 6 || numDecks == 8){
            for (int i = 0; i < numDecks; i++){
                for (Card.Suit suit: Card.Suit.values()){
                    for (Card.Rank rank: Card.Rank.values()){
                        cards.add(new BaccaratCard(rank, suit));
                    }
                }
            }
            
        }else{
            throw new CardException("Invalid number of decks");
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card deal(){
        
        if (cards.size() == 0){
            throw new CardException("No cards left in the shoe");
        }
       return cards.remove(0);
    }
}
