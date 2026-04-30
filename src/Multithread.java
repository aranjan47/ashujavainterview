
public class Multithread extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
	Multithread t1=new Multithread();  
t1.start();  
 }  
}  