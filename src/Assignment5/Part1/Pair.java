package Assignment5.Part1;

public class Pair <T,P>{
    private T element1;
    private P element2;

    // constructor
    public Pair(T element1, P element2) {
        this.element1 = element1;
        this.element2 = element2;
    }

    // get first element of the pair
    public T getFirst() {
        return element1;
    }

    // get second element of the pair
    public P getSecond() {
        return element2;
    }

    // set first element of the pair
    public void setFirst(T element1) {
        this.element1 = element1;
    }

    // set second element of the pair
    public void setSecond(P element2) {
        this.element2 = element2;
    }

    // String representation
    @Override
    public String toString() {
        return "Pair<" + element1 + "," + element2 + ">";
    }
}
