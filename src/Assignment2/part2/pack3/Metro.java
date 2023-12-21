package Assignment2.part2.pack3;

import Assignment2.part2.pack2.Train;

public class Metro extends Train {
    private int numStops; // total number of stops, total number of stations between starting and destination (inclusive)
    private final long serialNum; // serial number
    private static long serialNumCounter = 25000;

    // default constructor
    public Metro(){
        super();
        numStops = 0;
        serialNum = getNextSerialNumber();
    }

    // parameterized constructor
    public Metro(int numWheels, double maxSpeed, int numVehicles, String startStation, String destStation, int numStops) {
        super(numWheels, maxSpeed, numVehicles, startStation, destStation);
        this.numStops = numStops;
        serialNum = getNextSerialNumber();
    }

    // copy constructor
    public Metro(Metro m) {
        super(m);
        this.numStops = m.numStops;
        serialNum = getNextSerialNumber();
    }

    // indicate the next serial number that will be given to the next created object from the class
    public long getNextSerialNumber() {
        return serialNumCounter++;
    }

    // getters
    public int getNumStops() {
        return numStops;
    }

    @Override
    public long getSerialNum() {
        return serialNum;
    }

    // setter
    public void setNumStops(int numStops) {
        this.numStops = numStops;
    }

    // toString
    @Override
    public String toString() {
        return "The Metro #" + serialNum + " has: \n" +
                getNumWheels() + " number of wheels, \n" +
                getMaxSpeed() + "km/h as the maximum speed, \n" +
                getNumVehicles() + " number of vehicles, \n" +
                getStartStation() + " as the starting station, \n" +
                getDestStation() + " as the destination station, and \n" +
                numStops + " as the number of stops.\n";
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Metro metro = (Metro) o;
        return numStops == metro.numStops;
    }
}
