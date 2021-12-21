
//Composite pattern leaf class
public class Leaf1 implements Component1 {

    private String name;

    public Leaf1(String name) {
        this.name = name;
    }
    
    @Override
    public void add(Component1 c) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void remove(Component1 c) {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    public void operation() {
        System.out.println("Leaf operation: " + name);
    }

}
