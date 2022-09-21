import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int month, year, daysQuantity;

        do {
            System.out.print(" Input the month number: ");
            month = scanner.nextInt();
            System.out.print(" Input the year number: ");
            year = scanner.nextInt();
            if (month < 1 | month > 12)
                System.out.println("Incorrect month number! ");
            if (year < 1)
                System.out.println("Incorrect year number! ");
        }
        while (month < 1 | month > 12 | year < 1);

        boolean noLeapYear = year % 4 != 0 || year % 100 == 0 && year % 400 != 0;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                daysQuantity = 30;
                break;
            case 2:
                if (noLeapYear) daysQuantity = 28;
                else daysQuantity = 29;
                break;
            default:
                daysQuantity = 31;
        }
        String msg = " This month has "+ daysQuantity+ " days.";
        System.out.print(msg);
    }

}
