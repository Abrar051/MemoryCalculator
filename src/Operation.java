package Smart_calculator;

public class Operation extends MemoryCalculator {
	 public int a;
	 public int b;
	 public String sign;
	 public float result;
	 public float Result (int a, int b, String mark)
	 {
		 if (mark.compareTo("+")==0)
		 {
			 result = (a+b);
		 }
		 else if (mark.compareTo("-")==0)
		 {
			 result = (a-b);
		 }
		 else if (mark.compareTo("*")==0)
		 {
			 result = (a*b);
		 }
		 else if (mark.compareTo("/")==0)
		 {
			 result = (a/b);
		 }
		 return result; 
	 }
	 public void ShowMemory (int num1 , int num2 , String mark)
	 {
		 System.out.println(num1);
		 System.out.println(num1);
		 System.out.println(mark);
		 System.out.println(result);
	 }
}
