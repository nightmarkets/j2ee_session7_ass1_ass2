//One of the most straightforward and elementary searches is the sequential search, also known as a linear search.
//You should be able to search a given number and print whether the number is found or not.

package com.session7.assign2LinearSearch;

public class ass2LinearSearch {
public static boolean linearSearch (int myArray[], int searchKey){
	for (int i=0;i<myArray.length;i++){
		if (myArray[i]==searchKey){
			System.out.println("Element "+searchKey+" is found in index "+ i);
			return true;
		}
	}
	System.out.println("Element "+ searchKey +" isn't found");
	return false;
}

public static void main (String[] arg){
int array1[] = new int [] {1,2,3,0,8,9,24};

linearSearch(array1, 0);
linearSearch(array1,10);	

}
}
