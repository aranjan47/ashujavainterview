package JAVA10;
import java.util.List;
//Only for local variables (not method params, return types, or class fields).
//Must be initialized at the time of declaration.
public class VarExample {

    // ❌ Not allowed for class fields
  //  var field = "Hello";  // ❌ Compilation error

    // ❌ Not allowed as method return type
   // public var getMessage() {     // ❌ Compilation error
      //  return "Hi";
   // }

    // ❌ Not allowed in method parameters
    //public void greet(var name) { // ❌ Compilation error
     //   System.out.println("Hello " + name);
   // }
	
	public class UninitializedVar {
	    public void test() {
	       // var value;         // ❌ Compilation error: cannot infer type
	       // value = "Test";
	    }
	}
	
	public class ValidVarUsage {

	    public void show() {
	        var name = "Ashutosh";      // ✅ Valid local variable
	        var age = 30;               // ✅ Valid local variable
	        System.out.println(name + " is " + age + " years old.");
	    }
	}

	////var cannot be used for fields, method params, return types,
	/// or catch parameters. Also, var with diamond on anonymous classes widens the inferred
	//type — use explicit types for anonymous inner classes.
    public static void main(String[] args) {
        var name = "Java 10";       // inferred as String
        var number = 10;            // inferred as int
        var list = List.of("A", "B", "C"); // inferred as List<String>
        System.out.println(name);
        for (var item : list) {
            System.out.println(item);
        }
    }
}
