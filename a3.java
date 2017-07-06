package a1;
import java.util.*;
public class a3 {
public static void main(String args[]) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n=sc.nextInt();
	System.out.println("Enter the elements of array");
	int[] s=new int[n];
	for(int i=0;i<n;i++) {
		s[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {	
	for(int j=0;j<n;j++) {
		System.out.println("Enter the target elements");
		s[i]=sc.nextInt();
		s[j]=sc.nextInt();
		int target=s[i]+s[j];
		System.out.println(target-1);
	}
	}
}
}
