package com.airline.bookingmanagement;


	import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

	public class FlightReservationSystemController {
	private	Airline_Model_Flight airline_Model_Flight;
		private FlightReservationSystemView flightReservationSystemView;

		public FlightReservationSystemController(FlightReservationSystemView flightReservationSystemView) {
			this.flightReservationSystemView=flightReservationSystemView;
			this.airline_Model_Flight=new Airline_Model_Flight(this);
		}
	
	private ArrayList<Airline_Model_Flight> flights;
	private FlightReservationSystemView view;

	
	public FlightReservationSystemController() {
	    flights = new ArrayList<>();
	    view = new FlightReservationSystemView();
	}

	public void run() {
	    boolean done = false;
	    while (!done) {
	        int choice = view.showMenu();
	        switch (choice) {
	        case 1:
	      
				try {
					flightManager.addFlight();
				} catch (ParseException e) {
					e.printStackTrace();
				}
	        break;
	        case 2:
	        flightManager.listFlight();
	        break;
	        case 3:
	       flightManager.reserveSeat();
	        break;
	        case 4:
	        done = true;
	        break;
	        default:
	        System.out.println("Invalid choice. Please try again.");
	        break;
	        }
	        }
	    }

	    }

