
public class Main2 {
    public static void main(String[] args) {

        Composite2 root = new Composite2("root22222");

        root.add(new Leaf2("Bottle of water")); 
        root.add(new Leaf2("Bottle of milk"));
        root.add(new Leaf2("Bottle of beer")); 

        Composite2 comp = new Composite2("sublist");

        Composite2 comp2 = new Composite2("sublist 2");
        comp2.add(new Leaf2("Orange lol"));
        comp.add(comp2);
        comp.add(new Leaf2("Bottle of water"));

        root.add(comp);

        root.operation();

    }

}
