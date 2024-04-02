import java.util.LinkedList;
import java.util.List;

// TODO: Implement the BaccaratHand class in the file


public class BaccaratHand extends CardCollection {
    
    private List<BaccaratCard> baccaratHand;

    public BaccaratHand() {
        baccaratHand = new LinkedList<>();
    }
    
    
    public int value() {
        int sum = 0;
        for (BaccaratCard baccaratCard: baccaratHand) {
            sum += baccaratCard.value();
        }
        return sum;
    }
    
    public boolean isNatural() {
        if (value() == 8 || value() == 9 && size() == 2){
            return true;
        }
        return false;
    }
    

    public String toString() {
        String str = "";
        for (BaccaratCard baccaratCard: baccaratHand) {
            str += baccaratCard.toString() + " ";
        }
        return str;
    }
}