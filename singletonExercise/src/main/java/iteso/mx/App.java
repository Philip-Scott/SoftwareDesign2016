package iteso.mx;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ChocolateBoiler chocolate;

        chocolate = ChocolateBoiler.getInstance();
        chocolate.fill();
        chocolate.boil();

    }
}
