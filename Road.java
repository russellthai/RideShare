package RideShare;
public class Road {
    //fields
    private Station[] stations;
    private ArrayList<Car> cars;
    public static final int NUMSTATIONS = 32;

    //constructors

    public Road (Station [] mystations, ArrayList<Car> mycars){
        for(int i= 0; i< stations.length;i++){
            stations[i] = new Station (i);
        }
       cars = new ArrayList<Car>();
    }

    //methods

    //make stations
public void populateStations(int numPeople){
    for (int i=0; i<numPeople; i++){
        int start = (int)(Math.random())*(NUMSTATIONS);
        int stop = (int)(Math.random())* (NUMSTATIONS);
        stations[start].addPerson(new Person(stop,start));
    }

}
    //make a car
public void populateCars(int numCars){
    for(int i= 0; i< numCars;i++){
        int start = (int)(Math.random()*NUMSTATIONS);
        int stop = (int)(Math.random()*NUMSTATIONS);
        cars.add(new Car(stop,start));
    }
}
    //toString
    public String toString(){
        String s = "Stations:\n";
        for (Station st: stations){
            s +=st.toString();
            s += "\n";
        }
        s+= "Cars: \n";
        for (Car c: cars){
            s +=c.toString();
            s += "\n";
        }
        return s;
    }

    /*
     * This is the big method that moves all cars, unloads and loads passengers fro one 'tick'
     */
    public void move(){
        //unload all eligible people from cars to stations
        for (Car c : cars){
            Person p = c.unload(); //this gives an eligible person to remove or null
            while (true){
            if (p!=null){
                int location = c.getLocation();
                stations[location].addPerson(p);
            } else {
                break;
            }
        }
        }
        //load all people from stations to cars
        //going to similar, but now looping through the stations and putting in cars
        

        //move all the cars
        for(Car c: cars){
            c.move();
        }
    }
}
