package basics;
import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int n,rev=0,r,check;
		
		System.out.println("enetr the number");
		n=scan.nextInt();
		check=n;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println(rev);
		if(check==rev) {
		System.out.println("palindrome number");	
		}
		else {
			System.out.println("not palindrome number" );
		}

	}

}
