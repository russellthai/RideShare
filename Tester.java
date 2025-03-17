package RideShare;


public class Tester {
    public static void main(String[] args) {
        Road r = new Road();
        System.out.println(r.toString());
        r.populateCars(5);
        r.populateStations(10);
        System.out.println("-----------");
        System.out.println(r.toString());
        for(int i = 0; i<32; i++){
            r.move();
        }

        System.out.println(r.toString());
        System.out.println("Total number of passengers that got to their destination: "+ r.getCompleted());

    }
}