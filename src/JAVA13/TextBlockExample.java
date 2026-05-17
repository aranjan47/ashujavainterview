package JAVA13;


//✅ 1. Text Blocks (Preview Feature) – JEP 355
//A text block is a new way to declare multi-line string literals, using triple double quotes 
//""". This makes it easier to write JSON, XML, SQL, or HTML inside strings.


//Benefits:

//No need to escape quotes

//Preserves formatting
//No need for \n or string concatenation.

//Better readability and maintenance.

//Especially useful for HTML, SQL, or JSON.

//Cleaner code
//Before java 13
//String json = "{\n" +
//        "  \"name\": \"Ashutosh\",\n" +
//        "  \"age\": 30\n" +
//        "}";



public class TextBlockExample {
    public static void main(String[] args) {
        String json = """
                      {
                        "name": "Ashutosh",
                        "age": 30
                      }
                      """;
        System.out.println(json);
    }
}
