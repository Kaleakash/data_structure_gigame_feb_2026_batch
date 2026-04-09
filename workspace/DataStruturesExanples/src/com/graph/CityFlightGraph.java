package com.graph;

public class CityFlightGraph {
    String[] cities;      // Store city names (New York, Chicago, etc.)
    int[][] adj;          // Stores destination indices
    int[][] price;        // Stores ticket price
    int[] sizes;          // Tracks number of connections per city
    int vertices;

    CityFlightGraph(int v, int maxEdges) {
        vertices = v;
        cities = new String[v];
        adj = new int[v][maxEdges];
        price = new int[v][maxEdges];
        sizes = new int[v];
    }
    
 // ================= ADD CITY =================
    // Assign city name to index
    void addCity(int index, String name) {
        cities[index] = name;
        System.out.println(name+" added in graph");
    }

    // ================= GET INDEX =================
    // Convert city name → index
    int getIndex(String city) {
        for (int i = 0; i < vertices; i++) {
            if (cities[i].equals(city)) {
                return i;
            }
        }
        return -1; // not found
    }

    
 // ================= ADD FLIGHT =================
    // Directed graph (one-way flight)
    void addFlight(String from, String to, int cost) {
        int u = getIndex(from);
        int v = getIndex(to);
       
        if(u==-1 || v==-1) {
        	System.out.println("Source or distination not present");
        }else {
        // store destination and price
        adj[u][sizes[u]] = v;
        price[u][sizes[u]] = cost;
        sizes[u]++;
        System.out.println(from+" connected to "+to+" with cost as "+cost);
        }
    }

 // ================= PRINT GRAPH =================
    void printGraph() {
        System.out.println("\n✈️ Flight Network:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(cities[i] + " -> ");

            for (int j = 0; j < sizes[i]; j++) {
                System.out.print("(" + cities[adj[i][j]] + ", $" + price[i][j] + ") ");
            }
            System.out.println();
        }
    }

}
