
public class ComisionNormal implements Comision {
    @Override
    public double aplicarComision(double monto) {

        return monto * 0.30;
    }
}