package com.airline.bookingmanagement;


	import java.util.Scanner;

	public class FlightReservationSystemView {
		private FlightReservationSystemController flightReservationSystemController;
		private Scanner scanner;


		FlightReservationSystemView(){
			flightReservationSystemController=new FlightReservationSystemController(this);
			scanner = new Scanner(System.in);
		}
	
	public static void main(String[] args) {
		FlightReservationSystemController frsc=new FlightReservationSystemController();
		frsc.run();
	}


	public int showMenu() {
	    System.out.println("1. Add Flight");
	    System.out.println("2. List Flights");
	    System.out.println("3. Reserve Seat");
	    System.out.println("4. Exit");
	    System.out.print("Enter choice: ");
	    int choice = scanner.nextInt();
	    scanner.nextLine();
	    return choice;
	}

	public void showInvalidChoice() {
	    System.out.println("Invalid choice.");
	}

	public String getFlightNumber() {
	    System.out.print("Enter flight number: ");
	    return scanner.nextLine();
	}

	public String getAirline() {
	    System.out.print("Enter airline: ");
	    return scanner.nextLine();
	}

	public String getOrigin() {
	    System.out.print("Enter origin: ");
	    return scanner.nextLine();
	}

	public String getDestination() {
	    System.out.print("Enter destination: ");
	    return scanner.nextLine();
	}

	public int getCapacity() {
	    System.out.print("Enter capacity: ");
	    return scanner.nextInt();
	}

	public void showFlightAdded() {
	    System.out.println("Flight added successfully.");
	}

	public void showNoFlightsFound() {
	    System.out.println("No flights found.");
	}

	public void showFlight(Airline_Model_Flight flight) {
	    System.out.println(flight);
	}

	public String getPassengerName() {
	    System.out.print("Enter passenger name: ");
	    return scanner.nextLine();
	}

	public void showSeatReserved() {
	    System.out.println("Seat reserved successfully.");
	}

	public void showSeatNotReserved() {
	    System.out.println("Seat could not be reserved.");
	}

	public void showFlightNotFound() {
	    System.out.println("Flight not found.");
	
	
	}

}