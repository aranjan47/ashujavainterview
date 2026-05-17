package java12;

import java.nio.file.*;
//Returns the position of the first mismatch between two files.
public class FilesMismatchExample {
    public static void main(String[] args) throws Exception {
        Path file1 = Files.writeString(Files.createTempFile("f1", ".txt"), "Java");
        Path file2 = Files.writeString(Files.createTempFile("f2", ".txt"), "JavaX");

        long mismatch = Files.mismatch(file1, file2);
        System.out.println("Mismatch at index: " + mismatch); // Output: 4
    }
}
