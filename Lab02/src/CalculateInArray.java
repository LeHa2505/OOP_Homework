import java.util.Scanner;

public class CalculateInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number in array: ");
        int n = in.nextInt();
        int[] number = new int[n];
        int sum =0, temp;

        for(int i=0; i < n; i++)
        {
            number[i] = in.nextInt();
            sum += number[i];
        }

        for(int i = 0; i < n-1; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if (number[i] > number[j]) {
                    temp = number[j];
                    number[j] = number[i];
                    number[i] = temp;
                }
            }
        }

        System.out.println("Sort a numberic array: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(number[i] +  " ");
        }

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + sum/n);
    }
}
