package basics;

import java.util.Scanner;
public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the digitsa");
		int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n;j++) {
		if(j>=i) {
			System.out.print("* ");	
		}
		else
			System.out.print("  ");
		
		}
		System.out.println();
	}

	}

}
