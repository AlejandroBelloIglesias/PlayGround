import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BaconOperations {

    //Genera un mapa con la codificación letra -> valor del algoritmo de Francis Bacon 
    public static Map<String, String> generateBaconMap() {
        
        Map<String, String> baconMap = new HashMap<>();

        baconMap.put("a", "AAAAA");
        baconMap.put("b", "AAAAB");
        baconMap.put("c", "AAABA");
        baconMap.put("d", "AAABB");
        baconMap.put("e", "AABAA");
        baconMap.put("f", "AABAB");
        baconMap.put("g", "AABBA");
        baconMap.put("h", "AABBB");
        baconMap.put("i", "ABAAA"); // I comparte el mismo valor que J
        //baconMap.put("j", "ABAAA"); //Lo comentamos porque vemos que se omite su uso
        baconMap.put("k", "ABAAB");
        baconMap.put("l", "ABABA");
        baconMap.put("m", "ABABB");
        baconMap.put("n", "ABBAA");
        baconMap.put("o", "ABBAB");
        baconMap.put("p", "ABBBA");
        baconMap.put("q", "ABBBB");
        baconMap.put("r", "BAAAA");
        baconMap.put("s", "BAAAB");
        baconMap.put("t", "BAABA");
        baconMap.put("u", "BAABB"); //U comparte el mismo valor que V
        //baconMap.put("v", "BAABB"); //Lo comentamos porque vemos que se omite su uso
        baconMap.put("w", "BABAA");
        baconMap.put("x", "BABAB");
        baconMap.put("y", "BABBA");
        baconMap.put("z", "BABBB");

        return baconMap;
    }

    //Método para desencriptar un mensaje codificado por el algoritmo Bacon
    public String decrypt(String str) { 

        //Se borran los carácterese que no sean letras
        str = deleteNonLetters(str);

        //Busca mayúsculas y minúsculas y los cambia por B y A ( hellO HoW Are yOu? = AAAAB, BABBA, AABAA = bye )
        str = baconize(str); 

        Map<String, String> baconMap = generateBaconMap();
        String parsed = "";

        for (int i = 0; i < str.length(); i++) {

            if (baconMap.containsValue(str.substring(i, i+5))) { //Existe el valor 'XXXXX' en el mapa? 

                //Habría que tener cuidado con "i+5" ya que puede salirse fácilmente del array
                //No está garantizado que el mensaje mida algún múltiplo de 5 tras eliminar caracteres no letras

                for ( Entry<String, String> entry : baconMap.entrySet() ) { //Entonces lo busca (recorre)
                    if (entry.getValue().equals(str.substring(i, i+5))) { //Es este?
                        parsed += entry.getKey(); //Agrega su clave al string
                    }
                }

                i += 4; //Desplazamos el índice
                
            } else {
                System.err.println("Error de codificación: No se encuentra el valor '" + str.substring(i, i+5) + "' en el mapa.");
                //throw new Exception("Error de codificación: No se encuentra el valor '" + str.substring(i, i+5) + "' en el mapa.");
            }
        }

        return parsed;
    }

    //Método para encriptar un mensaje
    public String encrypt(String realSentence, String fakeSentence) {

        String mask = generateMask(realSentence); //Genera una máscara (XXXXX) con la longitud del mensaje real
        Map<Integer, Character> nonLettersPositions = getNonLetters(fakeSentence) ; //Se guardan las posiciones de los caracteres no-letras para poder reconstruír el mensaje más tarde
        fakeSentence = deleteNonLetters(fakeSentence); //Se borran los caracteres no letras

        String loadedFakeSentence = ""; //Aquí se guardará la frase falsa con la cOdIfIcAcIóN del mensaje real
        for (int i = 0; i < fakeSentence.length(); i++) { //Recorremos la frase falsa

            //if ( i < mask.length() ) {  //Tuvimos que hacer esto porque a veces sobraban caracteres en la frase falsa
                if (mask.charAt(i) == 'A') {
                    loadedFakeSentence += Character.toLowerCase(fakeSentence.charAt(i));
                } else if (mask.charAt(i) == 'B') {
                    loadedFakeSentence += Character.toUpperCase(fakeSentence.charAt(i));
                }
            //}
            
        }

        //Ahora usamos los caracteres no-letras para reconstruir el mensaje
        for (Entry<Integer, Character> entry : nonLettersPositions.entrySet()) {
            loadedFakeSentence = loadedFakeSentence.substring(0, entry.getKey()) + entry.getValue() + loadedFakeSentence.substring(entry.getKey());
        }
        
        return loadedFakeSentence;
    }

    //Un método que genera una máscara (XXXXX)
    private String generateMask(String str) {

        Map<String, String> baconMap = generateBaconMap();
        String mask = "";

        for (int i = 0; i < str.length(); i++) { //Por cada carácter del mensaje original

            if (baconMap.containsKey(str.substring(i, i+1))) { //Busca la letra (clave) en el mapa

                mask += baconMap.get(str.substring(i, i+1)); //Y añade su codificación (valor) en la máscara

            } else {
                System.err.println("Error de codificación: No se encuentra la letra '" + str.substring(i, i+1) + "' en el mapa.");
                //throw new Exception("Error de codificación: No se encuentra la letra '" + str.substring(i, i+1) + "' en el mapa.");
            }
        }

        if (mask.length()%5 != 0) {
            System.err.println("Error de codificación: La máscara no es múltiplo de 5.");
            //throw new Exception("La máscara no es múltiplo de 5.");
        }

        return mask;
    }
    
    //Método que dado un mensaje (Sin carácteres no-letras) devuelve una cadena con la codificación hecha
    private String baconize (String str) {

        String baconized = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) { //Si la letra es mayúscula se añade una B a la cadena
                baconized += "B";
            } else { //Si la letra es minúscula se añade una A a la cadena
                baconized += "A";
            }
        }

        return baconized;
    }

    
    //Método que, dado un string, devuelve todos los caracteres no-letras en un Map<Integer,Character>
    private Map<Integer, Character> getNonLetters(String str) {

        //Quizás habría que incluír también la j y la v o las letras que ya eran mayúsculas?

        //LinkedHashMap para preservar el orden de los caracteres
        Map<Integer, Character> nonLetters = new LinkedHashMap<Integer, Character>(); 

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                nonLetters.put(i, str.charAt(i));
            }
        }

        return nonLetters;
    }

    //Método que, dado un string, borra todos los carácteres que no sean letras
    private String deleteNonLetters(String str) {

        //Quizás habría que incluír también  la j y la v o las letras que ya eran mayúsculas?

        String parsed = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                parsed += str.charAt(i);
            }
        }

        return parsed;
    }


    /*
    OBSOLETO: Funcionaba hasta que nos han pasado el mensaje final con otros carácteres "!" y ","
    //Pequeño método para devolver las posiciones de los espacios y poder reconstruir el espaciado del mensaje original
    private ArrayList<Integer> findSpaces(String str) {

        ArrayList<Integer> spaces = new ArrayList<Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaces.add(i);
            }
        }

        return spaces;
    }
*/


}
