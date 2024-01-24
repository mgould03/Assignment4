import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a string:");
        String string = scanner.nextLine();
        String reversed = new
    StringBuilder(string).reverse().toString();
    System.out.println("Reversed String:");
    System.out.print(reversed);
        scanner.close();
    }
}