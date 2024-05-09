public class Division extends Operaciones {
    public Division(double a, double b) {
        super(a, b);
    }

    public double realizarOperacion() {
        return getA() / getB();
    }

}