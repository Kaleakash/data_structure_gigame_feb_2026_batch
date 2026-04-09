package com.graph;

public class FlighGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  CityFlightGraph g = new CityFlightGraph(6, 5);
		  	g.addCity(0, "New York");
	        g.addCity(1, "Los Angeles");
	        g.addCity(2, "Chicago");
	        g.addCity(3, "Dallas");
	        g.addCity(4, "Atlanta");
	        g.addCity(5, "Seattle");
	
	        
	     // Add Flights (Directed + Price)
	        //g.addFlight("New York", "B", 300);
	        g.addFlight("New York", "Los Angeles", 300);
	        g.addFlight("New York", "Chicago", 150);
	        g.addFlight("Chicago", "Dallas", 120);
	        g.addFlight("Dallas", "Atlanta", 100);
	        g.addFlight("Atlanta", "Los Angeles", 180);
	        g.addFlight("Los Angeles", "Seattle", 200);
	        g.addFlight("Seattle", "New York", 350); // cycle
	        System.out.println("--------------------");
	        g.printGraph();
	}

	
}
