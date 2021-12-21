import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main3 {
    
    public static void main(String[] args) throws IOException, InterruptedException {
        
        /*
        //Fuck composite pattern
        Node3 root = new Node3("root22222");

        root.add(new Node3("Bottle of water")); 
        root.add(new Node3("Bottle of milk"));
        root.add(new Node3("Bottle of beer")); 

        Node3 comp = new Node3("sublist");

        Node3 comp2 = new Node3("sublist 2");
        comp2.add(new Node3("Orange lol"));
        comp.add(comp2);
        comp.add(new Node3("Bottle of water"));

        root.add(comp);

        root.operation();*/

        FileOutputStream fos = new FileOutputStream("text.txt");
        BufferedOutputStream bfos = new BufferedOutputStream(fos);

        bfos.write( "Hello World".getBytes() );
        
        bfos.close();
        Thread.sleep(10000);
    }

}
