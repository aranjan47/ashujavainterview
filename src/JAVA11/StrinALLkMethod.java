package JAVA11;

public class StrinALLkMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("  ".isBlank()); // true
		 
		 
		 String str = "Java\nPython\nC++";
	        str.lines().forEach(System.out::println);
	        
	      
	                String str2 = "  Java  ";
	                System.out.println(str2.strip());        // "Java"
	                System.out.println(str2.stripLeading()); // "Java  "
	                System.out.println(str2.stripTrailing());// "  Java"
	            
	                
	                System.out.println("Java ".repeat(3)); // Java Java Java  


	}

}
