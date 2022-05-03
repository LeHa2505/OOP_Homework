import java.util.Scanner;

import javax.management.relation.Role;

public class AddTwoMatrics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowSize, colSize;

        System.out.print("Input the column size of two matrix: ");
        colSize = sc.nextInt();

        System.out.print("Input the row size of two matrix: ");
        rowSize = sc.nextInt();

        int[][] a = new int [colSize][rowSize];
        System.out.println("Input the first matrix");
        inputMatrix(a,rowSize, colSize);
        int[][] b = new int [colSize][rowSize];
        System.out.println("Input the second matrix");
        inputMatrix(b,rowSize, colSize);

        System.out.println("Two matrix that you inputed:");
        System.out.println("Matrix A");
        showMatrix(a, rowSize, colSize);
        System.out.println("Matrix B");
        showMatrix(b, rowSize, colSize);
        
        System.out.println("Result");
        showMatrix(add(a, b, colSize, rowSize), rowSize, colSize);
        
    }

    static void inputMatrix(int[][] a ,int rowSize, int colSize){
        Scanner sc = new Scanner(System.in);
        // int[][] a = new int[rowSize][colSize];
        for(int i = 0; i < colSize; i++)
        {
            for(int j = 0; j < rowSize; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
    }

    static void showMatrix(int[][] a ,int rowSize, int colSize){
        Scanner sc = new Scanner(System.in);
        // int[][] a = new int[rowSize][colSize];
        for(int i = 0; i < colSize; i++)
        {
            for(int j = 0; j < rowSize; j++)
                System.out.print(a[i][j] + "\t");
            
            System.out.println();
        }
    }

    static int [][] add(int a[][], int b[][], int colSize, int rowSize)
    {
        int[][] c = new int [colSize][rowSize];
        for(int i = 0; i < colSize; i++){
            for(int j = 0;j < colSize; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
}
