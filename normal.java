package bubblesort;

import java.util.Arrays;
import java.util.Scanner;

public class normal {
	
	static void bubble(int arr[])
	{
		for(int i =0 ; i < arr.length; i++)
		{
			for(int j = 0 ; j<arr.length - i - 1 ; j ++)
			{
				if(arr[j] > arr[j + 1])
				{
					int temp =arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
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
	  
        bubble(arr);

	}

}
