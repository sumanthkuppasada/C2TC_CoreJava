package basics;

import java.util.Scanner;
public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the digitsa");
		int n=sc.nextInt();
		//for the upper pattern
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n;j++) {
		if((i+j)>n)
		{	
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	
	}
	for(int k=2;k<=i;k++) {	 
		System.out.print("* ");
	}
	System.out.println();
}
//for the lower pattern
for(int x=1;x<=n;x++)
{
	for(int l=1;l<=n;l++) {
		if(l>=x)
		{
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	
	}
	for(int m=2;m<=n-x+1;m++)	
	{
		System.out.print("* ");
	}
	System.out.println();

	}
}

}