package com.blz.firstday;
	//created class
public class PrintSecondLasrgestNumberFromArray {
	
	//created function to print second largest elements
	static void print2largest(int arr[],int arr_size) {
		
		int i, first,second;
		
		//there should be atleast two element to check
			if(arr_size<2) {
				System.out.println("invalid input");
			return ;
			
		}
			//sort the array
		Arrays.sort(arr);
		
		//start from second largest element 
		for(i = arr_size-2; i>+0; i--) {
			
			if (arr[i]!=arr[arr_size-1]) {
				
				System.out.println("the second largest no is "  +arr[i]);
				return ;
			}
			}
	}
	
 public static void main(String[] args) {
	 int arr[] = {2,3,4,5,2};
	 
	 int n=arr.length;
	 print2largest(arr,n);
	
}
}
