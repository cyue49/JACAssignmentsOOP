package Assignment2.part2;

import Assignment2.part2.pack1.WheeledTransportation;
import Assignment2.part2.pack2.Train;
import Assignment2.part2.pack2.Tram;
import Assignment2.part2.pack3.Metro;
import Assignment2.part2.pack4.Monowheel;
import Assignment2.part2.pack5.Aircraft;
import Assignment2.part2.pack5.WorldWarIIAirplane;
import Assignment2.part2.pack6.Ferry;

public class Main {
    public static void main(String[] args) {
        // creating objects
        WheeledTransportation w = new WheeledTransportation(6, 300);
        WheeledTransportation w2 = new WheeledTransportation(14, 250);
        WheeledTransportation w3 = new WheeledTransportation(30, 120);

        Train t = new Train(20,150,12,"Station A","Station B");
        Train t2 = new Train(12,100,24,"Station C","Station D");
        Train t3 = new Train(10,140,30,"Station E","Station F");

        Metro m = new Metro(18,70,8,"Station A", "Station Z", 24);
        Metro m2 = new Metro(40,60,9,"Spring", "Summer", 11);
        Metro m3 = new Metro(20,120,14,"Fall", "Winter", 23);

        Tram tr = new Tram(22,60,24,"Station A", "Station X", 14, 1980);
        Tram tr2 = new Tram(34,70,57,"Station B", "Station Y", 15, 1990);
        Tram tr3 = new Tram(45,80,45,"Station C", "Station Z", 16, 1970);

        Monowheel mw = new Monowheel(1,40,100);
        Monowheel mw2 = new Monowheel(1,50,60);

        Ferry f = new Ferry(40,100);
        Ferry f2 = new Ferry(45,123);

        Aircraft a = new Aircraft(20000,6000);
        Aircraft a2 = new Aircraft(15000,4000);

        WorldWarIIAirplane ww = new WorldWarIIAirplane(15000, 5000, false);
        WorldWarIIAirplane ww2 = new WorldWarIIAirplane(20000, 4500, true);

        Object[] arr = {w,w2,w3,t,t2,t3,m,m2,m3,tr,tr2,tr3,mw,mw2,f,f2,a,a2,ww,ww2};

        // testing out the copyTheObjects method
        System.out.println("ORIGINAL ARRAY: ");
        printArr(arr);
        Object[] copy = copyTheObject(arr);
        System.out.println("COPIED ARRAY: ");
        printArr(copy);

        w.setMaxSpeed(0);
        printArr(copy);
    }

    // Print an array of Object
    public static void printArr(Object[] arr){
        System.out.println("==========================================================================================");
        for (Object o: arr){
            System.out.println(o);
            System.out.println("------------------------");
        }
    }

    // takes as input an array of Object and return a copy of it
    public static Object[] copyTheObject(Object[] objArr){
        Object[] arr = new Object[objArr.length]; // create new array of same length
        for (int i=0; i<objArr.length; i++){
            arr[i] = objArr[i];
        }
        return arr;
    }
}
