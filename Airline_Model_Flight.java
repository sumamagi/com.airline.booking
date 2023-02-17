package com.airline.bookingmanagement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
public class Airline_Model_Flight {
private FlightReservationSystemController flightReservationSystemController;
	public Airline_Model_Flight(FlightReservationSystemController flightReservationSystemController) {
		this.flightReservationSystemController=flightReservationSystemController;
	}
		private String flightNumber;
		private String airline;
		private Date departureDate;
		private Date arrivalDate;
		private String origin;
		private String destination;
		private int capacity;
		private ArrayList<String> passengers;
		
		
		
		public Airline_Model_Flight(String flightNumber, String airline, Date departureDate, Date arrivalDate,
				String origin, String destination, int capacity) {
			super();
			
		}

		public Airline_Model_Flight(String flightNumber2, String originCity, String destinationCity,
				Date departureDate2, Date arrivalDate2, int availableSeats) {
		}

		public Airline_Model_Flight(String flightNumber,String airline, String originCity, String destinationCity,
				Date departureDate, Date arrivalDate, int availableSeats) {
			this.flightNumber = flightNumber;
			this.airline = airline;
			this.departureDate = departureDate;
			this.arrivalDate = arrivalDate;
			this.origin = origin;
			this.destination = destination;
			this.capacity = capacity;
		}

		public String getFlightNumber() {
		    return flightNumber;
		}

		public boolean reserveSeat(String passengerName) {
		    if (passengers.size() < capacity) {
		        passengers.add(passengerName);
		        return true;
		    } else {
		        return false;
		    }
		}

		public String toString() {
		    return "Flight " + flightNumber + " operated by " + airline + " from " + origin + " to " + destination + " with " + (capacity - passengers.size()) + " seats available.";
		}

		public int getAvailableSeats() {
			// TODO Auto-generated method stub
			return 0;
		}

		public void setAvailableSeats(int i) {
			// TODO Auto-generated method stub
			
		}
		}


