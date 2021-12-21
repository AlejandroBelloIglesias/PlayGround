
public class ThreadInterruptTest {
    public static void main(String[] args) {
       System.out.println("Thread main started");
       final Task task = new Task();
       final Thread thread = new Thread(task);
       thread.start();
       
       for (int i = 0; i < 100; i++) {
          System.out.println("Thread main is going to interrupt thread"); 
       }

       thread.interrupt(); // calling interrupt() method
       System.out.println("Main Thread finished");
    }
 }
