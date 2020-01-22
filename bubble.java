package bubble;

import java.util.Arrays;
import java.util.Scanner;

public class bubble {
	
	static void bubbleSort(int arr[], int n) 
    { 
        if (n == 1) 
            return; 
        
        for (int i=0; i<n-1; i++) 
            if (arr[i] > arr[i+1]) 
            {  
                int temp = arr[i]; 
                arr[i] = arr[i+1]; 
                arr[i+1] = temp; 
            } 
 
        bubbleSort(arr, n-1); 
    } 

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the size of array = ");
		int s = sc.nextInt();
		int i = 0 ;
		
		int arr[] = new int[s];
		while(i< s)
		{
			System.out.println("Enter element "+i);
			arr[i] = sc.nextInt();
			i ++;
		} 
	  
        bubbleSort(arr, arr.length); 
          
        System.out.println("Sorted array : "); 
        System.out.println(Arrays.toString(arr)); 

	}

}
