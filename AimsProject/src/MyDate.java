import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;



public class MyDate {
    private String day;
    private String month;
    private int year;

    public String getDay(){
        return this.day;
    }

    public void setDay(String day){
        this.day = day;
    }

    public String getMonth(){
        return this.month;
    }

    public void setMonth(String month){
        this.month = month;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        if (year > 0) {
            this.year = year;
        }
    }

    public MyDate(){
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int current_day = calendar.get(Calendar.DATE);
        this.day = String.valueOf(current_day) + "th";
        int current_month = calendar.get(Calendar.MONTH) + 1;
        this.month = String.valueOf(current_month);
        this.year = calendar.get(Calendar.YEAR);
    }

    public MyDate(String day, String month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(String date){
        String[] input_date = date.split(" ");
        this.month = input_date[0];
        this.day = input_date[1];
        this.year = Integer.parseInt(input_date[2]);
        // System.out.println(this.day);
        // System.out.println(this.month);
        // System.out.println(this.year);
    }

    public void printDate(){
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }

    public void accept(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a date in format: Day-Month-Year");
        String date = in.nextLine();
        String[] input_date = date.split(" ");
        this.day = input_date[0];
        this.month = input_date[1];
        this.year = Integer.parseInt(input_date[2]);
    }

    public void print(){       
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int current_day = calendar.get(Calendar.DATE); 
        this.day = String.valueOf(current_day) + "th";
        int current_month = calendar.get(Calendar.MONTH) + 1;
        this.month = String.valueOf(current_month);
        this.year = calendar.get(Calendar.YEAR);
        System.out.print("Current date: ");
        System.out.print(this.day + "/" + this.month + "/" + this.year);
    }

}
