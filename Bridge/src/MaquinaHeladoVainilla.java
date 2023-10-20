public class MaquinaHeladoVainilla implements IMaquinaHelado {

    @Override
    public void startMaquinaHelado() {
        System.out.println("Preparando helado de vainilla");

    }

    @Override
    public String getHelado() {
        return "Listo tu helado de vainilla";

    }

}
