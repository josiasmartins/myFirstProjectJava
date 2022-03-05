import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Whats your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you");
        int age = scanner.nextInt();
        // scanner.nextInt();
        System.out.println("What is your favorite food?\n");
        String food = scanner.nextLine();

        System.out.println("What is your favorite food?\n");
        // String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You arae "+age+" year old");
        System.out.println("You like "+food);
    }
}
