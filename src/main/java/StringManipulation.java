import java.util.Scanner;

public class StringManipulation {
    public static void testing(){
        System.out.println("Please enter something");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.printf("You entered %s\n", input);

    }

}
