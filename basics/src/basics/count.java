package basics;
import java.util.*;
public class count {
public static int solve(String str)
{
 int starcount=0,hashcount=0;
 for(int i=0;i<str.length();i++)
 {
	 if(str.charAt(i)=='*')
	 {
		 starcount++;
		 
	 }
	 else if (str.charAt(i)=='#') {
		 hashcount++;
		
	}
	 
 }
 return starcount-hashcount;
}
public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.next();
	int ans = solve(str);
    System.out.println(ans);	
	
	
}
}
