import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayQueue queue = new ArrayQueue(10);

        int nextPlayerId = 1;
        int turn = 1;
        int gamesMade = 0;

        while (gamesMade < 10) {
            int x = random.nextInt(7) + 1;   // 1 to 7

            System.out.println("Turn " + turn);
            System.out.println(x + " player(s) joined the queue:");

            for (int i = 0; i < x; i++) {
                Player player = new Player(nextPlayerId, "Player" + nextPlayerId, random.nextInt(100) + 1);
                queue.add(player);
                System.out.println("  " + player);
                nextPlayerId++;
            }

            System.out.println("Players in queue: " + queue.size());

            if (queue.size() >= 5) {
                gamesMade++;
                System.out.println("Game " + gamesMade + " started with:");
                for (int i = 0; i < 5; i++) {
                    System.out.println("  " + queue.remove());
                }
                System.out.println("Players left in queue: " + queue.size());
            } else {
                System.out.println("Not enough players to start a game.");
            }

            System.out.println("Press Enter to end the turn...");
            scanner.nextLine();
            System.out.println();

            turn++;
        }

        System.out.println("10 games have been made. Program ended.");
    }
}