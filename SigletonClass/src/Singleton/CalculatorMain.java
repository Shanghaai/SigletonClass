package Singleton;

public class CalculatorMain 
{
	public static void main(String[] args)  
	{
		System.out.println("Game Started");
		Calculator calci = Calculator.getInstance(); 
		//1st we are taking instance of calculator class then using its method divide
		calci.divide(54,54);
	}
}
