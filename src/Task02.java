import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age;

        do {
            System.out.print("Input your age: ");
            age = scanner.nextInt();
            if (age <=0 | age > 120)
                System.out.println("Age must be between 1 and 120 year old.");

        } while (age <= 0 | age > 120);


        int tens = 0, units, number;

        units = age % 10;
        number = age / 10;
        if (number > 0)
            tens = number % 10;


        String hundredsByLetters = " ", tensByLetters = " ", unitsByLetters = " ";

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
                tensByLetters = "twenty";
                break;
            case 3:
                tensByLetters = "thirty";
                break;
            case 4:
                tensByLetters = "forty";
                break;
            case 5:
                tensByLetters = "fifty";
                break;
            case 6:
                tensByLetters = "sixty";
                break;
            case 7:
                tensByLetters = "seventy";
                break;
            case 8:
                tensByLetters = "eighty";
                break;
            case 9:
                tensByLetters = "ninety";
        }

        if (age == 100 )
            hundredsByLetters = "one hundred";
        if (age > 100)
            hundredsByLetters = "one hundred and";

        String msg;
        if (age == 1) {
            msg = "You are one year old. ";
        } else {
            msg = "You are " + hundredsByLetters +" "+ tensByLetters +" "+ unitsByLetters + " years old.";
        }
System.out.print(msg);

    }
}




