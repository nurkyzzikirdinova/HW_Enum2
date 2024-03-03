import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Kun jaz");
            String weeks = scanner.nextLine().toUpperCase();
            Week week = Week.valueOf(weeks);
            System.out.println(week.getDescription());
        }
    }
}

