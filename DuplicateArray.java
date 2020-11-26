import java.util.*;
public class DuplicateArray
{
	public static void main(String[] args) 
	{
		String a[]= {"abc","cds","hdg","sad","cds"};
		System.out.println("enter the elements");
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
		}
		
	}
	

}
