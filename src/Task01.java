import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        int card, suit;
               Scanner scanner = new Scanner(System.in);

        do {
            System.out.print(" Input a card: ");
            card = scanner.nextInt();
            System.out.print("Input a suit: ");
            suit = scanner.nextInt();
            if (card < 1 | card > 14)
                System.out.println(" Non-existent card!");
            if (suit < 1 | suit > 4)
                System.out.println(" Non-existent suit!");
        }
        while (card < 1 | card > 14 | suit < 1 | suit > 4);

        String cardByLetters = "one", suitByLetters = "spades";

        switch (card) {
            case 2:
                cardByLetters = "two";
                break;
            case 3:
                cardByLetters = "three";
                break;
            case 4:
                cardByLetters = "four";
                break;
            case 5:
                cardByLetters = "five";
                break;
            case 6:
                cardByLetters = "six";
                break;
            case 7:
                cardByLetters = "seven";
                break;
            case 8:
                cardByLetters = "eight";
                break;
            case 9:
                cardByLetters = "nine";
                break;
            case 10:
                cardByLetters = "ten";
                break;
            case 11:
                cardByLetters = "jack";
                break;
            case 12:
                cardByLetters = "queen";
                break;
            case 13:
                cardByLetters = "king";
                break;
            case 14:
                cardByLetters = "ace";
        }

        switch (suit) {
            case 2:
                suitByLetters = "clubs";
                break;
            case 3:
                suitByLetters = "diamonds";
                break;
            case 4:
                suitByLetters = "hearts";
        }
        System.out.println(" Your card is " + cardByLetters + " of " + suitByLetters + ".");
    }
}
