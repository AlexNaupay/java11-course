package pe.devlabs;

public class Person {

    public Person() {
        System.out.println("This is a constructor");
    }

    public void Person(){
        System.out.println("This is a method");
    }

    public static void main(String... args){
        System.out.println("Hello from person");

        String s = "Hello String";

        Person person = new Person();
        person.Person();

        {
            System.out.println(s);
        }

    }

    static {
        System.out.println("Instance initializer Block is executed before constructor");
    }
}
