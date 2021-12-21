
class Task implements Runnable {
   @Override
   public void run() {
      while (true) {

         try {
            Thread.sleep(100);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
         System.out.println("_");

         if (Thread.interrupted()) {
            System.out.println("This thread was interruped by someone calling this Thread.interrupt()");
            System.out.println("Cancelling task running in thread " + Thread.currentThread().getName());
            System.out.println(
                  "After Thread.interrupted() call, JVM reset the interrupted value to: " + Thread.interrupted());
            break;
         }
      }
   }
}