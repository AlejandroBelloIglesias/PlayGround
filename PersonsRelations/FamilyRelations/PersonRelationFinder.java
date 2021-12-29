import java.util.HashSet;

public class PersonRelationFinder {

    public FamiliarRelations findRelation(Person person1, Person person2) throws Exception {
        
    }

    public Person findFather(Person person) {
        Person father = person.getFather();
        if (father == null) {
            System.out.println("No se encontró el padre de " + person.getName());
        }
        return father;
    }

    public Person findMother(Person person) {
        Person mother = person.getMother();
        if (mother == null) {
            System.out.println("No se encontró la madre de " + person.getName());
        }
        return mother;
    }

    public HashSet<Person> findParents(Person person) {
        HashSet<Person> parents = new HashSet<>();
        Person father = person.getFather();
        if (father != null) {
            parents.add(father);
        }
        Person mother = person.getMother();
        if (mother != null) {
            parents.add(mother);
        }
        return parents;
    }

    public HashSet<Person> findSiblings(Person person) {

        HashSet<Person> siblings = new HashSet<>();

        Person father = person.getFather();
        if (father != null) {
            siblings.addAll(father.getChildren());
        }

        Person mother = person.getMother();
        if (mother != null) {
            siblings.addAll(mother.getChildren());
        }

        siblings.remove(person); //Se excluye a si mismo

        return siblings;
    }

    /*
    public HashSet<Person> findGrandFather(Person person) { //Se puede optimizar

        HashSet<Person> grandfathers = new HashSet<>();

        Person father = findFather(person);
        if (father != null) {
            Person grandFather1 = findFather(father);
            if (grandFather1 != null) {
                grandfathers.add(grandFather1);
            } else {
                System.out.println("No se encontró el abuelo por parte de madre de " + person.getName());
            }
        }

        Person mother = findMother(person);
        if (mother != null) {
            Person grandFather2 = findFather(mother);
            if (grandFather2 != null) {
                grandfathers.add(grandFather2);
            } else {
                System.out.println("No se encontró el abuelo por parte de madre de " + person.getName());
            }
        }

        return grandfathers;
    }
    */

    


}