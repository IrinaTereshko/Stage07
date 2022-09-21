import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int usersNumber;

        System.out.println("***The name of the number as a string***");
        do {
            System.out.print("Input number: ");
            usersNumber = scanner.nextInt();
            if (usersNumber <= 0 | usersNumber > 999)
                System.out.println("The number must be between 1 and 999.");

        } while (usersNumber <= 0 | usersNumber > 999);


        int hundreds = 0, tens = 0, units, number;

        units = usersNumber % 10;
        number = usersNumber / 10;
        if (number > 0) {
            tens = number % 10;
            number = number / 10;
        }
        if (number > 0) {
            hundreds = number % 10;
        }

        String hundredsByLetters = "", tensByLetters = "", unitsByLetters = "";

        switch (units) {
            case 1: {
                if (tens == 1)
                    unitsByLetters = "eleven";
                else
                    unitsByLetters = "one";
            }
            break;
            case 2: {
                if (tens == 1)
                    unitsByLetters = "twelve";
                else
                    unitsByLetters = "two";
            }
            break;
            case 3: {
                if (tens == 1)
                    unitsByLetters = "thirteen";
                else
                    unitsByLetters = "three";
            }
            break;
            case 4: {
                if (tens == 1)
                    unitsByLetters = "fourteen";
                else
                    unitsByLetters = "four";
            }
            break;
            case 5: {
                if (tens == 1)
                    unitsByLetters = "fifteen";
                else
                    unitsByLetters = "five";
            }
            break;
            case 6: {
                if (tens == 1)
                    unitsByLetters = "sixteen";
                else
                    unitsByLetters = "six";
            }
            break;
            case 7: {
                if (tens == 1)
                    unitsByLetters = "seventeen";
                else
                    unitsByLetters = "seven";
            }
            break;
            case 8: {
                if (tens == 1)
                    unitsByLetters = "eighteen";
                else
                    unitsByLetters = "eight";
            }
            break;
            case 9: {
                if (tens == 1)
                    unitsByLetters = "nineteen";
                else
                    unitsByLetters = "nine";
            }
            break;
        }

        switch (tens) {
            case 1:
                if (units == 0) tensByLetters = "ten";
                break;
            case 2:
                tensByLetters = "twenty ";
                break;
            case 3:
                tensByLetters = "thirty ";
                break;
            case 4:
                tensByLetters = "forty ";
                break;
            case 5:
                tensByLetters = "fifty ";
                break;
            case 6:
                tensByLetters = "sixty ";
                break;
            case 7:
                tensByLetters = "seventy ";
                break;
            case 8:
                tensByLetters = "eighty ";
                break;
            case 9:
                tensByLetters = "ninety ";
        }

        switch (hundreds) {
            case 1:
                hundredsByLetters = "one hundred";
                break;
            case 2:
                hundredsByLetters = "two hundreds";
                break;
            case 3:
                hundredsByLetters = "three hundreds";
                break;
            case 4:
                hundredsByLetters = "four hundreds";
                break;
            case 5:
                hundredsByLetters = "five hundreds";
                break;
            case 6:
                hundredsByLetters = "six hundreds";
                break;
            case 7:
                hundredsByLetters = "seven hundreds";
                break;
            case 8:
                hundredsByLetters = "eight hundreds";
                break;
            case 9:
                hundredsByLetters = "nine hundreds";

        }
       if (usersNumber % 100 != 0 & usersNumber > 100 )
           hundredsByLetters += " and ";


        String msg;


        msg = "The number as a string: " + hundredsByLetters + tensByLetters + unitsByLetters + ".";

        System.out.print(msg);

    }
}
