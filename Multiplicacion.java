public class Multiplicacion extends Operaciones {

    public Multiplicacion(double a, double b) {
        super(a, b);

    }

    public double realizarOperacion() {
        return getA() * getB();
    }
}