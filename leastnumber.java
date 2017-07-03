package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class leastnumber {
	@SuppressWarnings({ "null", "unused" })
	public static void main(String[] args) 
	{
		String number;
		int n;
		char[] temp = null;
		String num1="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the num");
		number=in.nextLine();
		System.out.print("Enter the number of digits to be removed");
		n=in.nextInt();
		char[] s1=number.toCharArray();
		Arrays.sort(s1);
		for(int i=0;i<(s1.length-n);i++)
		{
		 num1=num1+s1[i];	
		}
		System.out.println(Integer.valueOf(num1));
		in.close();		
		}
}
