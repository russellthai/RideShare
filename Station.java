package RideShare;
public class Station {
    //fields
    private ArrayList<Person> waitingLeft;
    private ArrayList<Person> waitingRight;
    private ArrayList<Person> completed;
    private int number;

    //constructors
    public Station (int myNumber){
        number = myNumber;
        waitingLeft = new ArrayList<Person>();
        waitingRight = new ArrayList<Person>();
        completed = new ArrayList<Person>();
    }

    //methods
    public void addPerson(Person p){
        if(p.getDestination()==number){
            completed.add(p);
        } else if (p.getDirection()){
            waitingRight.add(p);
        } else {
            waitingLeft.add(p);
        }
    }
    
    public Person nextLeft(){
        if(waitingLeft.size()>0){
            return waitingLeft.remove(0);
        } else {
            return null;
        }
    }

    public Person nextRight(){
        if(waitingRight.size()>0){
            return waitingRight.remove(0);
        } else{
            return null;
        }
    }

    public int completedCount(){
        return completed.size();
    }

    public String toString(){
        String s = "Station: " + number;
        System.out.println("");
        s += "Leftbound: " + waitingLeft.toString();
        System.out.println();
        s += "Righbound: " + waitingRight.toString();
        System.out.println();
        s += "Completed: " + completed.toString();
        System.out.println();
    }

}
