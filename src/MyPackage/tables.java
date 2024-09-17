package MyPackage;

import java.util.Scanner;

public class tables {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the Table no. : ");
		
		int x= sc.nextInt();
		
		System.out.println("tables of "+ x +":");
		for(int i=1; i<=10; i++) {
			int y = x * i;
			System.out.println(x +"*"+ i+ " =" + y);
		}
	}

}
