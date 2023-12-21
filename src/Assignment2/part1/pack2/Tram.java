package Assignment2.part1.pack2;

import Assignment2.part1.pack3.Metro;

public class Tram extends Metro {
    private int creationYear; // year of creation, year tram was created
    private final long serialNum; // serial number
    private static long serialNumCounter = 30000;

    // default constructor
    public Tram(){
        super();
        creationYear = 0;
        serialNum = getNextSerialNumber();
    }

    // parameterized constructor
    public Tram(int numWheels, double maxSpeed, int numVehicles, String startStation, String destStation, int numStops, int creationYear) {
        super(numWheels, maxSpeed, numVehicles, startStation, destStation, numStops);
        this.creationYear = creationYear;
        serialNum = getNextSerialNumber();
    }


    // copy constructor
    public Tram(Tram t) {
        super(t);
        this.creationYear = t.creationYear;
        serialNum = getNextSerialNumber();
    }

    // indicate the next serial number that will be given to the next created object from the class
    public long getNextSerialNumber() {
        return serialNumCounter++;
    }

    // getters
    public int getCreationYear() {
        return creationYear;
    }

    @Override
    public long getSerialNum() {
        return serialNum;
    }

    // setters
    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    // toString
    @Override
    public String toString() {
        return "The Tram #" + serialNum + " has: \n" +
                getNumWheels() + " number of wheels, \n" +
                getMaxSpeed() + "km/h as the maximum speed, \n" +
                getNumVehicles() + " number of vehicles, \n" +
                getStartStation() + " as the starting station, \n" +
                getDestStation() + " as the destination station, \n" +
                getNumStops() + " as the number of stops, and \n" +
                creationYear + " as the creation year. \n";
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tram tram = (Tram) o;
        return creationYear == tram.creationYear;
    }
}
