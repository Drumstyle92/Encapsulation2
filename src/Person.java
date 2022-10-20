import lombok.Data;

/**
 * @author Drumstyle92
 * Class with the lombok and with variables that indicate the data of a person.
 */
@Data
public class Person {
    /**
     * name of the person.
     */
    private String name;
    /**
     * surname of the person.
     */
    private String surname;
    /**
     * height of the person.
     */
    private double height;
    /**
     * age of the person.
     */
    private int age;
}
