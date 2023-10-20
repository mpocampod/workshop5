
public class ComisionRegular implements Comision {
    @Override
    public double aplicarComision(double monto) {

        return monto * 0.10;
    }
}