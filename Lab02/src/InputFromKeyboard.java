import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ten cua ban: ");
        String name = sc.nextLine();

        System.out.println("Nhap tuoi cua ban: ");
        int age = sc.nextInt();

        System.out.println("Nhap chieu cao cua ban (met): ");
        double height = sc.nextDouble();

        System.out.println("Xin chao ban " + name + " " + age + " tuoi, cao " + height + " met");
    }
}
