import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        FileInputStream fis = new FileInputStream(new File("big.txt")); //Muchísimo puto texto

        IBookParser bp = new LazyBookParserProxy( new String(fis.readAllBytes()) );

        System.out.println(bp.getNumLines());

    }
}
