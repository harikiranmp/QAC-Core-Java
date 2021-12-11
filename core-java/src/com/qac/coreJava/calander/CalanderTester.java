package com.qac.coreJava.calander;

public class CalanderTester {

	public static void main(String[] args) {
		System.out.println("Main method started");

		Calander calander_2021 = new Calander("Thursday",25,4,"November",2021,false,1);
		System.out.println("day:"+calander_2021.day +"\n"+"date:"+calander_2021.date+"\n"+"Week:"+calander_2021.week +"\n"+ "Month:"+calander_2021.month+"\n"+ "Year:"+calander_2021.year+"\n"+ "is it a Holiday:"+calander_2021.isHoliday);

		Calander calander_2022 = new Calander("Monday",25,4,"December",2022,true,1);
		System.out.println("day:"+calander_2022.day +"\n"+"date:"+calander_2022.date+"\n"+"Week:"+calander_2022.week +"\n"+ "Month:"+calander_2022.month+"\n"+ "Year:"+calander_2022.year+"\n"+ "is it a Holiday:"+calander_2022.isHoliday);

		calander_2021.checkingDate();
		calander_2021.checkingHoliday();
		calander_2021.checkingMeeting();

		System.out.println("Main method ended");


	}

}
