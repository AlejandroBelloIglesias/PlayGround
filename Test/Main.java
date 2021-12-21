import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //Executes a CMD DIR process, waits for it to finish, and then prints the output to the console.
        try {
            Process process = Runtime.getRuntime().exec("cmd /c dir -ñ");
            
            //Waits for the process to finish and prints the result code to the console.
            int result = process.waitFor();
            System.out.println("Result code: " + result);

            //Prints exit value of the process to the console.
            System.out.println("Exit value: " + process.exitValue());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
    }


}
