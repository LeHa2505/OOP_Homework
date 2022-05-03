import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {
    private String day;
    private String month;
    private int year;

    public String getDay() {
        return this.day;
    }

    public void setDay(String day){
        this.day = day;
    }

    public String getMonth() {
        return this.month;
    }

    public void setMonth(String month){
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year){
        if (year > 0) {
            this.year = year;
        }
    }


    public MyDate() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int current_day = calendar.get(Calendar.DATE);
        this.day = String.valueOf(current_day) + "th";
        int current_month = calendar.get(Calendar.MONTH) + 1;
        this.month = String.valueOf(current_month);
        this.year = calendar.get(Calendar.YEAR);
    }

    public MyDate(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = Integer.parseInt(year);
    }

    public MyDate(String day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(String date) {
        String[] input_date = date.split(" ");
        this.month = input_date[0];
        this.day = input_date[1];
        this.year = Integer.parseInt(input_date[2]);
        // System.out.println(this.day);
        // System.out.println(this.month);
        // System.out.println(this.year);
    }

    public void printDate() {
        // System.out.println("---------------Date---------------");
        // System.out.println("Day: " + this.day);
        // System.out.println("Month: " + this.month);
        // System.out.println("Year: " + this.year);
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }

    public void accept() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a date in format: Day-Month-Year");
        String date = in.nextLine();
        String[] input_date = date.split(" ");
        this.day = input_date[0];
        this.month = input_date[1];
        this.year = Integer.parseInt(input_date[2]);
    }

    //print current date in the format: “February 29th 2020”
    public void print() {        
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int current_day = calendar.get(Calendar.DATE); 
        this.day = String.valueOf(current_day);
        this.month = getMonthName();
        this.year = calendar.get(Calendar.YEAR);
        // int current_month = calendar.get(Calendar.MONTH) + 1;
        // this.month = String.valueOf(current_month);
        System.out.print("Current date: ");
        System.out.print(this.month + " " + this.day + "th " + this.year + "\n");
    }

    public static String getMonthName() {
        String[] months = {"January", "February",
        "March", "April", "May", "June", "July",
        "August", "September", "October", "November",
        "December"};

        Calendar calendar = Calendar.getInstance();
        String month = months[calendar.get(calendar.MONTH)];
        return month;
    }

    //Print date in format chosen by users (date must be input in integer type) 
    public void printDateInFormat() {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        // change form from string to integer
        int monthIn = Integer.parseInt(this.month);
        int dayIn = Integer.parseInt(this.day);
        Date dateInput = new Date(this.year - 1900, monthIn - 1, dayIn);

       do {
            System.out.println("\tFormat\t\tExample");
            System.out.println("1.\tyyyy-MM-dd\t1930-02-03");
            System.out.println("2.\td/M/yyyy\t3/2/1930");
            System.out.println("3.\tdd-MMM-yyyy\t03-Feb-1930");
            System.out.println("4.\tMMM d yyyy\tFeb 3 1930");  
            System.out.println("5.\tMM-dd-yyyy\t02-03-1930");  
            System.out.println("6. Exit");  
            System.out.println("Choose format which you want to print in: ");

            choice = in.nextInt();

            switch (choice) {
                case 1: {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String date = simpleDateFormat.format(dateInput);
                    System.out.println(date);
                    break;
                }
                case 2: {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d/M/yyyy");
                    String date = simpleDateFormat.format(dateInput);
                    System.out.println(date);
                    break;
                }
                case 3: {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
                    String date = simpleDateFormat.format(dateInput);
                    System.out.println(date);
                    break;
                }
                case 4: {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d yyyy");
                    String date = simpleDateFormat.format(dateInput);
                    System.out.println(date);
                    break;
                }
                case 5: {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
                    String date = simpleDateFormat.format(dateInput);
                    System.out.println(date);
                    break;
                }
                default:
                    break;
            }
       } while (choice != 6);
    }

    

}
