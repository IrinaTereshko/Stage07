import java.util.Scanner;

public class Task05_2 {
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

        for (int i = 1; i <=9; i++) {
           switch (i) {
               case 1:
               {if (units==i) unitsByLetters = "one";
                   if (units == i & tens == 1) unitsByLetters = "eleven";
               if (tens == i & units == 0) tensByLetters = "ten";
               if (hundreds==i) hundredsByLetters = "one hundred";
               }
               break;
                              case 2:
               {if (units==i) unitsByLetters = "two";
                   if (units == i & tens == 1) unitsByLetters = "twelve";
                   if (tens == i) tensByLetters = "twenty ";
                   if (hundreds==i) hundredsByLetters = "two hundreds";
               }
               break;
               case  3:
               {if (units==i) unitsByLetters = "three";
                   if (units == i & tens == 1) unitsByLetters = "thirteen";
                   if (tens == i) tensByLetters = "thirty ";
                   if (hundreds==i) hundredsByLetters = "three hundreds";}
               break;

               case  4:
               {if (units==i) unitsByLetters = "four";
                   if (units == i & tens == 1) unitsByLetters = "fourteen";
                   if (tens == i) tensByLetters = "forty ";
                   if (hundreds==i) hundredsByLetters = "four hundreds";
               }
               break;
               case  5:
               {if (units==i) unitsByLetters = "five";
                   if (units == i & tens == 1) unitsByLetters = "fifteen";
                   if (tens == i) tensByLetters = "fifty ";
                   if (hundreds==i) hundredsByLetters = "five hundreds";
               }
               break;
               case  6:
               {if (units==i) unitsByLetters = "six";
                   if (units == i & tens == 1) unitsByLetters = "sixteen";
                   if (tens == i) tensByLetters = "sixty ";
                   if (hundreds==i) hundredsByLetters = "six hundreds";
               }
               break;
               case  7:
               {if (units==i) unitsByLetters = "seven";
                   if (units == i & tens == 1) unitsByLetters = "seventeen";
                   if (tens == i) tensByLetters = "seventy ";
                   if (hundreds==i) hundredsByLetters = "seven hundreds";
               }
               break;
               case  8:
               {if (units==i) unitsByLetters = "eight";
                   if (units == i & tens == 1) unitsByLetters = "eighteen";
                   if (tens == i) tensByLetters = "eighty ";
                   if (hundreds==i) hundredsByLetters = "eight hundreds";
               }
               break;
               case  9:
               {if (units==i) unitsByLetters = "nine";
                   if (units == i & tens == 1) unitsByLetters = "nineteen";
                   if (tens == i) tensByLetters = "ninety ";
                   if (hundreds==i) hundredsByLetters = "nine hundreds";
               }
           }
        }

        if (usersNumber % 100 != 0 & usersNumber > 100 )
            hundredsByLetters += " and ";

        String msg;

        msg = "The number as a string: " + hundredsByLetters + tensByLetters + unitsByLetters + ".";
        System.out.print(msg);
    }
}
