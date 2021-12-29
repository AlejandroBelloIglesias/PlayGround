import java.util.HashSet;

/**
 * This class represents a person.
 */
public class Person {
    
    /**
     * Name of the person.
     */
    private String name;

    private GENDER gender;

    private Person mother; //Biological mother
    private Person father; //Biological father

    private HashSet<Person> children; //Biological children
    
 
    /**
     * Construtor.
     * @throws Exception
     */
    public Person(Person mother, Person father, GENDER gender, String name) throws Exception {

        this.name = name;
        this.gender = gender;

        this.mother = mother; //Can be null if not known
        this.father = father; //Can be null if not known

        if (mother != null) {
            mother.addChild(this);
        }
        
        if (father != null) {
            father.addChild(this);
        }
    }
    

    // GETTERS && SETTERS

    /**
     * Returns the name of the person.
     * @return name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     * @param name name of the person.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Returns the gender GENDER.MALE or GENDER.FEMALE
     */
    public GENDER getGender() {
        return gender;
    }
    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    /**
     * Returns the father.
     */
    public Person getFather() {
        return father;
    }

    /**
     * Returns the mother.
     */
    public Person getMother() {
        return mother;
    }

    /**
     * Sets the father.
     */
    public void setFather(Person father) {
        this.father = father;
    }

    /**
     * Sets the mother.
     */
    public void setMother(Person mother) {
        this.mother = mother;
    }

    /**
     * Returns the children.
     */
    public HashSet<Person> getChildren() {
        return children;
    }

    /**
     * Sets the children.
     */
    public void addChild(Person child) {
        if (children == null) {
            children = new HashSet<Person>();
        }
        children.add(child);
    }

    public String toString() {
        return name;
    }

}