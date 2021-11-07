package day04;

public class PlaneMain {
    public static void main(String[] args) {
        Plane plane = new Plane(3);
        Passenger passenger1 = new Passenger("N1", "T1", 3);
        plane.addPassenger(passenger1);
        System.out.println();
        plane.addPassenger(new Passenger("N2", "T2", 4));
        plane.addPassenger(new Passenger("N3", "T3", 0));
        plane.addPassenger(new Passenger("N4", "T4", 5));
        plane.addPassenger(new Passenger("N5", "T5", 2));
        System.out.println("Maximum capacity: " + plane.getMaxCapacity());
        System.out.println("Number of packages: " + plane.getNumberOfPackages());
        System.out.println("Number of passengers: " + plane.getPassengers().size());
    }
}
