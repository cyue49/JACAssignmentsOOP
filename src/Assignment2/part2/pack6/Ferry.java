package Assignment2.part2.pack6;

public class Ferry {
    private double maxSpeed; // maximum speed
    private double maxLoad; // maximum load, maximum load that the feery can carry
    private final long serialNum; // serial number
    private static long serialNumCounter = 70000;

    // default constructor
    public Ferry(){
        maxSpeed = 0;
        maxLoad = 0;
        serialNum = getNextSerialNumber();
    }

    // parameterized constructor
    public Ferry(double maxSpeed, double maxLoad) {
        this.maxSpeed = maxSpeed;
        this.maxLoad = maxLoad;
        serialNum = getNextSerialNumber();
    }

    // copy constructor
    public Ferry(Ferry f){
        this.maxSpeed = f.maxSpeed;
        this.maxLoad = f.maxLoad;
        serialNum = getNextSerialNumber();
    }

    // indicate the next serial number that will be given to the next created object from the class
    public long getNextSerialNumber() {
        return serialNumCounter++;
    }

    // getters
    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public long getSerialNum() {
        return serialNum;
    }

    // setters
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    // toString
    @Override
    public String toString() {
        return "The Ferry #" + serialNum + " has: \n" +
                maxSpeed + "km/h as the maximum speed and \n" +
                maxLoad + "kg as the maximum load.\n";
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ferry ferry = (Ferry) o;
        return maxSpeed == ferry.maxSpeed && maxLoad == ferry.maxLoad;
    }
}
