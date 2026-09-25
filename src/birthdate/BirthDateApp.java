//
// Name: Briones, Jayden
// Homework: 4
// Due: 10/14/2024
// Course: cs-1400-05-f24
//
// Description:
//              Program to output the day of the week and month of the user's birthday
//

package birthdate;

import java.util.Scanner;

public class BirthDateApp {

    public static int getDayOfTheWeek(int day, int month, int year) {
        int a, y, m, d;

        a = (14 - month) / 12;
        y = year - a;
        m = month + (12 * a) - 2;
        d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;

        return d;
    }

    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        return months[month - 1];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int day, month, year;
        String dayOfTheWeek, monthName;

        String[] daysOfTheWeek = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
        };

        System.out.println("Birth Date by J. Briones");
        System.out.println();

        System.out.print("Enter your birth date month day year? ");

        month = sc.nextInt();
        day = sc.nextInt();
        year = sc.nextInt();

        monthName = getMonthName(month);
        dayOfTheWeek = daysOfTheWeek[getDayOfTheWeek(day, month, year)];

        System.out.println();
        System.out.println("You were born on " + dayOfTheWeek + ", "
                + monthName + " " + day + ", " + year + ".");

        System.out.println();

        sc.close();
    }
}