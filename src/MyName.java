import java.util.Scanner;

public class MyName {
    public static void main(String[] args) {
        String name;
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj swoje imię: ");
        name = s.next();
        System.out.println("Moje imię to: " + name);
    }
}
