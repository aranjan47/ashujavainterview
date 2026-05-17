package Java17;

public record NewrecordEnhancements(String name, int age) {
    public String greet() {
        return "Hi, I'm " + name + " and I'm " + age + " years old.";
    }
}
