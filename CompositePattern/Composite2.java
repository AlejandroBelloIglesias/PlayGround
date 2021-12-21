import java.util.ArrayList;

//Composite pattern composite class
public class Composite2 implements Component2 {
    
    private ArrayList<Component2> children = new ArrayList<Component2>();
    private String name;

    public Composite2(String name) {
        this.name = name;
    }

    public void add(Component2 c) {
        children.add(c);
    } 

    public void remove(Component2 c) {
        children.remove(c);
    }

    @Override
    public void operation() {
        System.out.println(name + ": ");
        for (Component2 c : children) {
            c.operation();
        }
    }


}
