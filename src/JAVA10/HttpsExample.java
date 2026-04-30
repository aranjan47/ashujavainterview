package JAVA10;

import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HttpsExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://example.com");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            reader.lines().forEach(System.out::println);
        }
    }
}


//No SSL errors, content is printed successfully — certificate is automatically trusted using built-in root CAs.

