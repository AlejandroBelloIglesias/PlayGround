import java.util.Map.Entry;

public class ConsoleView {
    
    public void printPersonRelationships(Person person) {

        System.out.println("Person: " + person.getName());
        for (Relationship relationship : person.getRelationships()) {
            System.out.println("\tRelationship: " + relationship.getName());
            for (Entry<Person, Role> entry : relationship.getPeople().entrySet()) {
                System.out.println("\t\tPerson: " + entry.getKey().getName() + ", Role: " + entry.getValue());
            }
        }

    }
    
}
