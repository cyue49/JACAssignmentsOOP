package Assignment2.part1.pack5;

public class WorldWarIIAirplane extends Aircraft {
    private boolean twinEngine; // whether the plane has a twin engine
    private final long serialNum; // serial number
    private static long serialNumCounter = 80000;

    // default constructor
    public WorldWarIIAirplane(){
        super();
        twinEngine = true;
        serialNum = getNextSerialNumber();
    }

    // parameterized constructor
    public WorldWarIIAirplane(double price, double maxElevation, boolean twinEngine) {
        super(price, maxElevation);
        this.twinEngine = twinEngine;
        serialNum = getNextSerialNumber();
    }

    // copy constructor
    public WorldWarIIAirplane(WorldWarIIAirplane w){
        super(w);
        this.twinEngine = w.twinEngine;
        serialNum = getNextSerialNumber();
    }

    // indicate the next serial number that will be given to the next created object from the class
    public long getNextSerialNumber() {
        return serialNumCounter++;
    }

    // getters
    public boolean isTwinEngine() {
        return twinEngine;
    }

    @Override
    public long getSerialNum() {
        return serialNum;
    }

    // setters
    public void setTwinEngine(boolean twinEngine) {
        this.twinEngine = twinEngine;
    }

    // toString
    @Override
    public String toString() {
        if (twinEngine){
            return "The WorldWarIIAirplane #" + serialNum + " has: \n" +
                    getPrice() + "$ as the price, \n" +
                    getMaxElevation() + "ft as the maximum elevation, and \n" +
                    "has a twin engine. \n";
        }
        return "The WorldWarIIAirplane #" + serialNum + " has: \n" +
                getPrice() + "$ as the price, \n" +
                getMaxElevation() + "ft as the maximum elevation, and \n" +
                "does not have a twin engine. \n";
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WorldWarIIAirplane wwIIAirplane = (WorldWarIIAirplane) o;
        return twinEngine == wwIIAirplane.twinEngine;
    }
}
