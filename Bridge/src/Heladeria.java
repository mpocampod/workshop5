
public abstract class Heladeria {

    // Se define el nombre de la clase abstracta con la interfaz
    protected IMaquinaHelado maquinaHelado;

    // Esto permite crear las maquinas en otras clases
    public Heladeria(IMaquinaHelado mh) {
        maquinaHelado = mh;

    }

    // Se llama al método que está en cada heladeria
    public abstract void hacerHelado();

}
