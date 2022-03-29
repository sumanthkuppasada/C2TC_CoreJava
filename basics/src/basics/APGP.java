package basics;
import java.util.*;	
public class APGP {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int d=scan.nextInt();
		int n=scan.nextInt();
		int r=scan.nextInt();
		int apterm=a;
		int gpterm=a;
		
		for(int i=0;i<n;i++) {
			System.out.print(apterm+",");
			apterm=apterm+d;		
					
		}
		System.out.println();
		for(int i=0;i<n;i++) {
		System.out.print(gpterm+",");
		gpterm=gpterm*r;
		}
		

	}

}
