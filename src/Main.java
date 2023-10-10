// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //public static void main(String[] args) {
    //public static void main(String args[]) {
    public static void main(String... args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome! " + (args.length > 0?args[0]:""));

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        Animal animal = new Animal("Donkey");
        System.out.println(animal.getName());

        animal.showMessages("Hello", "Hi");
        animal.showMessages("One");
        animal.showMessages("One", "Two", "Three");

    }
}

/**
 * Animal class
 */
class Animal{
    private String name;

    public Animal() {
    }
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showMessages(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
// 1h:05m

/*
multiple lines
*/
