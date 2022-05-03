import java.util.Scanner;

public class NumberofDayInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the Month: ");
        String strMonth = input.nextLine();

        System.out.print("Input the Year: ");
        int year = input.nextInt();

            switch (strMonth){
                case "1": case "January": case "Jan.": case "Jan": 
                case "3": case "March": case "Mar": case "Mar.":
                case "5": case "May":
                case "7": case "July": case "Jul": case "Jul.":
                case "8": case "August": case "Aug": case "Aug.":
                case "10": case "October": case "Oct": case "Oct.":
                case "12": case "December": case "Dec": case "Dec.":
                    System.out.println("Has 31 days");
                    break;
                case "2": case "Feb.": case "Feb": case "February":
                    findDayofFeb(year);
                    break;

                case "4": case "April": case "Apr": case "Apr.":
                case "6": case "June": case "Jun.": case "Jun":
                case "9": case "September": case "Sep": case "Sep.":
                case "11": case "November": case "Nov": case "Nov.":
                    System.out.println("Has 30 days");
                    break;
            
                default:
                    break;
            }
    }

    public static void findDayofFeb(int year){
        if(((year%4)==0 && (year%100)!=0) || (year%400)==0)
        {
            System.out.println("Has 29 days");
        }
        else
        {
            System.out.println("Has 28 days");
        } 
    }
}
