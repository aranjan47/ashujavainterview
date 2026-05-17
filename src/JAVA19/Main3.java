package JAVA19;

public class Main3 {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 5; i++) {
            Thread.startVirtualThread(() -> {
                System.out.println("Running in: " + Thread.currentThread());
            });
        }
    }
}

