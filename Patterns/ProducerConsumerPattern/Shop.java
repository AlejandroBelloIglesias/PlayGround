import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Shop {

    Object lock = new Object();
    List<String> products = new ArrayList<>();
    List<String> logList = new LinkedList<>();

    public void produce(String product) {
        synchronized (lock) {
            products.add(product);
            printStatus();
            lock.notifyAll();
        }
    }

    public boolean consume(String consumerName, String product) throws InterruptedException {
        synchronized (lock) {
            if (!products.contains(product)) { // Tiene el producto?
                logList.add(consumerName + " is waiting for " + product);
                while (!products.contains(product)) {
                    lock.wait();
                }
            } else {
                products.remove(product);
                printStatus();
                logList.add(consumerName + " consumed " + product);
                return true;
            }
        }
        logList.add(consumerName + " consumed " + product);
        return true;
    }

    /**
     * Prints each product in the list and its quantity and the log of the last 5
     */
    private void printStatus() {
        clearScreen();
        System.out.println("==== Almacen ====");
        products.stream().distinct().sorted().forEach(product -> {
            System.out.println(product + ": " + products.stream().filter(p -> p.equals(product)).count());
        });
        System.out.println("\n==== Log ====");
        // Prints the last 5 log entries
        for (int i = Math.min(5, logList.size()); i > 0; i--) {
            System.out.println(logList.get(logList.size() - i));
        }        
    }

    public static void clearScreen() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
