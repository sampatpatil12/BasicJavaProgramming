package programming;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		
		while(num>0) {
			sum=sum+(num%10)*(num%10)*(num%10);
			num=num/10;
		}
		
		if(sum==temp)
		{
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}

	}

}
