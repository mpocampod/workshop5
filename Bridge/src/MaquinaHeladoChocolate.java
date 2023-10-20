public class MaquinaHeladoChocolate implements IMaquinaHelado {

    @Override
    public void startMaquinaHelado() {
        System.out.println("Preparando helado de chocolate");

    }

    @Override

    public String getHelado() {
        return "Listo tu helado de chocolate";

    }

}