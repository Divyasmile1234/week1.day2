package week1.day2.clasroom.arrays;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		 
		int[] data = {3,2,11,4,6,7 };
		// 2,3,4,6,7,11
		Arrays.sort(data);
		int length= data.length;
		
		for(int i = 0; i < length;i ++)
		{
			System.out.println(data[1]);
			
		}
		System.out.println("Second Largest Number" + data[length - 2]);
	}
	
}