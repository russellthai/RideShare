package RideShare;

public class Person {
    //fields
private int destination;
private boolean direction; //true for going right; false for going left
private int startLocation;

    //constructors 
    public Person (int myDestination, int myStart){
        destination = myDestination;
        startLocation = myStart;
        if (destination > startLocation){
            direction = true;
        } else {
            direction = false;
        }
    }
    //methods
    public int getDestination(){
        return destination;
    }
    public boolean getDirection(){
        return direction;
    }
    public int getStart(){
        return startLocation;
    }
    public String toString(){
        return super.toString() + " Start: " + startLocation + " Destination: " + destination + " Going right? " + direction;
    }
}
