

public class BaccaratCard extends Card
{
     
    public BaccaratCard(Card.Rank rank, Card.Suit suit){
        super(rank, suit);       
        
    }
    
    @Override
    public int value(){
        // If the card is a 10, J, Q, or K, it is worth 0 points
        return super.value() % 10;
    }
}