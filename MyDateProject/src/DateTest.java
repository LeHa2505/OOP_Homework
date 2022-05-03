public class DateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate("25", "12", 2022);
        MyDate date3 = new MyDate("4", "7", 2022);
        MyDate date4 = new MyDate("February 18th 2019");
        MyDate date5 = new MyDate("25", "6", "2022");

        // date1.printDate();
        // date2.printDate();
        // date3.printDate();

        // date1.accept();
        // date1.printDate();

        // date3.print();
        date1.print();
        date2.printDateInFormat();  
        
        DateUtils test = new DateUtils();
        if (test.compareTwoDates(date2, date3) == 1) {
            System.out.println("date1 is before date2");
        }
        else if(test.compareTwoDates(date2, date3) == 0) {
            System.out.println("date1 is after date2");
        }
        else {
            System.out.println("date1 equals date2");
        }
        test.sortingDates();

    }
}
