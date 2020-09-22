public class Main {
    public static void main(String[] args) {
        boolean a = isLeapYear(1600);
        boolean b = isLeapYear(2017);
        //System.out.println(b);
        int x = getDaysInMonth(1, 2020);
        int isLeap = getDaysInMonth(2, 2020);
        int notLeap = getDaysInMonth(2, 2018);
        getDaysInMonth(-1, 2020);
        getDaysInMonth(1, -2020);
        System.out.println(x);
        System.out.println(isLeap);
        System.out.println(notLeap);

    }

    private static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            System.out.println("Out of range");
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else return year % 400 == 0;
    }

    public static int getDaysInMonth(int month, int year) {
        boolean isMonthValid = month >= 1 && month <= 12;
        boolean isYearValid = year >= 1 && year <= 9999;
        if (!isMonthValid || !isYearValid) {
            return -1;
        } else {
            boolean _isLeapYear = isLeapYear(year);
            switch (month) {
                case 2:
                    if (_isLeapYear) {
                        return 29;
                    } else {
                        return 28;
                    }
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    System.out.println("No one knows");
                    break;
            }
        }
        return 0;
    }
}
