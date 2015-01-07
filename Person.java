import java.util.ArrayList;

/**
 * Representa a una persona
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    // Almacena el nombre de la persona
    private String name;
    // Almacena la edad de la persona
    private int age;
    // Almacena al padre de la persona
    private Person father;
    // Almacena a la madre de la persona
    private Person mother;
    // Almacena a todos los hijos de la persona
    private ArrayList<Person> children;

    /**
     * Constructor para la persona. Introduce el nombre y la edad
     */
    public Person(String name, int age)
    {
        // Inicializa las variables mediante parametros
        this.name = name;
        this.age = age;
    }
    
    /**
     * Metodo que imprime por pantalla la informacion sobre la persona
     */
    public void showData()
    {
        // Imprime por pantalla los datos de la persona
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
    }

}
