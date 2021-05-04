import java.util.ArrayList;

public class DoubleVector {
    ArrayList<Double> arr;

    public DoubleVector(int n) {
        this.arr = new ArrayList<Double>(n);
    }

    public void addDouble(Double a) {
        arr.add(a);
    }

    public String toString() {
        return "Вектор: " + arr.toString();
    }
}
