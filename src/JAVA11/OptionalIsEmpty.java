package JAVA11;

import java.util.Optional;

public class OptionalIsEmpty {
    public static void main(String[] args) {
        Optional<String> opt = Optional.empty();
        System.out.println(opt.isEmpty()); // true
    }
}
