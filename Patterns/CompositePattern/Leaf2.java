
//Composite pattern leaf class
public class Leaf2 implements Component2 {

    private String name;

    public Leaf2(String name) {
        this.name = name;
    }

    //public void add(Component1 c) {}
    //public void remove(Component1 c) {}

    @Override
    public void operation() {
        System.out.println("Leaf operation: " + name);
    }

}
