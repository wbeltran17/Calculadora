public class Suma {

    private double numero1;
    private double numero2;

    public Suma() {
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double sumar() {
        double result = numero1 + numero2;
        return result;
    }
}
