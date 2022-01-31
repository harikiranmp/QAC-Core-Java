package com.qac.coreJava.arrays;
import java.util.ArrayList;

public class ArrayListSample {

	public static void main(String[] args) {
		ArrayList AL = new ArrayList(); 
        
        AL.add("ABC");
        AL.add(123);
        AL.add(true);
        AL.add("12.34");
        
        System.out.println(AL);
        
        for(Object obj : AL) {
            System.out.println(obj);
            
            }
            
            ArrayList<String> ECommerce = new ArrayList<String>();
            ECommerce.add ("Amazon");
            ECommerce.add ("Flipkart");
            ECommerce.add ("Snapdeal");
            ECommerce.add ("TataCliq");
            ECommerce.add ("Shopclues");
            
            for (String EC : ECommerce){
                System.out.println(EC);
            }
            
            System.out.println("Object in the 3rd index is " +ECommerce.get(3));
            System.out.println("Index of Flipkart is " +ECommerce.indexOf("Flipkart"));
            
            System.out.println("Size of ECommerce Array is " +ECommerce.size());
            
            System.out.println("Check ECommrce is empty: " +ECommerce.isEmpty());
            
            System.out.println("Check if Shopclues is present: " +ECommerce.contains("Shopclues"));
            
            System.out.println("Remove Shopclues from ECommerce: " +ECommerce.remove("Shopclues"));
            
            System.out.println("ECommerce Sites after remove: " +ECommerce);
            
            ArrayList<String> OnlineShop = new ArrayList<String>();
            OnlineShop.addAll(ECommerce);
            OnlineShop.add(0,"Myntra");
            System.out.println("Online Shopping Sites: " +OnlineShop);
            
            System.out.println("Check if ECommerce and OnlineShop are same: " +ECommerce.equals(OnlineShop));

	}

}
