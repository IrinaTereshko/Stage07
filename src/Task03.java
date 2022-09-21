import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char letter;

        do {
            System.out.print("Input your letter: ");
            letter = scanner.next().charAt(0);
            if (!Character.isLetter(letter))
                System.out.println("This is not a letter.");
        }
        while (!Character.isLetter(letter));

        switch (letter){
            case 'a':
            case 'e':
            case 'y':
            case 'u':
            case 'i':
            case 'o':
            case 'A':
            case 'E':
            case 'Y':
            case 'U':
            case 'I':
            case 'O':
                System.out.println("This letter is vowel.");
                break;
            default: System.out.println("This letter is consonant.");
        }
    }
}
