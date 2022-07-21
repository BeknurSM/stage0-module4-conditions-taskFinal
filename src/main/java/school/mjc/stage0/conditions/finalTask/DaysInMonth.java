package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean leap;
        int daysInMonth=0;
        if (year % 4 != 0) {
            leap = false;
        } else if (year % 400 == 0) {
            leap = true;
            ;
        } else if (year % 100 == 0) {
            leap = false;
        } else {
            leap = true;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        } else if (month == 2) {
            daysInMonth = (leap) ? 29 : 28;
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 10 || month == 12) {
            daysInMonth = 31;
        } else {
            System.out.println("invalid date");
        }
        System.out.println(daysInMonth);
    }
}
