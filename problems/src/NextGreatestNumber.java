import java.util.*;
import java.lang.*;
import java.io.*;
class NextGreatestNumber
 {
	public static void main (String[] args)
	 {
	 // DOESN'T works with larger number of array
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
	
	// Works with larger number of array 
	private void usingStack()
	{
		int t,n,i,j,max=-1;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        while (t != 0)
        {
            n = scanner.nextInt();
            Stack<Integer> stack = new Stack<>();
            int[] array = new int[n];
            for(i=0;i<n;i++)
            {
                array[i] = scanner.nextInt();
                stack.push(array[i]);
            }
            max = -1;
            for(i=n-1;i>=0;i--)
            {
                int temp = stack.pop();
                if(max == -1)
                {
                    array[i] = max;
                    max = temp;
                }
                else
                {
                    array[i] = max;
                    max = max > temp ? max : temp ;
                }
            }
            for(i=0;i<n;i++)
            {
                System.out.print(array[i] + " ");
            }
            System.out.println("");
            t--;
        }
	}
}
