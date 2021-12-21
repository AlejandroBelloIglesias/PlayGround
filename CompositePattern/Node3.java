import java.util.ArrayList;

public class Node3 {

    public String name;
    public ArrayList<Node3> childNodes;


    public Node3 (String name) {
        this.name = name;
        this.childNodes = new ArrayList<>();
    }

    public void add(Node3 n) {
        this.childNodes.add(n);
    }

    public void remove(Node3 n) {
        this.childNodes.remove(n);
    }

    public void operation() {
        System.out.print(" > " + name);
        for (Node3 c : childNodes) {
            c.operation();
            System.out.println();
        }
    }

}
