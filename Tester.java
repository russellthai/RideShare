package RideShare;
import java.util.*;


public class Tester {
    public static void main(String[] args) {
        Road r = new Road();
        System.out.println(r.toString());
        r.populateCars(5);
        r.populateStations(10);
        System.out.println("-----------");
        System.out.println(r.toString());





        Person a = new Person(5, 7);
        Person b = new Person(2,0);
        Person c = new Person(10,24);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        Car n = new Car (5,9);
        System.out.println(n);
        n.addPassenger(a);
        System.out.println(n);
        System.out.println(n.unload());
    }
}