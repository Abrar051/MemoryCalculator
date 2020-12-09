package Smart_calculator;
import java.util.Scanner;
public class MemoryCalculator {
    public static int j;
    static int num1;
    static int num2;
	public static void main (String args[])
	{
		
		int[] ara1 = new int[10];
		int[] ara2 = new int[10];
		Scanner input = new Scanner (System.in);
		Operation obj[] = new Operation[10] ;
		PrintIntro a = new PrintIntro();
		for (int i=0;;i++)
		{
			a.printIntro();
			String mark = input.next();
			if (mark.compareTo("q")==0)
			{
				System.out.println("Program ended");
				break;
			}
			else if (mark.compareTo("+")==0 || mark.compareTo("-")==0 || mark.compareTo("*")==0 || mark.compareTo("/")==0)
			{
				System.out.print("Enter 1st number : ");
				num1 = input.nextInt();
				ara1[i]=num1;
				System.out.print("Enter 2nd number : ");
			    num2 = input.nextInt();
			    ara2[i]=num2;
				obj[i] = new Operation();
				obj[i].Result(num1, num2, mark);
				obj[i].ShowMemory(num1, num2, mark);
				j=i;
				//System.out.println ("value of j is "+j);
			}
			if (mark.compareTo("b")==0 || mark.compareTo("f")==0)
			{
				
				if (mark.compareTo("b")==0)
				{			
					if (j<0)
					{
						System.out.println("Index ended");
						break;
					}
					System.out.println("Number 1 is : "+ara1[j]+" number 2 is "+ara2[j]+" result is "+obj[j].Result(ara1[j], ara2[j], mark));
					j=j-1;
				}
				else if (mark.compareTo("f")==0)
				{
					if (j>=(obj.length-1) || j<0)
					{
						System.out.println("End of range");
						break;
					}
					System.out.println("Number 1 is : "+ara1[j]+" number 2 is "+ara2[j]+" result is "+obj[j].Result(ara1[j], ara2[j], mark));
					j=j+1;
				}
			}
		}
	}


}