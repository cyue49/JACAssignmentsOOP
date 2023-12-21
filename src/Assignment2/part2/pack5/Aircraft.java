package Assignment2.part2.pack5;

public class Aircraft {
    private double price; // price
    private double maxElevation; // maximum elevation, maximum possible height aircraft can reach
    private final long serialNum; // serial number
    private static long serialNumCounter = 75000;

    // default constructor
    public Aircraft(){
        price = 0;
        maxElevation = 0;
        serialNum = getNextSerialNumber();
    }

    // parameterized constructor
    public Aircraft(double price, double maxElevation) {
        this.price = price;
        this.maxElevation = maxElevation;
        serialNum = getNextSerialNumber();
    }

    // copy constructor
    public Aircraft(Aircraft a){
        this.price = a.price;
        this.maxElevation = a.maxElevation;
        serialNum = getNextSerialNumber();
    }

    // indicate the next serial number that will be given to the next created object from the class
    public long getNextSerialNumber() {
        return serialNumCounter++;
    }

    // getters
    public double getPrice() {
        return price;
    }

    public double getMaxElevation() {
        return maxElevation;
    }

    public long getSerialNum() {
        return serialNum;
    }

    // setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setMaxElevation(double maxElevation) {
        this.maxElevation = maxElevation;
    }

    // toString
    @Override
    public String toString() {
        return "The Aircraft #" + serialNum + " has: \n" +
                price + "$ as the price and \n" +
                maxElevation + "ft as the maximum elevation.\n";
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return price == aircraft.price && maxElevation == aircraft.maxElevation;
    }
}
