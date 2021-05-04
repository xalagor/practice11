public class Program1 {
    public static void main(String[] args) {
        DoubleVector vect = new DoubleVector(args.length);
        for (String elem : args) {
            vect.addDouble(Double.parseDouble(elem));
        }
        System.out.println(vect.toString());
    }
}
