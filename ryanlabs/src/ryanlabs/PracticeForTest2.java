package ryanlabs;

import java.util.Scanner;

public class PracticeForTest2 {
	public static Scanner reader = new Scanner(System.in);
	
	public static int[] checkAge(int num) {
		int[] mitkanim = new int[3];
		if(num >= 18) {
			mitkanim[0] = 1;
			mitkanim[1] = 1;
			mitkanim[2] = 1;
		}
		else if(num >= 16){
			mitkanim[0] = 1;
			mitkanim[1] = 1;
			mitkanim[2] = 0;
		}
		else if(num >= 12){
			mitkanim[0] = 1;
			mitkanim[1] = 0;
			mitkanim[2] = 0;
		}
		return mitkanim;
		}
		
	
	public static void count() {
		int mitkan1 = 0, mitkan2 =0, mitkan3 =0;
		boolean open = true;
		while(open) {
			System.out.println("enter your age");
			int num =reader.nextInt();
			int[] countMitkanim = checkAge(num);
			if (countMitkanim[2] == 1) {
				mitkan1++;
				mitkan2++;
				mitkan3++;
			}
			else if (countMitkanim[1] == 1) {
				mitkan1++;
				mitkan2++;
			}
			else if (countMitkanim[0] == 1)
				mitkan1++;
			else
				open = false;
			
		}
		System.out.println(mitkan1 + "," + mitkan2 + "," +mitkan3);
	}
	public static void main(String[] args) {
		count();

	}

}
