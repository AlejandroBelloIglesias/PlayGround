
public class Main1 {
    public static void main(String[] args) {

        Component1 root = new Composite1("root");

        root.add(new Leaf1("Bottle of water")); 
        root.add(new Leaf1("Bottle of milk"));
        root.add(new Leaf1("Bottle of beer")); 

        Composite1 comp = new Composite1("sublist");

        Composite1 comp2 = new Composite1("sublist 2");
        comp2.add(new Leaf1("Orange lol"));
        comp.add(comp2);
        comp.add(new Leaf1("Bottle of water"));

        root.add(comp);

        root.operation();

    }

}
