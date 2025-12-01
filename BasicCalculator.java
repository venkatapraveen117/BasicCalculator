package package2;
import java.util.Scanner;

public class BasicCalculator {
	Scanner scan=new Scanner(System.in);
	public void m1()
	{
		System.out.println("Enter initial number:");
		 
		 double result =scan.nextDouble();
		 
		 while(true)
		 {
			 System.out.println("\nSelect operation:");
	            System.out.println("+  Add");
	            System.out.println("-  Subtract");
	            System.out.println("*  Multiply");
	            System.out.println("/  Divide");
	            System.out.println("=  Show Result & Exit");
	            String op = scan.next();
	            if(op.equals("="))
	            {
	                System.out.println("final result"+result);
	                break;
	            }
	             
		 System.out.println("Enter next number:");
         double num = scan.nextDouble();
		 switch(op)
		 {
		 case "+":
		 {
			 result=result+num;
			 break;
		 }
		 case "-":
		 {
			 result=result-num;
			 break;
		 }
		 case "*":
		 {
			 result=result*num;
			 break;
		 }
		 case "/":
		 {
			 if (num != 0) {
                 result = result / num;
             } else {
                 System.out.println("Error! Division by zero is not allowed.");
             }
			 break;
		 }
		
		 default:
             System.out.println("Invalid Operator");
		
		 }
		 
		 System.out.println("Current Result: " + result);
		 }	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCalculator  obj=new BasicCalculator ();
		obj.m1();
		

	}

}
