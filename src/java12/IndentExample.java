package java12;
//New String Method: indent(int n)
//Adds indentation to each line of a string.
public class IndentExample {
    public static void main(String[] args) {
        String multiline = "Java\nis\nawesome";
        System.out.println(multiline.indent(4));
    }
}
