

public class exceptionclearnace
{
    public static void main (String[] args) 
    {
         
        // array of size 4.
        int[] arr = new int[4];
         
        try
        {
        	System.exit(0);
            int i = arr[4];
                 
            // this statement will never execute
            // as exception is raised by above statement
            System.out.println("Inside try block");
        }
         
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Exception caught in catch block");
        }
         //System.exit(0);
        finally
        {
        	//System.exit(1);
            System.out.println("finally block executed");
        }
         
        // rest program will be executed
        System.out.println("Outside try-catch-finally clause");
    }
}