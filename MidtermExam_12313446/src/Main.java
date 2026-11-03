import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        CardStack deck = new CardStack();
        CardStack discardPile = new CardStack();
        ArrayList<Card> hand = new ArrayList<Card>();

        String[] names = {"Fireball", "Shield", "Healing Potion", "Lightning", "Sword", "Dragon"};

        for (int i = 0; i < 30; i++) {
            String randomName = names[random.nextInt(names.length)];
            deck.push(new Card(randomName));
        }

        int turn = 1;
        while (!deck.isEmpty()) {
            int command = random.nextInt(3);   // 0 = draw, 1 = discard, 2 = get from discard pile
            int x = random.nextInt(5) + 1;     // 1 to 5

            System.out.println("Turn " + turn);

            if (command == 0) {
                int cardsToDraw = Math.min(x, deck.size());
                System.out.println("Command: Draw " + cardsToDraw + " card(s)");
                for (int i = 0; i < cardsToDraw; i++) {
                    hand.add(deck.pop());
                }
            } else if (command == 1) {
                int cardsToDiscard = Math.min(x, hand.size());
                System.out.println("Command: Discard " + cardsToDiscard + " card(s)");
                for (int i = 0; i < cardsToDiscard; i++) {
                    Card discarded = hand.remove(hand.size() - 1);
                    discardPile.push(discarded);
                }
            } else {
                int cardsToGet = Math.min(x, discardPile.size());
                System.out.println("Command: Get " + cardsToGet + " card(s) from the discard pile");
                for (int i = 0; i < cardsToGet; i++) {
                    hand.add(discardPile.pop());
                }
            }

            System.out.println("Hand: " + hand);
            System.out.println("Cards left in deck: " + deck.size());
            System.out.println("Cards in discard pile: " + discardPile.size());
            System.out.println();

            turn++;
        }

        System.out.println("The deck is empty. Game over.");
    }
}