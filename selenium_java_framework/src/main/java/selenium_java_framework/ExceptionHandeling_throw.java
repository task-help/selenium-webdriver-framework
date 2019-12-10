package selenium_java_framework;

public class ExceptionHandeling_throw {
	public static void main(String[] args) {
		
		try {
			exception_throw();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

	public static void exception_throw() throws Exception {
		
			System.out.println("hello world");
			int i = 1/0;
			System.out.println("Completed");
		
	
	}
}
