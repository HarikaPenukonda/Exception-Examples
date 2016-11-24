package exceptionExamples;

public class ExceptionExample3 {
	
	static String str = "a";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("method1");
		new ExceptionExample3().method1();
		System.out.println("str");
	}
	void method1(){
		try{
		System.out.println("method 2");
			method2();
		}
		catch (Exception e){
			str += "b";
		}

	}
	void method2() throws Exception {
		try{
			System.out.println("method 3");
			method3();
			str += "c";
		}
		catch(Exception e){
			throw new Exception();
		}
		finally{
			str += "d";
		}
		System.out.println("method 4");
		method3();
		str += "e";
	}
	 void method3()  throws Exception{
		// TODO Auto-generated method stub
		 throw new Exception();
		
	}
	

}
