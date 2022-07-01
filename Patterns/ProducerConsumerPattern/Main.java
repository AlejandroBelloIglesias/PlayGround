
public class Main {
    public static void main(String[] args) throws InterruptedException {

        var shop = new Shop();

        // Producer creates random amount of products like "apple", "banana", "orange"
        var producer = new Thread(() -> {
            while (true) {
                // It first sleeps
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // Then it picks a random ammount
                int amount = (int) (Math.random() * 1) + 1;
                // And it creates that amount of products
                String product = randomProduct();
                for (int i = 0; i < amount; i++) {
                    shop.produce(product);
                }
            }
        });

        // Consumer consumes products
        var consumer = new Thread(() -> {
            while (true) {
                try {Thread.sleep(5000);} catch (Exception e) {}
                try {
                    shop.consume(randomConsumer(), randomProduct());
                } catch (InterruptedException e) {e.printStackTrace();}
            }
        });

        producer.start();
        consumer.start();
    }

    private static String randomProduct() {
        String[] products = {"apple", "banana", "orange"};
        return products[(int) (Math.random() * products.length)];
    }

    private static String randomConsumer() {
        String[] consumers = {"John", "Mary", "Bob", "Jane", "Tom", "Jerry"};
        return consumers[(int) (Math.random() * consumers.length)];
    }
}
