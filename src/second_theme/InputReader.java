package second_theme;

import java.util.Scanner;

public class InputReader {

    public int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("This isn't a number. Returning 0.");
            return 0;
        }
    }

}
