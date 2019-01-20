import java.util.*;
import java.lang.*;
import java.io.*;
class NextGreatestNumber
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in); 
	 int testcase = sc.nextInt();
	 int i=1;
	 while (i <= testcase)
	 {
	     int size = sc.nextInt();
	     int [] arr = new int[size];
	     for (int l=0; l< size; l++)
	     {
	         arr[l] = sc.nextInt();
	     }
	     
	     int element = -1;
	     for (int k=size-1; k>=0; k--)
	     {
	         if (element == -1)
	         {
	           element = arr[i];
	           arr[k] = -1;
	         } else if (arr[k] > element)
	         {
	             int temp = element;
	             element = arr[k];
	             arr[k] = temp;
	         } else
	         {
	             arr[k] = element;
	         }
	     }
	     
	     for (int j=0; j < size; j++) System.out.println(arr[j]);
	     
	    i++;
	 }
	 }
}
