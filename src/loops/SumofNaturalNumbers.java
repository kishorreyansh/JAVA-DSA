package loops;

import java.util.Scanner;

public class SumofNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int sum = 0;
		int i = 1;
		while(i <= n) {
			sum = sum + i;
			i++;
		}
		System.out.println("Natural Numbers Sum: "+sum);

	}

}
