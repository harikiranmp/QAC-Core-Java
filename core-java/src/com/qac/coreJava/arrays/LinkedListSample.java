package com.qac.coreJava.arrays;

import java.util.LinkedList;

public class LinkedListSample {
	public static void main(String []args){
		
	LinkedList<String> OnlineMedi = new LinkedList<String>();
    
    OnlineMedi.add("Medplus");
    OnlineMedi.add("Apollo");
    OnlineMedi.add("1mg");
    OnlineMedi.add("Pharmeasy");
    OnlineMedi.add("Netmeds");
    OnlineMedi.addFirst("Medlife");
    OnlineMedi.addLast("Docsmart");
    
    System.out.println(OnlineMedi);
    
    System.out.println("Object available in the first and last node are " +OnlineMedi.getFirst()+" & "+OnlineMedi.getLast());
    
    OnlineMedi.remove(6);
    
    System.out.println(OnlineMedi);
    
    OnlineMedi.set(0,"Practo");
    System.out.println(OnlineMedi);

	}
	
}
