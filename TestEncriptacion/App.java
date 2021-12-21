import java.util.List;
import java.util.stream.Stream;

public class App {

    
    public static void main(String[] args) {

        /*
        String msgEncriptado = encriptarPorDesplazamiento ("Hola k tal jaja", 69);
        System.out.println(msgEncriptado);

        String msgDesencriptado = desencriptarPorDesplazamiento (msgEncriptado, 1);
        System.out.println(msgDesencriptado);
        */


        /*
        String msgEncriptado = encriptarPorDesplazamiento ("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "abc123.");
        System.out.println(msgEncriptado);

        String msgDesencriptado = desencriptarPorDesplazamiento (msgEncriptado, "asies");
        System.out.println(msgDesencriptado);
*/

        System.out.println( (2 + 360) % 360);
        


        String msgEncriptado = encriptarVigenereConHash ("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "abc123.");
        System.out.println(msgEncriptado);

        String msgDesencriptado = desencriptarVigenereConHash ("12345678990abcdefghjkl", "▓▓▓▓▓▓▓▓▓▓");
        System.out.println(msgDesencriptado);

        System.out.println(encrypt("Test"));

    }


    // ====  Encriptado por desplazamiento de char ==== 
    public static String encriptarPorDesplazamiento (String msg, int key) {

        String mensajeEncriptado = "";

        for (int i = 0; i < msg.length(); i++ ) {

            char c = msg.charAt(i);
            mensajeEncriptado += (char) (c + key);
        }
        return mensajeEncriptado;
    }

    public static String desencriptarPorDesplazamiento (String msg, int key) {

        String mensajeDesencriptado = "";

        for (int i = 0; i < msg.length(); i++ ) {

            char c = msg.charAt(i);
            mensajeDesencriptado += (char) (c - key);
        }
        return mensajeDesencriptado;
    }



    // ==== Encriptado por desplazamiento con clave de texto (Vigenere) ==== 

    public static String encriptarVigenere (String msg, String key) {

        String mensajeEncriptado = "";

        for (int i = 0; i < msg.length(); i++ ) {

            char ch_msg = msg.charAt(i);
            char ch_key = key.charAt(i % key.length()); // Se usa módulo para que no de outOfBounds hola....!! -> holaholaho

            mensajeEncriptado += (char) (ch_msg + ch_key);

        }
        return mensajeEncriptado;
    }


    public static String desencriptarVigenere (String msg, String key) {

        String mensajeDesencriptado = "";

        for (int i = 0; i < msg.length(); i++ ) {

            char ch_msg = msg.charAt(i);
            char ch_key = key.charAt(i % key.length()); // Se usa módulo para que no de outOfBounds hola....!! -> holaholaho

            mensajeDesencriptado += (char) (ch_msg - ch_key);
        }
        return mensajeDesencriptado;
    }


    // ==== Encriptado por desplazamiento con clave de texto + hashcode ==== 

    public static String encriptarVigenereConHash (String msg, String key) {

        //"int" mide 4 bytes 
        //"char" mide 1 byte
        //Cuidado con el overflow!!!!!

        String mensajeEncriptado = "";

        key = String.valueOf(key.hashCode());

        for (int i = 0; i < msg.length(); i++ ) {

            char ch_msg = msg.charAt(i);
            char ch_key = key.charAt(i % key.length()); // Se usa módulo para que no de outOfBounds hola....!! -> holaholaho

            mensajeEncriptado += (char) (ch_msg + ch_key);

        }
        return mensajeEncriptado;
    }


    public static String desencriptarVigenereConHash (String msg, String key) {

        String mensajeDesencriptado = "";

        key = String.valueOf(key.hashCode());

        for (int i = 0; i < msg.length(); i++ ) {

            char ch_msg = msg.charAt(i);
            char ch_key = key.charAt(i % key.length()); // Se usa módulo para que no de outOfBounds hola....!! -> holaholaho

            mensajeDesencriptado += (char) (ch_msg - ch_key);
        }
        return mensajeDesencriptado;
    }

    //Encrypt using sha-256
    public static String encrypt(String input) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-256");
            byte[] messageDigest = md.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            return hexString.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }




}