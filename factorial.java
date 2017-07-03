package guvi;
import java.util.Scanner;
public class factorial {
	public static void main(String args[]){
		int n1;
		int facts=1;
		System.out.println("Enter the number:");
		Scanner in=new Scanner(System.in);
		n1=in.nextInt();
		for(int i=1;i<=n1;i++){
			facts=facts*i;
		}
			System.out.println("factorial is:"+facts);
		}
}
