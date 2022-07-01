public class CalculatorApp 
{
	public void add()
	{
		int a= 20;
		int b = 10;
		int res = a + b;
		System.out.println("Addition : "+res);
	}
	public void sub()
	{
		int a= 20;
		int b = 10;
		int res = a - b;
		System.out.println("Subtraction : "+res);
	}
	public void mul()
	{
		int a= 20;
		int b = 10;
		int res = a * b;
		System.out.println("Multiplication : "+res);
	}
	public void div()
	{
		int a= 20;
		int b = 10;
		int res = a / b;
		System.out.println("Division : "+res);
	}
	public static void main(String[] args)
	{
		CalculatorApp d = new CalculatorApp();
		d.add();
		d.sub();
		d.mul();
		d.div();
	}
}