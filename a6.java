package a1;
import java.util.*;
public class a6 {
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		String a=s.next(),b="",c="";
		for(int i=0;i<=a.length()-1;i++)
	    c=a.substring(i,i+1)+c;
		for(int i=0;i<a.length();i++)
		 for(int j=i+1;j<=a.length();j++)
		  if(a.substring(i,j).equals(c.substring(c.length()-j,c.length()-i)))
		 if(a.substring(i,j).length()>b.length())
		 b=a.substring(i,j);
	System.out.println(b);
}
}