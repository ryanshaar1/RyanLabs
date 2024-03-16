

package ryanlabs;
import java.util.*;
public class Maaaarahot5ex1 {

	
	
	public static Scanner reader= new Scanner(System.in);
	public static void main(String[] args) {
		int sum=0 ;int min=1000000000; int max=0;
		int[] minarr = new int[30];
		int[] maxarr = new int[30];
		int[] floors = new int[30];
		int[] offices = new int[7];
		for(int i =0;  i<30;i++) {
			for(int g=0;g<7;g++) {
				System.out.println("enter a number");
				offices[g]=reader.nextInt();
				sum=sum+offices[g];
			
			}
			floors[i]=sum;
			sum=0;
		}
		for(int i=0;i<30;i++)
		System.out.print(floors[i]+ " ");
		for(int i =0;  i<30;i++) {
			if (offices[i]<min)
				min=offices[i];}
		for(int i =0;  i<30;i++) {
			if(floors[i]==min)
				minarr[i]=floors[i];}
		for(int i=0;i<30;i++) {
			if(minarr[i]!=0)
			System.out.print(minarr[i]+ " ");
				
			}
		System.out.println("the min numbes of wworkers is: "+ min);
		for(int i=0;i<30;i++)
		System.out.print(floors[i]+ " ");
		for(int i =0;  i<30;i++) {
			if (offices[i]>max)
				max=offices[i];}
		for(int i =0;  i<30;i++) {
			if(floors[i]==max)
				maxarr[i]=floors[i];}
		for(int i=0;i<30;i++) {
			if(maxarr[i]!=0)
			System.out.print(maxarr[i]+ " ");
				
			}
		System.out.println("the mmax numbes of wworkers is: "+ max);
			}
}
	


