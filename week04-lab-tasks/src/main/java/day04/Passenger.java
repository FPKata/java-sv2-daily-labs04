package day04;

public class Passenger {
    private String name;
    private String ticket;
    private int packageNumber;

    public Passenger(String name, String  ticket, int packageNumber){
        this.name = name;
        this.ticket = ticket;
        this.packageNumber = packageNumber;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPackages() {
        return packageNumber;
    }
}
