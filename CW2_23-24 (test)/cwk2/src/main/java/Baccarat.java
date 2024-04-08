
import java.util.Scanner;

public class Baccarat{

    public static void main(String[] args) {
        int playerWins = 0;
        int bankerWins = 0;
        int ties = 0;
        int rounds = 1;
        int player3CardValue = 0;
        Boolean anotherRound = true;

        
       
        
        while (anotherRound == true) {
            System.out.println("Round " + rounds++);
            BaccaratHand player = new BaccaratHand();
            BaccaratHand banker = new BaccaratHand();

            Shoe shoe = new Shoe(6);
            shoe.shuffle();
            
            for (int i = 0; i < 2; i++) {
                player.add(shoe.deal());
                banker.add(shoe.deal());
            }

        
            System.out.println("Player: " + player + " = " + player.value());
            System.out.println("Banker: " + banker + " = " + banker.value());

            //NATURAL RULES
            if (banker.isNatural() || player.isNatural()) {
                if (player.isNatural() && banker.isNatural()) {
                    System.out.println("Tie");
                    ties++;
                } else if (player.isNatural()) {
                    System.out.println("Player has a natural");
                    System.out.println("Player wins");
                    playerWins++;
                } else {
                    System.out.println("Banker has a natural");
                    System.out.println("Banker wins");
                    bankerWins++;
                }
            } else {

            //THIRD CARD RULES

                if (player.value() <= 5 || banker.value() <= 5){
                    Card player3Card = shoe.deal();
                    player.add(player3Card);
                    System.out.println("Dealing another card to player ...");
                    player3CardValue = player3Card.value();

                    banker.add(shoe.deal());
                    System.out.println("Dealing another card to banker ...");


                    System.out.println("Player: " + player + " = " + player.value());
                    System.out.println("Banker: " + banker + " = " + banker.value());

                }
              
                //BANKER THIRD CARD RULES

                if (player.size() == 3 && banker.size() != 3) {
                
                    if (banker.value() <=2 ){
                        banker.add(shoe.deal());
                        System.out.println("Dealing another card to banker ...");
                    }else if (banker.value() == 3 && player3CardValue !=8){
                        banker.add(shoe.deal());
                        System.out.println("Dealing another card to banker ...");
                    }else if (banker.value() == 4 && (player3CardValue >= 2 && player3CardValue <= 7)){
                        banker.add(shoe.deal());
                        System.out.println("Dealing another card to banker ...");
                    }else if (banker.value() == 5 && (player3CardValue >= 4 && player3CardValue <= 7)){
                        banker.add(shoe.deal());
                        System.out.println("Dealing another card to banker ...");
                    }else if (banker.value() == 6 && (player3CardValue == 6 || player3CardValue == 7)){
                        banker.add(shoe.deal());
                        System.out.println("Dealing another card to banker ...");
                    }
                }

                //WIN conditions for not naturals 

                if (player.value() > banker.value()) {
                    System.out.println("Player wins");
                    playerWins++;
                } else if (player.value() < banker.value()) {
                    System.out.println("Banker wins");
                    bankerWins++;
                } else {
                    System.out.println("Tie");
                    ties++;
                }
                
            }

           
        
            
            //NEW ROUND CONDTIONS 
            Scanner input = new Scanner(System.in);
            System.out.println("Another round? (y/n)");
            String response = input.next();
            if (response.equals("n") || response.equals("N")) {
                anotherRound = false;
            }
        }

        
        System.out.println("\nPlayer wins: " + playerWins);
        System.out.println("Banker wins: " + bankerWins);
        System.out.println("Ties: " + ties);
        System.out.println("Rounds: " + (rounds - 1));
    

    }
}