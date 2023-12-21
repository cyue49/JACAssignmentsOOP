package Assignment2.part2.pack1;

public class WheeledTransportation {
    private int numWheels; // number of wheels
    private double maxSpeed; // maximum speed
    private final long serialNum; // serial number
    private static long serialNumCounter = 5000;

    // default constructor
    public WheeledTransportation(){
        numWheels = 0;
        maxSpeed = 0;
        serialNum = getNextSerialNumber();
    }

    // parameterized constructor
    public WheeledTransportation(int numWheels, double maxSpeed) {
        this.numWheels = numWheels;
        this.maxSpeed = maxSpeed;
        serialNum = getNextSerialNumber();
    }

    // copy constructor
    public WheeledTransportation(WheeledTransportation w){
        numWheels = w.numWheels;
        maxSpeed = w.maxSpeed;
        serialNum = getNextSerialNumber();
    }

    // indicate the next serial number that will be given to the next created object from the class
    public long getNextSerialNumber() {
        return serialNumCounter++;
    }

    // getters
    public int getNumWheels() {
        return numWheels;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public long getSerialNum() {
        return serialNum;
    }

    // setters
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // toString
    @Override
    public String toString() {
        return "The WheeledTransportation #" + serialNum + " has: \n" +
                numWheels + " number of wheels and\n" +
                maxSpeed + "km/h as the maximum speed.\n";
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WheeledTransportation w = (WheeledTransportation) o;
        return numWheels == w.numWheels && maxSpeed == w.maxSpeed;
    }
}
