package Assignment2.part1;

import Assignment2.part1.pack1.WheeledTransportation;
import Assignment2.part1.pack2.Train;
import Assignment2.part1.pack2.Tram;
import Assignment2.part1.pack3.Metro;
import Assignment2.part1.pack4.Monowheel;
import Assignment2.part1.pack5.Aircraft;
import Assignment2.part1.pack5.WorldWarIIAirplane;
import Assignment2.part1.pack6.Ferry;

import java.lang.reflect.Member;

public class Main {
    public static void main(String[] args) {
        // testing out default constructors
        System.out.println("================= Testing out with default constructor =================");

        // creating objects
        WheeledTransportation w = new WheeledTransportation();
        Train t = new Train();
        Metro m = new Metro();
        Tram tr = new Tram();
        Monowheel mw = new Monowheel();
        Ferry f = new Ferry();
        Aircraft a = new Aircraft();
        WorldWarIIAirplane ww = new WorldWarIIAirplane();


        // testing toString
        System.out.println(w);
        System.out.println(t);
        System.out.println(m);
        System.out.println(tr);
        System.out.println(mw);
        System.out.println(f);
        System.out.println(a);
        System.out.println(ww);

        // testing out parameterized constructors
        System.out.println("================= Testing out with parameterized constructor =================");

        // creating objects
        WheeledTransportation w2 = new WheeledTransportation(6, 300);
        Train t2 = new Train(20,150,12,"Station A","Station B");
        Metro m2 = new Metro(18,70,8,"Station C", "Station D", 24);
        Tram tr2 = new Tram(22,60,24,"Station A", "Station Z", 14, 1980);
        Monowheel mw2 = new Monowheel(1,50,60);
        Ferry f2 = new Ferry(40,100);
        Aircraft a2 = new Aircraft(20000,6000);
        WorldWarIIAirplane ww2 = new WorldWarIIAirplane(15000, 5000, false);

        // testing toString
        System.out.println(w2);
        System.out.println(t2);
        System.out.println(m2);
        System.out.println(tr2);
        System.out.println(mw2);
        System.out.println(f2);
        System.out.println(a2);
        System.out.println(ww2);

        // testing out copy constructors
        System.out.println("================= Testing out with copy constructor =================");

        // creating objects
        WheeledTransportation w3 = new WheeledTransportation(w2);
        Train t3 = new Train(t2);
        Metro m3 = new Metro(m2);
        Tram tr3 = new Tram(tr2);
        Monowheel mw3 = new Monowheel(mw2);
        Ferry f3 = new Ferry(f2);
        Aircraft a3 = new Aircraft(a2);
        WorldWarIIAirplane ww3 = new WorldWarIIAirplane(ww2);

        // testing toString
        System.out.println(w2);
        System.out.println(t3);
        System.out.println(m3);
        System.out.println(tr3);
        System.out.println(mw3);
        System.out.println(f3);
        System.out.println(a3);
        System.out.println(ww3);

        // testing equals with objects of the same class (if correct, printed result should always alternate between true and false)
        System.out.println("================= Testing Equality Between Objects of the Same Class =================");
        System.out.println(w3.equals(w2));
        System.out.println(w3.equals(w));
        System.out.println(t3.equals(t2));
        System.out.println(t3.equals(t));
        System.out.println(m3.equals(m2));
        System.out.println(m3.equals(m));
        System.out.println(tr3.equals(tr2));
        System.out.println(tr3.equals(tr));
        System.out.println(mw3.equals(mw2));
        System.out.println(mw3.equals(mw));
        System.out.println(f3.equals(f2));
        System.out.println(f3.equals(f));
        System.out.println(a3.equals(a2));
        System.out.println(a3.equals(a));
        System.out.println(ww3.equals(ww2));
        System.out.println(ww3.equals(ww));

        // testing equals with objects of different class (if correct, printed result should all be false)
        System.out.println("================= Testing Equality Between Objects of different Class =================");
        System.out.println(w.equals(t));
        System.out.println(w.equals(m));
        System.out.println(w.equals(tr));
        System.out.println(w.equals(mw));
        System.out.println(w.equals(f));
        System.out.println(w.equals(a));
        System.out.println(w.equals(ww));

        // testing find least and most expensive aircraft
        System.out.println("================= Testing the findLeastAndMostExpensiveAircraft Method =================");
        Object[] arr = {m, t, m, tr, mw, f, a, ww}; // with only 1 aircraft
        Object[] arr2 = {m, t, m, tr, mw, f, a, ww, a2}; // with two aircrafts
        Object[] arr3 = {m, t, m, tr, mw, f, ww}; // with no aircraft

        findLeastAndMostExpensiveAircraft(arr);
        System.out.println("=====");
        findLeastAndMostExpensiveAircraft(arr2);
        System.out.println("=====");
        findLeastAndMostExpensiveAircraft(arr3);
        System.out.println("=====");
    }

    static void findLeastAndMostExpensiveAircraft(Object[] arr){
        boolean noAircraft = true; // start by assuming no aircraft in the array
        double currentLeast = Double.MAX_VALUE; // start with max value as the least expensive aircraft
        double currentMost = Double.MIN_VALUE; // start with min value as the most expensive aircraft

        // to keep track of current least and most expensive aircraft
        String leastExp = "";
        String mostExp = "";

        for (int i=0; i<arr.length; i++){ // go through the array
            String[] curClass = arr[i].getClass().toString().split("\\."); // String array of the class of current object in arr
            if (!curClass[curClass.length-1].equals("Aircraft")){ // if not an aircraft, continue
                continue;
            }
            noAircraft = false; // found an aircraft
            Aircraft temp = (Aircraft) arr[i];
            if (temp.getPrice() <= currentLeast){ // if has smaller price
                currentLeast = temp.getPrice();
                leastExp = temp.toString();
            }
            if (temp.getPrice() >= currentMost){ // if has larger price
                currentMost = temp.getPrice();
                mostExp = temp.toString();
            }
        }

        if(noAircraft){ // if no aircraft in the array, print a message saying so
            System.out.println("There is no aircraft in the array.");
        }else{
            System.out.println("The least expensive aircraft in the array is:");
            System.out.println(leastExp);
            System.out.println("The most expensive aircraft in the array is:");
            System.out.println(mostExp);
        }
    }
}
