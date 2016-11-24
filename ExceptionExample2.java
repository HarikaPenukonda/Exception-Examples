package exceptionExamples;

public class ExceptionExample2 {
	int i, j, k;

	public void show() {

		try {
			i = 10;
			j = 0;
			k = i / j;
			System.out.println("The value of k is " + k);
		} 
		
		
		catch (ArithmeticException e)
		{
			System.out.println("Division by zero");
		}
		finally
		{
			System.out.println("In Final Block");
		}
		
		// only one finally block is valid
		/*finally
		{
			System.out.println("In Final Block");
		}*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionExample2 e1 = new ExceptionExample2();
		e1.show();
		System.out.println("end of the program");

	}

	}


