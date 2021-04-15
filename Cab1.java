package com.swetha;

import java.util.*;
import java.time.*;

public class Cab1 {

	public static void main(String[] args) {
		// Level 1
		Scanner sc = new Scanner(System.in);
		System.out.print("Mobile No:");
		Long mobileno = sc.nextLong();// length for mobile number
		String mobileNumber = String.valueOf(mobileno);
		if (mobileNumber.length() == 10)// checking mobile number length and checking valid or not
		{
		} else {
			System.out.println("Mobile number is invalid");
		}
		System.out.print("Password:");
		String passWord = sc.next();
		if (passWord.length() >= 8)// reading length of the password
		{
		} else {
			System.out.println("Password is Incorrect");

		}
		// Level 2
		String car = "CarTypes";// printing cab types available
		System.out.println("Micro(Rs10/km)");
		System.out.println("Mini(Rs15/km)");
		System.out.println("Prime(Rs20/km");
		// Level 3
		System.out.println("Enter The Car Type:");
		String type = sc.next();// selecting car to travel
		System.out.println("Enter The Distance of Travel:");
		int drivethru = sc.nextInt();
		float totalAmount = 0;
		if (type.equalsIgnoreCase("micro")) {

			totalAmount = drivethru * 10;// calculating the total amount
			System.out.println("Your BillAmount is:" + totalAmount);
		} else if (type.equalsIgnoreCase("mini")) {

			totalAmount = drivethru * 15;
			System.out.println("Your BillAmount is:" + totalAmount);
		} else if (type.equalsIgnoreCase("prime")) {
			totalAmount = drivethru * 20;
			System.out.println("Your BillAmount is:" + totalAmount);
		}

		// Level 4

		System.out.println("GST value is:7%");
		double GST = totalAmount * 0.07;// Gst value calculating
		System.out.println("Total GST value is:" + GST);
		System.out.println("Total Bill Amount is with All Taxes:" + GST + totalAmount);
		// Level 5
		System.out.println("Car Types");
		System.out.println("Micro");
		System.out.println("Mini");
		System.out.println("Prime");
		System.out.println("Enter the car type:");// booking car for checking availability on that date
		String Car = sc.next();// getting date from user
		System.out.println("Enter the booking date for your jorney in the format of yyyy-mm-dd:");
		String journeyDate = sc.next();
		LocalDate journey = LocalDate.parse(journeyDate);
		LocalDate bookingDate = LocalDate.now();
		LocalDate currentDate = LocalDate.now();
		if (journey.isBefore(currentDate))// comparing current date and booking date
		{
			System.out.println("Booking Date is Before than CurrentDate");
		} else if (journey.isAfter(currentDate)) {
			System.out.println("Booking Date is After the CurrentDate");
		}

		System.out.println("enter the pickuptime for your journey in the format of HH:MM:");// getting booking time from
																							// user
		String pickupTime = sc.next();
		LocalTime pickuptime1 = LocalTime.parse(pickupTime);
        //Level 6
		int hour = pickuptime1.getHour();
		if (hour >= 17.00 && hour <= 19.00) // peak 5pm to 7pm
		{
			System.out
					.println("You Selected Pick Hours In the Pick Hours Amount 1.25% Will Be High The Bill Amount is: "
							+ totalAmount * 0.0125);

		} else {
			System.out.println("You selected the normal hours");
		}
		// Level 7
		System.out.println("Enter the Date of Birth of The Passenger:");
		String dob = sc.next();// date of birth of passenger
		LocalDate dateOfBirth = LocalDate.parse(dob);
		int yr = dateOfBirth.getYear();// calculating year
		int age = 2021 - yr;
		if (age > 50) {
			System.out.println("For Senior Citizens Cab Fare 50% Discount:" + totalAmount * 0.5);// giving discount for
																									// senior citizen
		}
		System.out.println("Cab Booked Successfully");
		System.out.println("Happy Journey");

	}

}