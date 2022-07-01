import States.*;

public class Main {
    public static void main(String[] args) {
        
        Proc p = new Proc(1, "notepad", 10);

        //Se prepara y ejecuta
        p.admit();
        p.dispatch();

        //Bloqueo
        p.ioEvent();
        p.ioComplete();
        
        //Se ejecuta y se termina
        p.dispatch();
        p.terminate();
    }
}
