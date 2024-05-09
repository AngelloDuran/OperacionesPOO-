public class Suma extends Operaciones {

    public Suma(double a, double b) {
        super(a, b);

    }

    public double realizarOperacion() {
        return getA() + getB();
    }
}