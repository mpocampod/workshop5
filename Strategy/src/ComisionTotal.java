
public class ComisionTotal implements Comision {

    @Override
    public double aplicarComision(double monto) {

        return monto * 0.50d;
    }
}