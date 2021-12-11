package com.qac.coreJava.calander;

public class Calander {
	String day;
	int date;
	int week;
	String month;
	int year;
	boolean isHoliday;
	int noOfMeetings;

	public Calander(){
	System.out.println("Calander object is created and default values are assigned");
	}

	public Calander(String day, int date, int week, String month, int year, boolean isHoliday, int noOfMeetings){
	System.out.println("Calander object is created with all parameters declared");
		this.day = day;
		this.date = date;
		this.week = week;
		this.month = month;
		this.year = year;
		this.isHoliday = isHoliday;
		this.noOfMeetings = noOfMeetings;
	}

	public void checkingDate(){
	System.out.println("Today is:"+day);
	}

	public void checkingHoliday(){
	System.out.println("Holiday:"+isHoliday);
	}

	public void checkingMeeting(){
	System.out.println("No of meetings:"+noOfMeetings);
	}

}
