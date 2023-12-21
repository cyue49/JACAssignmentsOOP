package Assignment2.part1.pack2;

import Assignment2.part1.pack1.WheeledTransportation;

public class Train extends WheeledTransportation {
    private int numVehicles; // number of vehicles
    private String startStation; // name of the starting station
    private String destStation; // name of the destination station
    private final long serialNum; // serial number
    private static long serialNumCounter = 10000;

    // default constructor
    public Train(){
        super();
        numVehicles = 0;
        startStation = "";
        destStation = "";
        serialNum = getNextSerialNumber();
    }

    // parameterized constructor
    public Train(int numWheels, double maxSpeed, int numVehicles, String startStation, String destStation) {
        super(numWheels, maxSpeed);
        this.numVehicles = numVehicles;
        this.startStation = startStation;
        this.destStation = destStation;
        serialNum = getNextSerialNumber();
    }

    // copy constructor
    public Train(Train t) {
        super(t);
        this.numVehicles = t.numVehicles;
        this.startStation = t.startStation;
        this.destStation = t.destStation;
        serialNum = getNextSerialNumber();
    }

    // indicate the next serial number that will be given to the next created object from the class
    public long getNextSerialNumber() {
        return serialNumCounter++;
    }

    // getters
    public int getNumVehicles() {
        return numVehicles;
    }

    public String getStartStation() {
        return startStation;
    }

    public String getDestStation() {
        return destStation;
    }

    @Override
    public long getSerialNum() {
        return serialNum;
    }

    // setters
    public void setNumVehicles(int numVehicles) {
        this.numVehicles = numVehicles;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public void setDestStation(String destStation) {
        this.destStation = destStation;
    }

    // toString

    @Override
    public String toString() {
        return "The Train #" + serialNum + " has: \n" +
                getNumWheels() + " number of wheels, \n" +
                getMaxSpeed() + "km/h as the maximum speed, \n" +
                numVehicles + " number of vehicles, \n" +
                startStation + " as the starting station, and\n" +
                destStation + " as the destination station.\n";
    }

    // equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Train train = (Train) o;
        return numVehicles == train.numVehicles && startStation.equals(train.startStation) && destStation.equals(train.destStation);
    }
}
