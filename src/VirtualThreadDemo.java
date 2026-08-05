public class VirtualThreadDemo {
    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Running in: " + Thread.currentThread());
        };

        // Virtual Thread
        Thread.startVirtualThread(task);

        // Multiple Virtual Threads
        for (int i = 0; i < 5; i++) {
            Thread.startVirtualThread(task);
        }
    }
}