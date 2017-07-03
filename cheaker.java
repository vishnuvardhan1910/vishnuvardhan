package guvi;
import java.util.Scanner;
public class cheaker {
	public static void main(String[] args) {
	       
        char[] Lcase=new char[26];
        char[] Ucase=new char[26];
        int s=0,x=0,num1=0;
        for(char i='a';i<='z';i++)
        {
         Lcase[s]=i;
         s++;
        }
         for(char j='A';j<='Z';j++)
        {
         Ucase[x]=j;
         x++; 
        }
       Scanner in=new Scanner(System.in); 
        System.out.println("Enter ur String");
       String str=in.nextLine();
       for(int l=0;l<26;l++){
       for(int j=0;j<str.length();j++)
       {
        if(str.charAt(j)==Lcase[l]||str.charAt(j)==Ucase[l])
        {
          num1++;
          Lcase[l]=(char)-1;
           Ucase[l]=(char)-1;
        }
            }}
        if(num1==26)
        
            System.out.println(" It is a pangram");
        
        else
            System.out.println("It is not an pangram");
    }
}
