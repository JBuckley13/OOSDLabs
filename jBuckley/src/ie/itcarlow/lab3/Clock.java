package ie.itcarlow.lab3;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	19/10/2021
//Purpose 			: 	Lab 3 Question 1

import java.util.Calendar;

public class Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
		long start = System.currentTimeMillis();
		System.out.println(t.toMilitaryString());
		System.out.println(t.toString());
		long startSecond = System.currentTimeMillis();
		while(System.currentTimeMillis() < start + 60000)
		{
			if (System.currentTimeMillis() > startSecond + 1000)
			{
				t.tick();
				System.out.println(t.toMilitaryString());
				System.out.println(t.toString());
				startSecond = System.currentTimeMillis();
			}

		}
	}
}
