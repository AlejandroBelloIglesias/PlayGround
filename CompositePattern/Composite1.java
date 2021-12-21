import java.util.ArrayList;

//Composite pattern composite class
public class Composite1 implements Component1 {
    
    private ArrayList<Component1> children = new ArrayList<Component1>();
    private String name;

    public Composite1(String name) {
        this.name = name;
    }

    //@Override
    public void add(Component1 c) {
        children.add(c);
    } 

    //@Override
    public void remove(Component1 c) {
        children.remove(c);
    }

    @Override
    public void operation() {
        System.out.println(name + ": ");
        for (Component1 c : children) {
            c.operation();
        }
    }


}
