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
        // Inicializa las variables mediante parametros y el resto a null
        this.name = name;
        this.age = age;
        father = null;
        mother = null;
        children = new ArrayList<Person>();
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

    /**
     * Metodo para fijar el padre de la persona. Introduce una persona
     */
    public void setFather(Person father)
    {
        this.father = father;
    }

    /**
     * Metodo para fijar la madre de la persona. Introduce una persona
     */
    public void setMother(Person mother)
    {
        this.mother = mother;
    }

    /**
     * Metodo para añadir hijos a la persona. Introduce una persona.
     * ¿Eres su padre (true/false)?
     * 
     */
    public void addChild(Person child, boolean isFather)
    {
        children.add(child);
        // Si es el padre añade como padre en el hijo a la persona,
        // sino lo añade como su madre
        if (isFather)
        {
            child.setFather(this);
            // Añade a esta persona como hijo en el padre
        }
        else
        {
            child.setMother(this);
            // Añade a esta persona como hijo en la madre
        }
    }

    /**
     * Metodo para imprimir por pantalla la informacion sobre los padres
     */
    public void showParentsData()
    {
        // Si tiene padre almacenado, imprime su informacion por pantalla
        if (father != null)
        {
            System.out.println("Padre:");
            father.showData();
        }
        // Si tiene madre almacenada, imprime su informacion por pantalla
        if (mother != null)
        {
            System.out.println("Madre:");
            mother.showData();
        }
    }

    /**
     * Metodo para imprimir por pantalla la informacion sobre los hijos
     */
    public void showChildrenData()
    {
        // Si tiene algun hijo almacenado, imprime la informacion de todos por pantalla
        if (children.size() > 0)
        {
            for (Person child : children)
            {
                child.showData();
            }
        }
    }

    /**
     * Devuelve si la persona tiene o no hijos
     */
    public boolean hasChildren()
    {
        boolean hasChildren = false;
        // Si hay algun hijo en la coleccion, devolvera true
        if (children.size() > 0)
        {
            hasChildren = true;
        }
        return hasChildren;
    }

    /**
     * Devuelve el numero de hijos de la persona
     */
    public int numberOfChildren()
    {
        return children.size();
    }

    /**
     * Devuelve si la persona tiene o no hermanos
     */
    public boolean hasBrothers()
    {
        // Almacena en variables locales el numero de hijos de la madre y el padre
        int numberOfMotherChildren = 0;
        if (mother != null)
        {
            numberOfMotherChildren = mother.numberOfChildren();
        }
        int numberOfFatherChildren = 0;
        if (father != null)
        {
            numberOfFatherChildren = father.numberOfChildren();
        }
        // Si la madre o el padre tienen mas de un hijo, la persona tiene hermanos
        boolean hasSibling = false;
        if ((numberOfMotherChildren > 1) || (numberOfFatherChildren > 1))
        {
            hasSibling = true;
        }
        return hasSibling;
    }

}
