package Singleton;

public class Calculator //Singleton Example.
{
	 private static int count;
	 private static Calculator ref =null;
	
	 private Calculator()
	 {
		System.out.println("creating calculator instance via singleton pattern");
		count++;  //bcz constructor always gets executed at the time of object creation so it is will be one means singleton
	 }
	
	 static Calculator getInstance()
	 {
		if(count==0)
		{
			Calculator ref = new Calculator();
		}
		return ref;
	 }
	
	 public void divide(int num1,int num2)
	 {
		System.out.println("divide"+num1+"by"+num2);
		
		int res = num1/num2;
		
		System.out.println("Result is :"+res);
	 }
}
