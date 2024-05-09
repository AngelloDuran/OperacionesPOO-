
public class MainOperaciones {

    public static void main(String[] args) {
        double num1 = 50;
        double num2 = 13;
        Suma suma = new Suma(num1, num2);
        suma.setA(num1);
        suma.setB(num2);
        System.out.println("Suma:" + suma.realizarOperacion());
        System.out.println("----------------------------------");

        Resta resta = new Resta(num1, num2);
        resta.setA(num1);
        resta.setB(num2);
        System.out.println("Resta" + resta.realizarOperacion());
        System.out.println("----------------------------------");

        Multiplicacion multiplicacion = new Multiplicacion(num1, num2);

        multiplicacion.setA(num1);
        multiplicacion.setB(num2);
        System.out.println("Multiplicacion" + multiplicacion.realizarOperacion());
        System.out.println("----------------------------------");

        Division division = new Division(num1, num2);
        division.setA(num1);
        division.setB(num2);
        System.out.println("Division" + division.realizarOperacion());
        System.out.println("----------------------------------");

        System.out.println(suma.toString());
        System.out.println("----------------------------------");
        System.out.println(resta.toString());
        System.out.println("----------------------------------");

        System.out.println(multiplicacion.toString());
        System.out.println("----------------------------------");

        System.out.println(division.toString());

    }
}