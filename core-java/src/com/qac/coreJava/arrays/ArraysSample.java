package com.qac.coreJava.arrays;
import java.util.Arrays;

public class ArraysSample {

	public static void main(String[] args) {
		int primeNumbers[] = {2,5,3,7,29,17,13,19,23,11};
        String elements = Arrays.toString(primeNumbers);
        System.out.println(elements);
        
        Arrays.sort(primeNumbers);
        System.out.println("Sorted array of elements:"+Arrays.toString(primeNumbers));
        
        int search = 13;
        int index = Arrays.binarySearch(primeNumbers,search);
        System.out.println("the index of the element 13 is "+index);
        
        int numbers[] = new int[6];
        Arrays.fill(numbers,10);
        Arrays.fill(numbers,3,5,12);
        System.out.println(Arrays.toString(numbers));
        
        int numbers2[] = Arrays.copyOf(numbers,6);
        System.out.println("numbers2 array is" +Arrays.toString(numbers2));

	}

}
