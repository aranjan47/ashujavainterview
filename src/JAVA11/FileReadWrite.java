package JAVA11;

import java.nio.file.*;
import java.io.IOException;
//Files.readString() and Files.writeString()
public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "Hello Java 11");
        String content = Files.readString(path);
        System.out.println(content); // Hello Java 11
    }
}
