import java.util.Arrays;
import java.util.Scanner;

public class AddArrays {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("please enter the dimensions");
		System.out.println("please enter the rows length");
		int m= scan.nextInt();
		System.out.println("please enter the column length");
		int n= scan.nextInt();
		int a[][]= new int[m][n]; 
		int b[][]= new int[m][n]; 
		int c[][]= new int[m][n]; 
		System.out.println("please enter the elements for 1st array:");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.println("Row"+i+"||column"+j);
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("please enter the elements for 2nd array:");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.println("Row"+i+"||column"+j);
				b[i][j]=scan.nextInt();
			}
		}
		System.out.println("please enter the elements for 2nd array:");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.println("Row"+i+"||column"+j);
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("3rd array");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
		}
	
	
	}
}
