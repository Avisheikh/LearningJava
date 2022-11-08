package Array;

/*
    Author       :- Avi-sheikh 
    Created Date :- 08/11/2022 
*/
public class DecksOfCards {

    public static void main(String[] args) {
        int[] deck = new int[51];

        String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

        //Initializing the cars
        for(int i=0; i<deck.length; i++) {
            deck[i]=i;
        }

        //Shuffle the cards
        for(int i=0; i<deck.length; i++) {
            //Generate an index randomly
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        for(int i=0; i<4; i++) {
            String suit = suits[deck[i]/13];
            String rank = ranks[deck[i]%13];
            System.out.println("Card number " + deck[i] + ": "
                    + rank + " of " + suit);
        }

        //Will the program pick four random cards if you replace lines 22-27 in Listing 7.2 DeckOfCards.java with the following code?
        for (int i = 0; i < 4; i++) {
            int cardNumber = (int)(Math.random() * deck.length);
            String suit = suits[cardNumber / 13];
            String rank = ranks[cardNumber % 13];
            System.out.println("Card number " + cardNumber + ": "
                    + rank + " of " + suit);
        }

        // No. You may have the same card appearing more than once.
        // Example if i=0 then the cardnumber has been initialize to 2
        // if i=q then the cardnumber can be again initialize to 2;

    }

}
