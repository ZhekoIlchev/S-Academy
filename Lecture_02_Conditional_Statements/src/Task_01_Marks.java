import java.util.Scanner;

public class Task_01_Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mark = Double.parseDouble(scanner.nextLine());

        if (mark >= 5.50) {
            System.out.println("Excellent!");
        }
    }
}