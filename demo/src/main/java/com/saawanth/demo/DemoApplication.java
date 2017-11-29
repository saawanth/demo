package com.saawanth.demo;


public class DemoApplication {

	public static void main(String[] args) {
		SalesData  data = new SalesData();
		
		displayGreeting();
		data.Display();
	}
	public static void displayGreeting() {
		System.out.println("HELLO HAPPY SALES PEOPLE!");
		System.out.println("THIS APP SHOWS SALES DATA");
	}
}
