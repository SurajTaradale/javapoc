// this program is use check the duplicate array-addrajendra
import java.util.*;
public class DuplicateArray {

	public static void main(String[] args) {
		String a[]= {"abc","cds","hdg","sad","cds"};
		System.out.println("enter the elements");
		for(int i=0; i<a.length; i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					System.out.println(a[j]);
				}
			}
			
			
					}
		int b[] = {1,2,3,4};
		for(int g:b){
			System.out.println(g);
		}
	for(String h:a){
		System.out.println(h);
	}
	}
	

}
