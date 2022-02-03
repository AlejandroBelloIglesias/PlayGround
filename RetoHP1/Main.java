import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.Arrays;
import java.util.Enumeration;

public class Main {
    public static void main(String[] args) {

        var op = new BaconOperations();
        
        String input1 = "anthemnetworktesting";
        String input2 = "decryptiseasy";
        String input3 = "testingpassed";
        
        String fake_sentence1 = "en la fase final del analisis de datos las comunicaciones seran encriptadas de forma simetrica con un algoritmo eficaz";
        String fake_sentence2 = "las pruebas de desencriptacion son exitosas tras la primera fase redibujada";
        String fake_sentence3 = "la encriptacion es finalmente segura podemos aplicar el algoritmo en anthem";
        
        String output1 = "en la faSE fiNal Del aNALisIs de DaTOs LAs comUniCacIoNeS serAN eNCriptaDas DE foRma sImeTricA Con Un aLgoriTMo efiCAz";
        String output2 = "las PRueBas de dEsEncriPtACioN SOn ExiTosAs trAs la PriMera fase RediBUjADa";
        String output3 = "La eNcriPtaCion ES fiNalMente SEgura POdeMOS aplicaR el aLGoriTmo En anthEM";
        
        
        //Encriptación
        System.out.println( op.encrypt(input1, fake_sentence1) );
        System.out.println( op.encrypt(input2, fake_sentence2) );
        System.out.println( op.encrypt(input3, fake_sentence3) );
        

        //Desencriptación (Hay valores repetidos como I y J o U y V)
        //Simplemente conociendo el output y el algoritmo se puede hacer una especie de desencriptación imperfecta
        System.out.println( op.decrypt(output1) );
        System.out.println( op.decrypt(output2) );
        System.out.println( op.decrypt(output3) );

        // ==== MENSAJE FINAL ====
        System.out.println(op.decrypt("habEIs COnSEguiDo EnCOnTrar eL aLgOritMo, EnhoraBueNa! sIgamOs adELante conociEndo Los misTerioS ANtheM"));
        
    }
}
