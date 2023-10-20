public class Contexto {

    private Comision comision;

    public Contexto(Comision comision) {
        this.comision = comision;
    }

    public double ejecutarEstrategia(double monto) {
        return comision.aplicarComision(monto);
    }
}
