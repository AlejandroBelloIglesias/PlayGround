import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        
        ConsoleView consoleView = new ConsoleView();
        
        // Create a person
        Person alex = new Person("Alex", new ArrayList<Relationship>());
        Person irene = new Person("Irene", new ArrayList<Relationship>());

        Person alberto = new Person("Alberto", new ArrayList<Relationship>());
        Person maria = new Person("Maria", new ArrayList<Relationship>());
        

        // Creation of relationships
        Relationship alexirenecouple = new Relationship( "Couple", new HashMap<Person, Role>() );

        // Add a person to the relationship
        alexirenecouple.add(alex, Role.PARTNER);
        alexirenecouple.add(irene, Role.PARTNER);

        Relationship alexparents = new Relationship( "Kinship", new HashMap<Person, Role>() );
        alexparents.add(alberto, Role.PARENT);
        alexparents.add(maria, Role.PARENT);
        alexparents.add(alex, Role.CHILD);

        Relationship parentsmarriage = new Relationship( "Marriage", new HashMap<Person, Role>() );
        parentsmarriage.add(alberto, Role.SPOUSE);
        parentsmarriage.add(maria, Role.SPOUSE);

        consoleView.printPersonRelationships(alex);
        System.out.println("");
        consoleView.printPersonRelationships(irene);
        System.out.println("");
        consoleView.printPersonRelationships(alberto);
        

    }
}