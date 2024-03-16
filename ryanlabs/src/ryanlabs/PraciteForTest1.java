package ryanlabs;

import java.util.Scanner;

public class PraciteForTest1 {
	public static Scanner reader = new Scanner(System.in);
	
	public static Boolean check(int num) {
		double[] mutzarim =new double[num];
		double sum = 0;
		boolean bool= false;
		for(int i =0 ; i<num;i++) {
			System.out.println("enter the frice formutzar number: " + (i+1));
			mutzarim[i] = reader.nextDouble();
			sum += mutzarim[i];
		}
		if(sum>150.0)
			bool =true;
		return  bool;
		
	}
	public static void checkAll() {
		boolean[] customers = new boolean[3];
		int count = 0;
		for(int i =0 ; i<customers.length;i++) {
			System.out.println("enter the amount of mutzarim");
			int num = reader.nextInt();
			customers[i] = check(num);
			if(customers[i] == false) {
				count ++;
			}
		}
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		
		checkAll();
	}

}
