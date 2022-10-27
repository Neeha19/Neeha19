package loop.main;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		//int n=5;
		//int i=6;
		//System.out.println(n+"*"+i +"=" +n*i);
		System.out.println("enter a number");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i +"=" +n*i);
			
		}
		

	}

}
