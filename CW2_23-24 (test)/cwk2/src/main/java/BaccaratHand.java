import java.util.LinkedList;
import java.util.List;

// TODO: Implement the BaccaratHand class in the file


public class BaccaratHand extends CardCollection {

    private List<BaccaratCard> baccaratHand;

    public BaccaratHand() {
        baccaratHand = new LinkedList<>();
    }



    public String toString() {
        StringBuilder str = new StringBuilder();
        for (BaccaratCard baccaratCard: baccaratHand) {
            str.append(baccaratCard.toString()).append(" ");
        }
        return str.toString();
    }
}