public class Resta extends Operaciones {
    public Resta(double a, double b) {
        super(a, b);
    }

    public double realizarOperacion() {
        return getA() - getB();
    }

}