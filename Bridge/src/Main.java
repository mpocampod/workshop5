class Main {

    public static void main(String[] args) {

        // Se crean las máquinas con el sabor de helado
        MaquinaHeladoVainilla mhVainilla = new MaquinaHeladoVainilla();
        MaquinaHeladoChocolate mhChocolate = new MaquinaHeladoChocolate();

        // Se crean las heladerias y se asigna el sabor al tipo de heladeria
        HeladeriaPequena hpHeladeria = new HeladeriaPequena(mhChocolate);
        HeladeriaMediana hmHeladeria = new HeladeriaMediana(mhVainilla);

        // Se prepara el helado
        hpHeladeria.hacerHelado();
        hmHeladeria.hacerHelado();

    }

}