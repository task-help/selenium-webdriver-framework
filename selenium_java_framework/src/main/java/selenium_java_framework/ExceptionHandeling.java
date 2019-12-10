package selenium_java_framework;

public class ExceptionHandeling {
	public static void main(String[] args) {
		
	
		

		try {
			
			System.out.println("hello world");
			int i = 1/0;
			System.out.println("Completed");
		}
		catch(Exception exp) {
			
			System.out.println("executing catch block");
			System.out.println("Message is: " + exp.getMessage()); 
			System.out.println("Cuase of error is: " + exp.getCause());
			exp.printStackTrace();
		}
		finally {
			System.out.println("finanlly block is being executed");
		}
		
		
		
	}

	
}
