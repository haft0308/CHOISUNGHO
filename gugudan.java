package dya0322;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("구구단을 입력하시요");
		int a =sc.nextInt();
		int b=1;
		for(int i=0; i<8; i++)
		{
			b=b+1;
			System.out.println(a+"*"+b+"="+a*b);
		}
	}

}
