import java.util.Scanner;

/**
 * @author Drumstyle92
 * Class that contains the heart of the program.
 */
public class Tester {
    /**
     *
     * @param args main parameter.
     * main method that contains Scanner object,
     * Person class object and an output showing user inputs (person data).
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Person person;
        person = new Person();
        // block of code to collect user inputs
        System.out.println("------Data-------");
        System.out.println("Name to enter:");
        person.setName(scanner.nextLine());
        System.out.println("*---");
        System.out.println("Surname to enter:");
        person.setSurname(scanner.nextLine());
        System.out.println("**--");
        System.out.println("The height of the person:");
        person.setHeight(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("***-");
        System.out.println("The age of the person to be entered:");
        person.setAge(scanner.nextInt());
        scanner.close();
        System.out.println("****");

        String out = String.format("-Data of the person- \nName: %s \nSurname: %s \nHeight: %.2f \nAge: %d"
                                   ,person.getName(), person.getSurname(),person.getHeight(),person.getAge());
        // Show all user inputs
        System.out.println(out);
    }
}
