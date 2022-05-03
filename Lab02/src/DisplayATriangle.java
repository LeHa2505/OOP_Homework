import java.util.Scanner;

public class DisplayATriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the height of triangle: ");
        int height = in.nextInt();

        for(int i = 1; i <= height; i++)
        {
            for(int k = 1; k <= height-i; k++ )
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i-1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
