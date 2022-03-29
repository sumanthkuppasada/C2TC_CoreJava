package basics;
import java.util.*;

public class reverse_the_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int n,rev=0,r;
		System.out.println("enetr the number");
		n=scan.nextInt();
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println(rev);

	}

}
