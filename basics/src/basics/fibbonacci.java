package basics;
import java.util.*;
public class fibbonacci {
public static void main(String[]args) {
Scanner	scan=new Scanner(System.in);
int a=0,b=1,c;
System.out.println("enter digit");
int n=scan.nextInt();
System.out.print(a+","+b+",");
	for(int i=0;i<n-2;i++) {
		c=a+b;
		System.out.print(c+",");
		a=b;
		b=c;
	}
}
}
