package basics;

import java.util.Scanner;

public class radix {

	public static void main(String[] args) {
		
		Scanner stc=new Scanner(System.in);
		System.out.println("enter the number");
		String num=stc.nextLine();
		if(num.matches("[01]+"))
		{
			System.out.println("binary number"+num);
		}
		else {
			
			if(num.matches("[1-7]+"))
			{
				System.out.println("octal number");
			}
			else if(num.matches("[0-9]+"))
			{
				System.out.println("decimal number");
			}
			else if(num.matches("[A-F1-7]+"))
			{
				System.out.println("hexa number"+num);
			}
			else
			{
				System.out.println("not number");
			}
		}
		

	}

}
