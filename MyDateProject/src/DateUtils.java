public class DateUtils {

    // return 0 => date1 is after date2
    // return 1 => date1 is before date2
    // return -1 => date1 equals date2
    public static int compareTwoDates(MyDate d1, MyDate d2) {
        int month1 = Integer.parseInt(d1.getMonth());
        int month2 = Integer.parseInt(d2.getMonth());
        int day1 = Integer.parseInt(d1.getDay());
        int day2 = Integer.parseInt(d2.getDay());
        if (d1.getYear() > d2.getYear()) {
            return 0;
        }
        else if (d1.getYear() < d2.getYear()) {
            return 1;
        } 
        else {
            if (month1 > month2) {
                return 0;
            } 
            else if(month1 < month2) {
                return 1;
            }
            else {
                if (day1 > day2) {
                    return 0;
                }
                else if (day1 < day2) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        }
    }

    public static void sortingDates() {
        MyDate[] date = {new MyDate("25", "12", 2022),
                        new MyDate("4", "7", 2022),
                        new MyDate("4", "7", 2021),
                        new MyDate("7", "12", 2019)
                    };
        MyDate temp = new MyDate();
        for(int i = 0; i < date.length - 1; i++)
        {
            for(int j = i + 1; j < date.length; j++)
            {
                if (compareTwoDates(date[i], date[j]) == 0) {
                    temp = date[j];
                    date[j] = date[i];
                    date[i] = temp;
                }
            }
        }

        System.out.println("List numbers of date: ");
        for (MyDate myDate : date) {
            myDate.printDate();
        }
    }
    public static void main(String[] args) {
        // MyDate date2 = new MyDate("12", "12", 2022);
        // MyDate date3 = new MyDate("12", "12", 2022);
        // compareTwoDates(date2, date3);

        sortingDates();
    }
}
