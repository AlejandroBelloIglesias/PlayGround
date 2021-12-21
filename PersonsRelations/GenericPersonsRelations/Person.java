import java.util.List;

/**
 * This class represents a person.
 * A person has a name and relationships with other people.
 */
public class Person {

    /**
     * The name of the person.
     */
    private String name;

    /**
     * The relationships of the person.
     */
    private List<Relationship> relationships;

    /**
     * Constructs a person with a name and a list of relationships.
     * @param name the name of the person.
     * @param relationships the relationships of the person.
     */
    public Person(String name, List<Relationship> relationships) {
        this.name = name;
        this.relationships = relationships;
    }

    /**
     * Returns the name of the person.
     * @return the name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the relationships of the person.
     * @return the relationships of the person.
     */
    public List<Relationship> getRelationships() {
        return relationships;
    }

    /**
     * Adds a relationship to the person.
     * @param relationship the relationship to add.
     */
    public void addRelationship(Relationship relationship) {
        relationships.add(relationship);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

    
}
