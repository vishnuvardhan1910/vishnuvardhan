package a1;
import java.util.*;
public class a5 {
	public static void uniqueInteger(int[] arr){
		int count=0;
		
	for(int i=0;i<arr.length;i++){
		count=0;
		for(int j=0;j<arr.length;j++){
			if(j!=i&&arr[i]==arr[j])
				count++;
		}
		if(count==0)
			System.out.println("Unique Integer is "+arr[i]);
	}

		
	}
		public static void main(String[] args) {
			Scanner scr=new Scanner(System.in);
			System.out.println("Enter Array length");
			int len=scr.nextInt();
			int[] arr=new int[len];
			System.out.println("Enter Array Elements");
			for(int i=0;i<len;i++){
				arr[i]=scr.nextInt();
			}
			uniqueInteger(arr);

		}
}
