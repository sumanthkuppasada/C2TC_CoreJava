package basics;
import java.util.*;

public class switchcase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter date:::");
		int day=sc.nextInt();
		switch(day)
		{
		case 1:
		case 8:
		case 15 :
		case 22 :
		case 29 :
				 System.out.println("MONDAY");
			 break;
		case 2:	 
		case 9:
		case 16:
		case 23:	 
		case 30:	 
				 System.out.println("TUESDAY");
			 break;
		case 3:	 
		case 10:
		case 17:
		case 24:
		case 31:	
				 System.out.println("WEDNESDAY");
			 break;
		case 4:	 
		case 11:
		case 18:
		case 25:	 	 
				 System.out.println("THURSDAY");
			 break;	 
		case 5:	 
		case 12:
		case 19:
		case 26:	 	 
				 System.out.println("FRIDAY");
			 break;	 
		case 6:	 
		case 13:
		case 20:
		case 27:	 	 
				 System.out.println("SATURDAY");
			 break;
		case 7: 
		case 14:
		case 21:
		case 28:	 	 
				 System.out.println("SUNDAY");
			 break;	 
			 
			 
		default:System.out.println("invalid");	 
			 
		}
		// TODO Auto-generated method stub

	}

}
