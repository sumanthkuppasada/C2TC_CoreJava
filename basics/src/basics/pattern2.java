package basics;
import java.util.*;
public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the digitsa");
		int n=sc.nextInt();
		int count=0;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n;j++) {
		
		System.out.print(++count+" ");
		
		}
		System.out.println();
	}

	}

}