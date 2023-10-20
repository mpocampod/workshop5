
public class HeladeriaPequena extends Heladeria {

    // Constructor que llama a la clase padre
    public HeladeriaPequena(IMaquinaHelado mh) {
        super(mh);
    }

    @Override
    // método que dice el tamaño de la heladeria
    // llama al metodo de la máquina que creamos para iniciar el proceso
    // muestra en consola el tipo de helado
    public void hacerHelado() {
        System.out.println("Heladeria pequeña");
        maquinaHelado.startMaquinaHelado();
        System.out.println(maquinaHelado.getHelado());

    }
}