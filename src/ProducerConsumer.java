import java.util.concurrent.*;

public class ProducerConsumer {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable producer = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                }
            } catch (Exception e) {}
        };

        Runnable consumer = () -> {
            try {
                while (true) {
                    System.out.println("Consumed: " + queue.take());
                }
            } catch (Exception e) {}
        };

        executor.submit(producer);
        executor.submit(consumer);
    }
}