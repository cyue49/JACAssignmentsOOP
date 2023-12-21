package Assignment2.part1.pack4;

import Assignment2.part1.pack1.WheeledTransportation;

public class Monowheel extends WheeledTransportation {
    private double maxWeight; // maximum weight, maximum weight that the Monowheel supports
    private final long serialNum; // serial number
    private static long serialNumCounter = 55000;

    // default constructor
    public Monowheel(){
        super();
        maxWeight = 0;
        serialNum = getNextSerialNumber();
    }

    // parameterized constructor
    public Monowheel(int numWheels, double maxSpeed, double maxWeight) {
        super(numWheels, maxSpeed);
        this.maxWeight = maxWeight;
        serialNum = getNextSerialNumber();
    }

    // copy constructor
    public Monowheel(Monowheel m) {
        super(m);
        this.maxWeight = m.maxWeight;
        serialNum = getNextSerialNumber();
    }

    // indicate the next serial number that will be given to the next created object from the class
    public long getNextSerialNumber() {
        return serialNumCounter++;
    }

    // getters
    public double getMaxWeight() {
        return maxWeight;
    }

    @Override
    public long getSerialNum() {
        return serialNum;
    }

    // setters
    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    // toString
    @Override
    public String toString() {
        return "The Monowheel #" + serialNum + " has: \n" +
                getNumWheels() + " number of wheels, \n" +
                getMaxSpeed() + "km/h as the maximum speed, and \n" +
                maxWeight + "kg as the maximum weight.\n";
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monowheel monowheel = (Monowheel) o;
        return maxWeight == monowheel.maxWeight;
    }
}
