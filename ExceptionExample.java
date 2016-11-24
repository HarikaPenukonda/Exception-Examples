package exceptionExamples;

public class ExceptionExample {
	int i, j, k;

	public void show() {

		try {
			i = 10;
			j = 0;
			k = i / j;
			System.out.println("The value of k is " + k);
		} 
		/*System.out.println("out of try"); no statement is allowed between try and catch block*/
		catch (ArithmeticException e)
		{
			System.out.println("Division by zero");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionExample e1 = new ExceptionExample();
		e1.show();
		System.out.println("end of the program");

	}

}
