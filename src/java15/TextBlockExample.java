package java15;

//Multiline strings with better readability and minimal escape sequences.
public class TextBlockExample {
    public static void main(String[] args) {
        String html = """
            <html>
                <body>
                    <h1>Hello, Java 15!</h1>
                </body>
            </html>
            """;
        System.out.println(html);
    }
}
//✅ Benefits:
//No need for \n or \"
//Easier to write JSON/XML/HTML as strings
//Clean and readable formatting

