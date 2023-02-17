package com.airline.bookingmanagement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class flightManager {
   static List <Airline_Model_Flight> list=new ArrayList<>();
 
public static void addFlight() throws ParseException {
    // Code to add a new Flight object to the flights list
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the flight number: ");
    String flightNumber = scanner.nextLine();
    System.out.print("Enter the origin city: ");
    String originCity = scanner.nextLine();
   
    System.out.print("Enter the destination city: ");
    String destinationCity = scanner.nextLine();
    System.out.print("Enter the airline name: ");
    String airline = scanner.nextLine();
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");  
   
    System.out.print("Enter the departure date and time (yyyy-MM-dd ): ");
    String departureDateTimeString = scanner.nextLine();
    Date departureDate=dateFormat.parse(departureDateTimeString);
   
    System.out.print("Enter the arrival date and time (yyyy-MM-dd ): ");
    String arrivalDateTimeString = scanner.nextLine();
    Date arrivalDate=dateFormat.parse(arrivalDateTimeString);
   
    System.out.print("Enter the number of available seats: ");
    int availableSeats = scanner.nextInt();
    scanner.nextLine();
   Airline_Model_Flight flight = new Airline_Model_Flight(flightNumber,originCity,destinationCity,departureDate,arrivalDate,availableSeats);
  
  list.add(flight);

    System.out.println("Flight added successfully.");
}

public static void listFlight() {
    // Code to list all the Flight objects in the flights list
    System.out.println("List of all available flights:");
    for (Airline_Model_Flight flight : list) {
        System.out.println(flight);
    }
}

public static void reserveSeat() {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the flight number: ");
    String flightNumber = scanner.nextLine();
    boolean foundFlight = false;
    for (Airline_Model_Flight flight :list) {
        if (flight.getFlightNumber().equals(flightNumber)) {
            foundFlight = true;
            if (flight.getAvailableSeats() > 0) {
                flight.setAvailableSeats(flight.getAvailableSeats() - 1);
                System.out.println("Seat reserved successfully.");
            } else {
                System.out.println("No available seats on this flight.");
            }
            break;
        }
    }
    if (!foundFlight) {
        System.out.println("Flight not found.");
    }
}
}
