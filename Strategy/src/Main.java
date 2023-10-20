public class Main {

    public static void main(String[] args) {

        Comision comision = getEstrategia(1000);
        Contexto contexto = new Contexto(comision);
        System.out.println("Comision para 1000 = " + contexto.ejecutarEstrategia(1000));

        comision = getEstrategia(500);
        contexto = new Contexto(comision);
        System.out.println("Comision for 500 = " + contexto.ejecutarEstrategia(500));

        comision = getEstrategia(100);
        contexto = new Contexto(comision);
        System.out.println("Comision for 100 = " + contexto.ejecutarEstrategia(100));
    }

    private static Comision getEstrategia(double monto) {
        Comision estrategia;
        if (monto >= 1000) {
            estrategia = new ComisionTotal();
        } else if (monto >= 500d && monto <= 999) {
            estrategia = new ComisionNormal();
        } else {
            estrategia = new ComisionRegular();
        }
        return estrategia;
    }
}
