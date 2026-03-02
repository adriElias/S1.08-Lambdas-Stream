package n6Reversed;

public class App {
    public static void main(String[] args) {

        Reversed reversed = s -> new StringBuilder(s).reverse().toString();

        String result = reversed.reverse("Hello World");
        System.out.println(result);
    }
}
