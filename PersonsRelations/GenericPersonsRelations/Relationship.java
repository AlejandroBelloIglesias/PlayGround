
import java.util.Map;


/**
 * This class represents a relationship between multiple people.
 * A relationship has a name and a list of people.
 * 
 */
public class Relationship {

    
    /**
     * Name of the relationship.
     */
    private String name;

    /**
     * People involved in the relationship and their Role role in the relationship.
     */
    private Map<Person, Role> people;

    /**
     * Constructs a relationship with a name and a map of people and their roles.
     * Roles are defined in the Role enum.
     * 
     * @param name the name of the relationship.
     * @param people the people involved in the relationship and their role in the relationship.
     */
    public Relationship(String name, Map<Person, Role> people) {
        this.name = name;
        this.people = people;
    }

    /**
     * Returns the name of the relationship.
     * @return the name of the relationship.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the people involved in the relationship and their role in the relationship.
     * @return the people involved in the relationship and their role in the relationship.
     */
    public Map<Person, Role> getPeople() {
        return people;
    }

    /**
     * Adds a person to the relationship with a role.
     * @param person the person to add.
     */
    public void add(Person person, Role role) {

        people.put(person, role);

        //Person joins to this relationship
        person.addRelationship(this);
    }
    
}
