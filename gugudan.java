package dya0322;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("±¸±¸´ÜÀ» ÀÔ·ÂÇÏ½Ã¿ä");
		int a =sc.nextInt();
		int b=1;
		for(int i=0; i<8; i++)
		{
			System.out.println(a+"*"+b+"="+a*b);
			b=b+1;
		}
	}

}
