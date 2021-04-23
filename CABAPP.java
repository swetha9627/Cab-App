package com.swetha;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class CABAPP {
	
	public static void LoginPage(long Number,String pass)
	{

	  String mobileNumber=String.valueOf(Number);
	 // System.out.println(mobileNumber.length());
     if(mobileNumber.length()==10)
     {
    	System.out.println("Mobile Number is Valid");
     }
     else {
    	 System.out.println("Mobile Number is Invalid");
     }
     if(pass.length()>=8)
{
	System.out.println("Password Is Valid");
	}
     else
     {
    	 System.out.println("Password is invalid");
     }
	}
	public static void CarTypes()
	{
		System.out.println("---Avaliable Cars---");
		System.out.println("1.Micro");
		System.out.println("2.Mini");
		System.out.println("3.Prime");
		}
	public static double CabCalculation(String cab,int amount)
	{
		double totalAmount = 0;
		
		if (cab.equalsIgnoreCase("micro")) {

			totalAmount = amount * 10;// calculating the total amount
			System.out.println("Your BillAmount is:" + totalAmount);
		} else if (cab.equalsIgnoreCase("mini")) {

			totalAmount = amount * 15;
			System.out.println("Your BillAmount is:" + totalAmount);
		} else if (cab.equalsIgnoreCase("prime")) {
			totalAmount = amount * 20;
			System.out.println("Your BillAmount is:" + totalAmount);
		}
		return totalAmount;
	}
		public static double GstValue(double totalAmount)
		{
			double GstAmount=0.07*totalAmount;
			return GstAmount;
		}
		public static void BookingCabDate(LocalDate journey,LocalTime PickUpTime)
		{
			LocalDate currentDate = LocalDate.now();
			if (journey.isBefore(currentDate))// comparing current date and booking date
			{
				System.out.println("Booking Date is Before than CurrentDate");
			} 
			else if(journey.isAfter(currentDate)) 
			{
				System.out.println("Booking Date is After the CurrentDate");
			}
			else
			{
			}
			LocalTime PickupTime=LocalTime.now();
			{
				System.out.println("Cab Booking Time Is Available");
			}
		}
		
			public static void PeakHours(int hour,double total, double GstAmount)
			
			{
				if (hour >= 17.00 && hour <= 19.00) // peak 5pm to 7pm
				{
					System.out.println("Your Cab Booked in Peak Hours");
					double pluspeak=total+GstAmount;
					double bill=pluspeak+(pluspeak*0.0125);
					System.out.println("Pick Hours Amount 1.25% Will Be High The Bill Amount is: "+bill);
				}
				else
				{
					System.out.println("You selected the normal hours");
				}
			}
			public static void SenoirCitizen(int yr,double value,double answer)
			{
		       int  age = 2021 - yr;
		       double  Fbill=value+answer;
		      double SeniorDiscount=Fbill*0.5;
		     
				if (age > 50)
				{
					System.out.println("For Senior Citizens Cab Fare 50% Discount:"+SeniorDiscount);// giving discount for
																											// senior citizen
				}
			
				
			}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Mobile number:");
	     long mobile=sc.nextLong();
	     System.out.println("Password:");
	     String passWord=sc.next();
	     LoginPage(mobile,passWord);
	     CarTypes();
	     System.out.println("Enter The Car Type:");
			String type = sc.next();// selecting car to travel
			System.out.println("Enter The Distance of Travel:");
			int drivethru = sc.nextInt();
			double value=CabCalculation(type,drivethru);
			System.out.println("Gst Value is: 7%");
			double answer=GstValue(value);
			System.out.println("Your GST amount is:"+answer);
			System.out.println("Total Bill Amount is with All Taxes:" +(value + answer));			
			System.out.println("Car Types");
			System.out.println("Micro");
			System.out.println("Mini");
			System.out.println("Prime");
			System.out.println("Enter the car type:");// booking car for checking availability on that date
			// getting date from user
			String Car = sc.next();
			System.out.println("Enter the booking date for your jorney in the format of yyyy-mm-dd:");
			String journeyDate = sc.next();
			LocalDate journey = LocalDate.parse(journeyDate);
			System.out.println("enter the pickuptime for your journey in the format of HH:MM:");// getting booking time from
			// user
			String pickupTime = sc.next();
			LocalTime pickup= LocalTime.parse(pickupTime);
			BookingCabDate(journey,pickup);
			int phour = pickup.getHour();
			PeakHours(phour,value, answer);
			System.out.println("Enter the Date of Birth of The Passenger:");
			String dob = sc.next();// date of birth of passenger
			LocalDate dateOfBirth = LocalDate.parse(dob);
			int yr = dateOfBirth.getYear();
			SenoirCitizen(yr,value,answer);
			System.out.println("Cab Booked Successfully");
			System.out.println("Happy Journey");
			sc.close();



	
	}
	}

