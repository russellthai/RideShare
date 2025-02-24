package RideShare;
import java.util.*;

public class Car {

    //fields
    private int destination;
    private int currentLocation;
    private boolean direction;
    private ArrayList<Person> passengers;


    //constructors
    public Car (int myDestination, int start){
        destination = myDestination;
        currentLocation = start;
        direction = destination > currentLocation;
        passengers = new ArrayList<Person>();
    }

    //methods
    public String toString(){
        return super.toString() + "Destination: " + destination + 
        " Current Location: " + currentLocation + " Going right? " + direction + " Passengers: " + passengers;
    }

    public void addPassenger(Person p){
        if(passengers.size() >= 3){
           System.out.println("ERROR: NO MORE ROOM!");
    } else {
        passengers.add(p);
    }
}
    public boolean hasRoom(){
        return passengers.size() <3;
    }
}
