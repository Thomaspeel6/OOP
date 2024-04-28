
public class BaccaratHand extends CardCollection {


    public BaccaratHand(){
        super();
    }

    @Override
    public int value(){
        int sum = 0;
        for (Card card: cards) {
            sum += card.value();
        }
        return sum % 10;
    }

    public Boolean isNatural(){
        if (cards.size() == 2 && (value() == 8 || value() == 9)) {
            return true;
        }
        return false;
    }


    public String toString() {
        String handString = "";
        for (Card card: cards ) {

            handString += card.toString();
            /*
            Add a space between cards only if its not hte last
            card so there is not a trailing space
             */
            if (cards.indexOf(card) != cards.size() - 1) {
                handString += " ";
            }
        }
        return handString;
    }
}